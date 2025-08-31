import { Component } from '@angular/core';
import { Owner} from '../../Models/owner';
import { ActivatedRoute } from '@angular/router';
import { OwnerService } from '../../Services/owner.service';
import { Router,RouterLink } from '@angular/router';
import { PetListComponent } from "../pet-list/pet-list.component";

@Component({
  selector: 'app-owner-details',
  imports: [RouterLink, PetListComponent],
  templateUrl: './owner-details.component.html',
  styleUrl: './owner-details.component.css'
})
export class OwnerDetailsComponent {
  public owner: Owner = <Owner>{};

  constructor(private peticion: OwnerService, private ruta: Router, private route: ActivatedRoute) {}

  ngOnInit() {
    const idOwner = this.route.snapshot.params["idOwner"];

    this.peticion.ObtenerOwnerId_Pets(idOwner).subscribe({
      next: res => {
        this.owner = res;
        console.log("Respuesta del servidor: ",res);
        console.log("Mascotas del ownerr: ",res.pets);
      },
      error: error => {
        console.log("Error al obtener el id del owner: ", error);
      }
    });
  }

  eliminarOwner(owner: Owner) {
    if (confirm("¿Desea eliminar a " + owner.firstName + " " + owner.lastName + " ?")) {
      this.peticion.eliminar(owner.id).subscribe({
        next: () => {
          console.log("Se ha eliminado al owner");
          this.ruta.navigate([""]);
        },
        error: error => console.log("Error al eliminar al owner: ", error)
      });
    }
  }

  borrarPet(idPet:number){
    console.log(`Mascota con ID ${idPet} eliminada`);
    this.owner.pets = this.owner.pets.filter(pet => pet.id !== idPet);
  }
}
