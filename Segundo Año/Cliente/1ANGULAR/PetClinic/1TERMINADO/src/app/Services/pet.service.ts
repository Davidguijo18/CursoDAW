import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment.development';
import { HttpClient } from '@angular/common/http';
import { Pets } from '../Models/pets';
import { Owner } from '../Models/owner';
import { PetType } from '../Models/pet-type';
import { Visit } from '../Models/visit';
import { retry } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PetService {
  private url:string = environment.url;

  constructor(private http:HttpClient) {}

  obtenerOwner(idOwner:number){
      let pa= JSON.stringify({
        accion:"ObtenerOwnerId",
        id:idOwner
      })
      return this.http.post<Owner>(this.url,pa);
    }

    obtenerPets(idOwner:number){
      let pa = JSON.stringify({
        accion:"ListarPetsOwnerId",
        id:idOwner
      })
      return this.http.post<Pets[]>(this.url,pa);
    }

  anadirPet(petObject:Pets, ownerId:number){
    let obj = {
      name:petObject.name,
      birthDate: petObject.birthDate, 
      type: { id: petObject.type.id },  
      owner: { id: ownerId }
    };

    let objPet={
      accion:"AnadePet",
      pet:obj
    }

    console.log("Esto es lo que le mando al añadir un pet", objPet);
    return this.http.post(this.url, objPet);
  }

  editarPet(petObject:Pets, ownerId:number, idPet:number){
    let obj = {
      name:petObject.name,
      birthDate: petObject.birthDate, 
      type: { id: petObject.type.id },  
      owner: { id: ownerId },
      id:idPet
    };

    let objPet={
      accion:"ModificaPet",
      pet:obj
    }

    console.log("Esto es lo que le mando al editar un pet", objPet);
    return this.http.post(this.url, objPet);
  }

  eliminarPet(idPet:number){
    let pa = JSON.stringify({
      accion:"BorraPet",
      id:idPet,
      listado:"OK"
    })
    return this.http.post<Pets[]>(this.url,pa);
  }

  obtenerPetTypes(){
    let pa = JSON.stringify({
      accion:"ListarPettypes"
    })
    return this.http.post<PetType[]>(this.url,pa);
  }

  obtenerPetId(idPet:number){
    let pa = JSON.stringify({
      accion:"ObtenerPetId",
      id:idPet
    })
    return this.http.post<Pets>(this.url,pa);
  }

  obtenerVisitas(petId:number){
    let pa = JSON.stringify({
      accion:"ListarVisitasPet",
      id:petId
    })
    return this.http.post<Pets>(this.url,pa);
  }

  anadirVisita(idPet:Number,visit:Visit){
    let obj = {
      petId:idPet,
			visitDate:visit.visitDate,
			description:visit.description
    };
    let objVisit={
      accion:"AnadeVisit",
      visit:obj
    }

   console.log("esto es lo que le mando al servicio", objVisit);
    return this.http.post(this.url, objVisit);
  }

  eliminarVisita(idVisita:number){
    let pa = JSON.stringify({
      accion:"BorraVisit",
      id: idVisita
    })
    return this.http.post<Visit[]>(this.url,pa);
  }

  obtenerVisitaId(idVisita:number){
    let pa= JSON.stringify({
      accion:"ObtenerVisitId",
      id:idVisita
    })
    return this.http.post<Visit>(this.url,pa);
  }

  modificarVisita(idPet:number, visit:Visit){
    let obj = {
      petId:idPet,
			visitDate:visit.visitDate,
			description:visit.description,
      id:visit.id
    };
    let objVisit={
      accion:"ModificaVisit",
      visit:obj
    }
    return this.http.post(this.url, objVisit);
  }
}
