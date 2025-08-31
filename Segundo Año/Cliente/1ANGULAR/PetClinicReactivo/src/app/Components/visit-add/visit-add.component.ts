import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { PetService } from '../../Services/pet.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Pets } from '../../Models/pets';
import { Visit } from '../../Models/visit';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-visit-add',
  imports: [FormsModule,RouterLink],
  templateUrl: './visit-add.component.html',
  styleUrl: './visit-add.component.css'
})
export class VisitAddComponent {

  public idPet = 0;
  public esEditar = 0;
  public idVisita = 0;
  public pet:Pets = <Pets>{};
  public visit:Visit = <Visit>{};
  public textoForm = "";
  public textoBoton = "";

  constructor(private peticion:PetService,private ruta:Router, private route:ActivatedRoute){
    this.idPet = this.route.snapshot.params["petId"];
    this.esEditar = this.route.snapshot.params["esEditar"];
    this.idVisita = this.route.snapshot.params["idVisita"]
  }

  ngOnInit(){
    console.log("Valor de esEditar: ",this.esEditar)
    this.peticion.obtenerPetId(this.idPet).subscribe({
      next: res=>{
        this.pet = res;
        console.log("Pet obtenida por su id: ",res);
      },
      error: error=>{console.log("Error al obtener el pet por su ID: ",error)}
    })

    if(this.esEditar == -1){
      this.textoForm = "Añadir visita";
      this.textoBoton = "Añadir";
    }else{
      this.textoForm = "Modificar visita";
      this.textoBoton = "Modificar";

      this.peticion.obtenerVisitaId(this.idVisita).subscribe({
        next: res=>{
          this.visit = res;
        },
        error: error=>{console.log("Error al obtener la viista: ",error)}
      })
    }  
  }

  onSubmit(){
    if(this.esEditar == -1){
      this.peticion.anadirVisita(this.pet.id,this.visit).subscribe({
        next: res=>{
          console.log("Visita añadida: ",res);
          this.ruta.navigate(["detailOwner",this.pet.owner.id]);
        },
        error: error =>{console.log("Error al añadir la visita: ",error)}
      })
    }else{
      this.peticion.modificarVisita(this.pet.id,this.visit).subscribe({
        next: res=>{
          console.log("Visita modificada: ",res);
          this.ruta.navigate(["detailOwner",this.pet.owner.id]);
        },
        error: error =>{console.log("Error al modificar la visita: ",error)}
      })
    }  
  }
}
