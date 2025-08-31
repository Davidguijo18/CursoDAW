import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Owner } from '../../Models/owner';
import { OwnerService } from '../../Services/owner.service';
import { ActivatedRoute, Router, RouterLink } from '@angular/router';
import { FormBuilder } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { FormGroup } from '@angular/forms';
import { Validators } from '@angular/forms';


@Component({
  selector: 'app-form-owner',
  imports: [FormsModule,RouterLink,ReactiveFormsModule],
  templateUrl: './form-owner.component.html',
  styleUrl: './form-owner.component.sass'
})
export class FormOwnerComponent {
  public owner:Owner = <Owner>{}
  public listaOwners:Owner[] = [];
  public textoBoton:string = "";
  public textoH4:string = "";
  public textoP:string = "";
  public form:FormGroup; //Declaro la variable form de tipo FormGroup

  constructor(private peticion:OwnerService, private ruta:Router, private route:ActivatedRoute, private fb:FormBuilder){
    this.form = this.fb.group({
      //Declaramos los diferentes campos del formulario
      //El primer parametro es el contenido por defecto que va a salir, el segundo que es requerido y el tercero (opcional) el límite de longitud
      id:this.fb.control('-1'),
      firstName: this.fb.control('',[Validators.required, Validators.minLength(2)]),
      lastName: this.fb.control('',[Validators.required, Validators.minLength(4)]),
      address: this.fb.control('',[Validators.required, Validators.minLength(5)]),
      city: this.fb.control('',[Validators.required, Validators.minLength(2)]),
      telephone: this.fb.control('',[Validators.required, Validators.minLength(9),Validators.maxLength(9)]),
    });
  }

  ngOnInit(){
    const id = this.route.snapshot.params["id"]

    if(id == -1){
      this.textoBoton = "Añadir";
      this.textoH4 = "Nuevo owner";
      this.textoP = "Añadir un nuevo owner";
    }else{
      this.textoBoton = "Modificar";
      this.textoH4 = "Modificar owner";
      this.textoP = "Modificar a un owner";

      this.peticion.obtenerOwner(id).subscribe({
        next: res =>{
          this.owner = res
          this.form.patchValue(res);
        },
        error: error =>{console.log("Error al obtener el id del owner: ",error)}
      })
    }
  }

  listadoOwners(){
    this.peticion.listarOwners().subscribe({
      next: res=>{
        this.listaOwners = res
      },
      error: error=> console.log("Error al obtener el listado de owners: ",error)
    })
  }

  anadir(){
    //const id = this.route.snapshot.params["id"]
    console.log("Datos del formulario: ",this.form.value);

    if(this.form.value.id == -1){
      this.peticion.anadir(this.form.value).subscribe({
        next: res =>{
          console.log("Se ha añadido al owner", res);
          this.listadoOwners();
          this.ruta.navigate([""]);
        },
        error: error=>console.log("Error al añadir owner: ",error)
      });
    }else{
      this.peticion.editar(this.form.value).subscribe({
        next: res =>{
          console.log("Se ha editado al owner", res);
          this.listadoOwners();
          this.ruta.navigate([""]);
        },
        error: error=>console.log("Error al editar el owner: ",error)
      });
    }
  }  
}