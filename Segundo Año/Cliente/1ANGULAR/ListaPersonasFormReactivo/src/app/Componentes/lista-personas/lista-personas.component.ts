import { Component } from '@angular/core';
import { Persona } from '../../Modelos/persona';
import { PAjaxService } from '../../Servicios/p-ajax-service.service';
import { Router, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-lista-personas',
  standalone:true,
  imports: [],
  templateUrl: './lista-personas.component.html',
  styleUrl: './lista-personas.component.css'
})
export class ListaPersonasComponent {
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
    this.ruta.navigate(['addPer',-1])
  }

  editar(persona:Persona){
    this.ruta.navigate(['addPer',persona.ID]);
  }

  ngOnInit(){
  }
}
