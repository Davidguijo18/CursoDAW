import { Component } from '@angular/core';
import { Vets } from '../../Models/vets';
import { VetService } from '../../Services/vet.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-vets',
  imports: [],
  templateUrl: './vets.component.html',
  styleUrl: './vets.component.css'
})
export class VetsComponent {
  public listaVets:Vets[] = [];
  
    constructor(private peticion:VetService, private ruta:Router){}
  
    ngOnInit(){
      this.listadoVets();
    }
  
    listadoVets(){
      this.peticion.listarVeterinarios().subscribe({
        next: res=>{
          this.listaVets = res
        },
        error: error=> console.log("Error al obtener el listado de veterinarios: ",error)
      })
    }
  
    eliminarVet(vet:Vets){
      if(confirm("¿Desea eliminar a " + vet.firstName + " " + vet.lastName + " ?")){
        this.peticion.eliminarVeterinario(vet.id).subscribe({
          next: res=>{
            this.listaVets = res
          },
          error: error => console.log("Error al eliminar al veterinario: ",error)
        })
      }
      this.listadoVets();
    }
    
    viajarFormAnadirVet(){
      this.ruta.navigate(["formVet",-1])
    }
  
    viajarFormEditarVet(id:number){
      this.ruta.navigate(["formVet",id])
    }
}
