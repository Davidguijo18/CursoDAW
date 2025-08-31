import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Departamentos } from '../Modelos/departamentos';

@Injectable({
  providedIn: 'root'
})
export class PAjaxServiceService {
  private url:string = "http://localhost/ajax/departamentos_profesores/deptosProfes.php";

  constructor( private http:HttpClient) {}

  listarDepartamentos(){
    let pa = JSON.stringify({
      servicio:"departamentos"
    })
    
    return this.http.post<any>(this.url,pa);
  }
}
