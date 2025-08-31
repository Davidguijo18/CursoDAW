import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment.development';
import { HttpClient } from '@angular/common/http';
import { PetType } from '../Models/pet-type';

@Injectable({
  providedIn: 'root'
})
export class PetTypeService {
    private url:string = environment.url;

  constructor(private http:HttpClient) {}

  obtenerPetTypes(){
    let pa = JSON.stringify({
      accion:"ListarPettypes"
    })
    return this.http.post<PetType[]>(this.url,pa);
  }

  modificarPetType(petType:PetType){
    let pa = JSON.stringify({
      accion:"ModificaPettype",
      pettype:petType
    })
    return this.http.post<PetType[]>(this.url,pa);
  }

  eliminarPetType(idPetType:number){
    let pa = JSON.stringify({
      accion:"BorraPettype",
      id:idPetType
    })
    return this.http.post<PetType[]>(this.url,pa);
  }

  anadirPetType(petType:PetType){
    let pa = JSON.stringify({
      accion:"AnadePettype",
      pettype:petType
    })
    return this.http.post<PetType>(this.url,pa);
  }
}
