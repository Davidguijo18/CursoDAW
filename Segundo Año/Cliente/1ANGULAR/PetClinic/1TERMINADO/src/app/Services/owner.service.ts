import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment.development';
import { Owner } from '../Models/owner';
import { Pets } from '../Models/pets';

@Injectable({
  providedIn: 'root'
})
export class OwnerService {
  private url:string = environment.url;

  constructor(private http:HttpClient) {}

  listarOwners(){
    let pa = JSON.stringify({
      accion:"ListarOwners"
    })

    return this.http.post<Owner[]>(this.url,pa);
  }

  anadir(ownerObjeto:Owner){

    let pa = JSON.stringify({
      accion:"AnadeOwner",
      owner:ownerObjeto
    })
    return this.http.post<Owner[]>(this.url,pa);
  }

  eliminar(idOwner:number){
    let pa = JSON.stringify({
      accion:"BorraOwner",
      id:idOwner,
      listado:"OK"
    })
    console.log("Antes de eliminar: ",pa)
    return this.http.post<Owner[]>(this.url,pa);
  }

  obtenerOwner(idOwner:number){
    let pa= JSON.stringify({
      accion:"ObtenerOwnerId",
      id:idOwner
    })
    return this.http.post<Owner>(this.url,pa);
  }

  ObtenerOwnerId_Pets(id:number){
    console.log("Estamos listado pets de owner");
    console.log("Pa", id);
    
    let objOwner={
      accion:"ObtenerOwnerId_Pets",
      id:id
    }
    return this.http.post<Owner>(this.url,JSON.stringify(objOwner));

  }

  editar(ownerObjeto:Owner){
    let pa = JSON.stringify({
      accion:"ModificaOwner",
      owner:ownerObjeto
    })
    return this.http.post<Owner[]>(this.url,pa);
  }
}
