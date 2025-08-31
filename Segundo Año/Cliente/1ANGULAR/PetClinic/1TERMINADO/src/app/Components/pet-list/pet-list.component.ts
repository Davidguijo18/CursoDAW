import { Component } from '@angular/core';
import { Pets } from '../../Models/pets';
import { PetService } from '../../Services/pet.service';
import { RouterLink } from '@angular/router';
import { Input } from '@angular/core';
import { Output } from '@angular/core';
import { EventEmitter } from '@angular/core';
import { VisitListComponent } from "../visit-list/visit-list.component";
import { Visit } from '../../Models/visit';

@Component({
  selector: 'app-pet-list',
  imports: [RouterLink, VisitListComponent],
  templateUrl: './pet-list.component.html',
  styleUrl: './pet-list.component.css'
})
export class PetListComponent {
  @Input() pets:Pets[] = [];
  @Input() nombreOwner:string ="";
  @Input() idOwner:number = 0;
  @Output() eliminaPet = new EventEmitter<number>();
  public visitasPet:Visit[] = [];

  constructor(private peticion: PetService) {}

  ngOnInit(){
     console.log("Obtengo los pets en el onInit: ",this.pets);
  }

  eliminarPet(petId:number,petNombre:string) {
    if (confirm("¿Desea eliminar a " + petNombre + " ?")) {
      this.peticion.eliminarPet(petId).subscribe({
        next: () => {
          console.log("Se ha eliminado a la mascota");
          this.eliminaPet.emit(petId);
        },
        error: error => console.log("Error al eliminar la mascota: ", error)
      });
    }
  }

  visitaEliminar(idVisita: number) {
    console.log(`Visita con ID ${idVisita} eliminada`);
  
    // Itera sobre las mascotas para encontrar la visita eliminada
    this.pets.forEach(pet => {
      if (pet.visits) {
        pet.visits = pet.visits.filter(visit => visit.id !== idVisita); // Filtra la lista de visitas
      }
    });
  }
}
