import { HttpBackend, HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private url:string = "http://localhost/AJAX/jwt/lista_personas_V1/login.php";
  constructor(private http:HttpClient) {}

  getLogin_perfil(objetoParam:any){
    let pa = JSON.stringify({
      servicio:"inicio_sesion",
      email:objetoParam.email
    });
    return this.http.post<any>(this.url,pa);
  }
}
