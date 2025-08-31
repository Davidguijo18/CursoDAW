import { Component } from '@angular/core';
import { arrRemove } from 'rxjs/internal/util/arrRemove';

@Component({
  selector: 'app-g-hobbit',
  standalone: false,
  
  templateUrl: './g-hobbit.component.html',
  styleUrl: './g-hobbit.component.css'
})
export class GHobbitComponent {
  public lista:string[];
  public gHobbit:string;
  public gHobbitMod:string;
  private accion:{id:number, nombre:string, indice:number};

  constructor(){
    this.lista = ["Sam Gamyi", "Frodo Bolson", "Pippin Paladin", "Rosita Coto", "Merry Brandigamo", "Bilbo Bolson"];
    this.gHobbit = "";
    this.gHobbitMod = "";
    this.accion = {id:1, nombre:"Añadir", indice:-1}
  }

  eliminar(hobbit:string, i:number){
    if(confirm("¿Deseas eliminar a " + hobbit + "?")){
        this.lista.splice(i,1);
    } 
  }

  editar(hobbit:string, i:number){
    this.gHobbitMod = hobbit;
  }

  modificar(){

  }

  anadir(){
    console.log("gHobbit: ",this.gHobbit);
    if(this.gHobbit != ""){
      this.lista.push(this.gHobbit);
      this.gHobbit = "";
    }
  }
}
