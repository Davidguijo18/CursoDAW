import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Persona } from '../modelos/persona';

@Injectable({
  providedIn: 'root'
})
export class PAjaxService {
  private url:string = "http://localhost/AJAX/lista_personas/servidor.php";

  constructor(private http:HttpClient) {}

  listar(){
    let pa = JSON.stringify({
      servicio:"listar",
    });

    return this.http.post<Persona[]>(this.url,pa);
  }

  borrarPersona(idPersona:number){
    let pa = JSON.stringify({
      servicio:"borrar",
      id: idPersona
    })

    return this.http.post<Persona[]>(this.url,pa);
  }

  insertar(persona:Persona){
    //Aqui lo hacemos clonando el objeto
    let pa = JSON.parse(JSON.stringify(persona));
    //Le añado el atributo servicio
    pa.servicio = "insertar";
    console.log(pa);

    return this.http.post<Persona[]>(this.url, JSON.stringify(pa));
    

    /* Esta es una forma de hacerlo
    let pa = JSON.stringify({
      servicio:"insertar",
      dni:persona.DNI,
      nombre:persona.NOMBRE,
      apellidos:persona.APELLIDOS
    })

    return this.http.post<Persona[]>(this.url,pa);*/
  }

  obtenerPersona(idPersona:number){
    let pa = JSON.stringify({
      servicio:"selPersonaID",
      id: idPersona
    })

    return this.http.post<Persona>(this.url,pa);
  }

  modificar(persona:Persona){
    let pa = JSON.parse(JSON.stringify(persona));
    pa.servicio = "modificar";
    console.log("Estoy en modificar: ",pa);
    return this.http.post<Persona[]>(this.url,JSON.stringify(pa));
  }
}
