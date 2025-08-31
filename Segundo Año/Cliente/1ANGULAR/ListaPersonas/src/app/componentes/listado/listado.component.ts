import { Component } from '@angular/core';
import { PAjaxService } from '../../servicios/p-ajax.service';
import { Router } from '@angular/router';//Para poder navegar de forma programática
import { Persona } from '../../modelos/persona';

@Component({
  selector: 'app-listado',
  standalone: false,
  
  templateUrl: './listado.component.html',
  styleUrl: './listado.component.css'
})

/*Crear proyecto no standalone: ng g <nombre> --no-standalone*/
export class ListadoComponent {
  public listaPersonas:Persona[] = [];

  constructor(private peticion:PAjaxService, private ruta:Router){
    this.peticion.listar().subscribe(datos =>{
      console.log("Tamos en el constructor ",datos);
      this.listaPersonas = datos;
    });

  }

  borrar(persona:Persona){
    if(confirm("¿Deseas eliminar a " + persona.NOMBRE + " ?")){
      console.log("Se va a eliminar a " + persona.NOMBRE+ " con ID: "+ persona.ID);
      this.peticion.borrarPersona(persona.ID).subscribe(datos=>{
        this.listaPersonas = datos;
      });
    }
  }

  irANuevaPersona(){
    //Para navegar al otro componente, el primer dato es donde viajas y el segundo el parametro del ID
    this.ruta.navigate(['personas-add',-1])
  }

  editar(persona:Persona){
    this.ruta.navigate(['personas-add',persona.ID]);
  }

  ngOnInit(){
  }
}
