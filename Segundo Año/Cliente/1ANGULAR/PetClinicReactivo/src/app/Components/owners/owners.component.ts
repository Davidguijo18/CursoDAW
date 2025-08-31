import { Component } from '@angular/core';
import { Owner } from '../../Models/owner';
import { OwnerService } from '../../Services/owner.service';
import { Router } from '@angular/router';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-owners',
  imports: [RouterLink],
  templateUrl: './owners.component.html',
  styleUrl: './owners.component.css'
})
export class OwnersComponent {
  public listaOwners:Owner[] = [];

  constructor(private peticion:OwnerService, private ruta:Router){}

  ngOnInit(){
    this.listadoOwners();
  }

  listadoOwners(){
    this.peticion.listarOwners().subscribe({
      next: res=>{
        this.listaOwners = res
      },
      error: error=> console.log("Error al obtener el listado de owners: ",error)
    })
  }

  eliminarOwner(owner:Owner){
    if(confirm("¿Desea eliminar a " + owner.firstName + " " + owner.lastName + " ?")){
      this.peticion.eliminar(owner.id).subscribe({
        next: res=>{
          this.listaOwners = res
        },
        error: error => console.log("Error al eliminar al owner: ",error)
      })
    }
    this.listadoOwners();
  }
  
  viajarFormAnadirOwner(){
    this.ruta.navigate(["formOwner",-1])
  }

  viajarFormEditarOwner(id:number){
    this.ruta.navigate(["formOwner",id])
  }
}
