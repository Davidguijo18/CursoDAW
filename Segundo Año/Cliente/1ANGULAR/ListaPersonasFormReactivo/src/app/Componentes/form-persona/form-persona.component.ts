import { Component } from '@angular/core';
import { Persona } from '../../Modelos/persona';
import { PAjaxService } from '../../Servicios/p-ajax-service.service';
import { Router,ActivatedRoute, RouterLink } from '@angular/router';
import { FormBuilder, FormGroup, FormsModule, Validators } from '@angular/forms';   //Indispensable para poder hacer los formularios. Importar FormGroup y FormBuilder
import { ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-form-persona',
  standalone:true,
  imports: [FormsModule,ReactiveFormsModule,RouterLink],   //Indispensable para poder hacer los formularios
  templateUrl: './form-persona.component.html',
  styleUrl: './form-persona.component.css'
})
export class FormPersonaComponent {
  public persona:Persona = <Persona>{};
  public textBoton:string;
  public form:FormGroup; //Declaro la variable form de tipo FormGroup

  constructor(private peticion:PAjaxService, private ruta:Router, private route:ActivatedRoute, private fb:FormBuilder){//Meter fb:FormBuilder en el constructor
    //Inicializo el formulario
    this.form = this.fb.group({
        //Declaramos los diferentes campos del formulario
        //El primer parametro es el contenido por defecto que va a salir, el segundo que es requerido y el tercero (opcional) el límite de longitud
        id:this.fb.control('-1'),
        dni: this.fb.control('',[Validators.required, Validators.minLength(9)]),
        nombre: this.fb.control('',[Validators.required, Validators.minLength(2)]),
        apellidos: this.fb.control('',[Validators.required, Validators.minLength(8)]),
    });
    this.textBoton = "AÑADIR"
  }

  ngOnInit() {
    const personaID = this.route.snapshot.params['id'];
    if (personaID == -1) {
        this.textBoton = "Añadir";
    } else {
        this.textBoton = "Modificar";
        // Cargar los datos de la persona para edición
        this.peticion.obtenerPersona(personaID).subscribe({
            next: res => this.form.patchValue(res),
            error: error => console.log("Error al obtener persona: ", error)
        });
    }
}

enviar() {
    console.log("Datos del formulario: ",this.form.value);

    if (this.form.value.id == -1) {
        this.peticion.insertar(this.form.value).subscribe({
            next: res => {
                console.log("Persona añadida:", res);
            },
            error: error => console.log("Error al añadir persona: ", error)
        });
        this.peticion.listar().subscribe();
        this.ruta.navigate(['']);
    } else {
        this.peticion.modificar(this.form.value).subscribe({
            next: res => {
                console.log("Persona modificada:", res);
            },
            error: error => console.log("Error al modificar persona: ", error)
        });
        this.peticion.listar().subscribe();
        this.ruta.navigate(['']);
    }
}
}
