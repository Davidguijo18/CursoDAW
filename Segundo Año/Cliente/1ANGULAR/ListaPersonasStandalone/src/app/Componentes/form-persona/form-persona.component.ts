import { Component } from '@angular/core';
import { Persona } from '../../Modelos/persona';
import { PAjaxService } from '../../Servicios/p-ajax-service.service';
import { Router,ActivatedRoute } from '@angular/router';
import { FormsModule } from '@angular/forms';   //Indispensable para poder hacer los formularios

@Component({
  selector: 'app-form-persona',
  standalone:true,
  imports: [FormsModule],   //Indispensable para poder hacer los formularios
  templateUrl: './form-persona.component.html',
  styleUrl: './form-persona.component.css'
})
export class FormPersonaComponent {
  public persona:Persona = <Persona>{};
  public textBoton:string;

  constructor(private peticion:PAjaxService, private ruta:Router, private route:ActivatedRoute){
    this.persona = {
      ID: -1,
      DNI:"",
      NOMBRE:"",
      APELLIDOS:""
    }
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
            next: res => {
                this.persona = res;
            },
            error: error => console.log("Error al obtener persona: ", error)
        });
    }
}

enviar() {
    const personaID = this.route.snapshot.params['id'];

    if (personaID == -1) {
        this.peticion.insertar(this.persona).subscribe({
            next: res => {
                console.log("Persona añadida:", res);
            },
            error: error => console.log("Error al añadir persona: ", error)
        });
        this.peticion.listar().subscribe();
        this.ruta.navigate(['']);
    } else {
        this.peticion.modificar(this.persona).subscribe({
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
