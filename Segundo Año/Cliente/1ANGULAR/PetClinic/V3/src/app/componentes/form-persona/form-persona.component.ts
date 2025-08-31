import { Component, numberAttribute } from '@angular/core';
import { Persona } from '../../modelos/persona';
import { PAjaxService } from '../../servicios/p-ajax.service';
import { ActivatedRoute, Router } from '@angular/router';
import { NgForm, NgModel } from '@angular/forms';
import { NgFor } from '@angular/common';

@Component({
  selector: 'app-form-persona',
  standalone: false,
  
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

  enviar(){
    const personaID = this.route.snapshot.params["id"];
    console.log("Persona id: ",personaID);


    if(personaID == -1){
      console.log("Estoy dentro de añadir");
      this.textBoton = "Añadir"
      this.peticion.insertar(this.persona).subscribe({
        next:res =>{
          console.log(res);
          console.log("Se ha añadido a la persona ",this.persona);
        },
        error: error => console.log("Error: ",error)
      })
      this.ruta.navigate([''])

    }else{
      console.log("Estoy dentro de modificar");
      this.textBoton = "Modificar";
      this.peticion.obtenerPersona(personaID).subscribe({
        next:res =>{
          console.log(res);
          this.persona = res;
        },
        error: error => console.log("Error: ",error)
      });
    }
  }
}
