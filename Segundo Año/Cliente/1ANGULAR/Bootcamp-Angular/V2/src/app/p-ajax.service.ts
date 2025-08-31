import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PAjaxService {
  private url:string = "http://localhost/ajax/petclinic/servicios.php";

  constructor(private http:HttpClient) {}

  getOwners(){
      let cuerpo = {
        accion:"ListarOwners",
      };

      return this.http.post<any>(this.url,cuerpo);
  }
}
