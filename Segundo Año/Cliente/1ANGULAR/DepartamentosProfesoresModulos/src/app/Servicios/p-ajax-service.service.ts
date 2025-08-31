import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Departamentos } from '../Modelos/departamentos';
import { Profesores } from '../Modelos/profesores';

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
    
    return this.http.post<Departamentos[]>(this.url,pa);
  }

  anadirDepartamento(departamento:Departamentos){
    let pa = JSON.parse(JSON.stringify(departamento))
    pa.servicio = "anadeDepto"
    return this.http.post<Departamentos[]>(this.url,JSON.stringify(pa));
  }

  listarProfesores(idDep:number){
    let pa = JSON.stringify({
      servicio:"profesores",
      id_departamento: idDep
    })
    
    return this.http.post<Profesores[]>(this.url,pa);
  }

  //Tengo que pasar el parametro del id del departamento para que se haga correctamente
  eliminarProfesor(idProfesor:number,idDep:number){
    let pa = JSON.stringify({
      servicio:"eliminaProfe",
      id:idProfesor,
      id_departamento: idDep
    })

    return this.http.post<Profesores[]>(this.url,pa);
  }

  seleccionarProfesor(idProfesor:number){
  let pa = JSON.stringify({
    servicio:"selProfeID",
    id:idProfesor
  })

  return this.http.post<Profesores>(this.url,pa);
  }

  modificarProfesor(profesor:Profesores, idDep:number){
    let pa = JSON.parse(JSON.stringify(profesor))
    pa.id_departamento = idDep
    pa.servicio = "modificaProfe"
    return this.http.post<Profesores[]>(this.url,JSON.stringify(pa));
  }

  anadirProfesor(profesor:Profesores, idDep:number){
    let pa = JSON.parse(JSON.stringify(profesor))
    pa.id_departamento = idDep
    pa.servicio = "anadeProfe"
    return this.http.post<Profesores[]>(this.url,JSON.stringify(pa));
  }
}
