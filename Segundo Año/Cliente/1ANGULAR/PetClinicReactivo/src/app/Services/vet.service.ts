import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment.development';
import { HttpClient } from '@angular/common/http';
import { Vets } from '../Models/vets';

@Injectable({
  providedIn: 'root'
})
export class VetService {
   private url:string = environment.url;

  constructor(private http:HttpClient) {}

  listarVeterinarios(){
    let pa = JSON.stringify({
      accion:"ListarVets"
    })
    return this.http.post<Vets[]>(this.url,pa);
  }

  eliminarVeterinario(idVet:number){
    let pa = JSON.stringify({
      accion:"BorraVet",
      id:idVet
    })
    return this.http.post<Vets[]>(this.url,pa);
  }

  anadirVeterinario(){

  }
}
