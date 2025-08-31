import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment.development';
import { HttpClient } from '@angular/common/http';
import { Speciality } from '../Models/speciality';

@Injectable({
  providedIn: 'root'
})
export class SpecialtyService {
    private url:string = environment.url;

  constructor(private http:HttpClient) {}

  listarSpecialities(){
    let pa = JSON.stringify({
      accion:"ListarSpecialties"
    })
    return this.http.post<Speciality[]>(this.url,pa);
  }

  anadirSpeciality(objSpeciality:Speciality){
    let pa = JSON.stringify({
      accion:"AnadeSpecialty",
      specialty:objSpeciality
    })
    return this.http.post<Speciality>(this.url,pa);
  }

  modificarSpeciality(objSpeciality:Speciality){
    let pa = JSON.stringify({
      accion:"ModificaSpecialty",
      specialty:objSpeciality
    })
    return this.http.post<Speciality[]>(this.url,pa);
  }

  eliminarSpeciality(idSpec:number){
    let pa = JSON.stringify({
      accion:"BorraSpecialty",
      id:idSpec
    })
    return this.http.post<Speciality[]>(this.url,pa);
  }
}
