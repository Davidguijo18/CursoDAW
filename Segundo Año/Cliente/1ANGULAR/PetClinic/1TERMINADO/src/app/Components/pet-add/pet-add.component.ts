import { Component } from '@angular/core';
import { Pets } from '../../Models/pets';
import { PetService } from '../../Services/pet.service';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Owner } from '../../Models/owner';
import { CommonModule } from '@angular/common';
import { PetType } from '../../Models/pet-type';
import { RouterLink } from '@angular/router';
import { PettypeListComponent } from "../pettype-list/pettype-list.component";

@Component({
  selector: 'app-pet-add',
  imports: [CommonModule, FormsModule, RouterLink],
  templateUrl: './pet-add.component.html',
  styleUrl: './pet-add.component.css'
})
export class PetAddComponent {
  public owner: Owner = <Owner>{};
  public pet: Pets = <Pets>{ owner: this.owner, type: {} };
  public listaPetTypes: PetType[] = [];
  public textoBoton: string = "";
  public textoH4: string = "";
  public textoP: string = "";

  constructor(private peticion: PetService, private ruta: Router, private route: ActivatedRoute) {}

  ngOnInit() {
    const idPet = this.route.snapshot.params["idPet"];
    const idOwner = this.route.snapshot.params["idOwner"];
    console.log("ID del dueño obtenido de la URL:", idOwner);

    this.peticion.obtenerOwner(idOwner).subscribe({
      next: (res) => {
        this.owner = res;
        this.pet.owner = res;
        console.log("Dueño obtenido:", res);
      },
      error: (error) => {
        console.log("Error al obtener el dueño:", error);
      }
    });

    this.peticion.obtenerPetTypes().subscribe({
      next: res => {
        this.listaPetTypes = res;
        console.log("Respuesta de obtenerPetTypes: ", res);
      },
      error: error => {
        console.log("Error al obtener los tipos de pets: ", error);
      }
    });

    if(idPet == "-1"){
      this.textoBoton = "Añadir";
      this.textoH4 = "Nueva mascota";
      this.textoP = "Añadir una nueva mascota";
    }else{
      this.textoBoton = "Editar";
      this.textoH4 = "Modificar mascota";
      this.textoP = "Modificar una mascota";

      this.peticion.obtenerPetId(idPet).subscribe({
        next: res=>{
          console.log("Datos del pet obtenidos: ",res);
          this.pet = res;
        },
        error: error =>{console.log("Error al obtener el pet por su ID: ",error)}
      })
    }
  }

  anadirPet() {
    const idPet = this.route.snapshot.params["idPet"];
    const idOwner = this.route.snapshot.params["idOwner"];
    if(idPet == "-1"){
      console.log("Id del owner: ", this.owner.id);
      console.log("Datos de la mascota a añadir:", this.pet);

      this.peticion.anadirPet(this.pet, this.owner.id).subscribe({
        next: (res) => {
          console.log("Se ha añadido una nueva mascota: ", res);
          this.ruta.navigate(["/detailOwner", this.owner.id]);
        },
        error: (error) => {
          console.log("Error al añadir una nueva mascota:", error);
        }
      });
    }else{
      this.peticion.editarPet(this.pet,idOwner,idPet).subscribe({
        next: (res) => {
          console.log("Se ha editado la mascota: ", res);
          this.ruta.navigate(["/detailOwner", this.owner.id]);
        },
        error: (error) => {
          console.log("Error al editar una mascota:", error);
        }
      })
    }
  }
}