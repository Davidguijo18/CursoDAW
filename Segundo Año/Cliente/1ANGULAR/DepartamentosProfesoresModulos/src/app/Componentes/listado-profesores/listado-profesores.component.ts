import { Component } from '@angular/core';
import { Profesores } from '../../Modelos/profesores';
import { PAjaxServiceService } from '../../Servicios/p-ajax-service.service';
import { ActivatedRoute, Route, Router } from '@angular/router';

@Component({
  selector: 'app-listado-profesores',
  standalone: false,
  
  templateUrl: './listado-profesores.component.html',
  styleUrl: './listado-profesores.component.css'
})
export class ListadoProfesoresComponent {
  public listaProfesores:Profesores[] = [];
  public nombreDepartamento:string = "";

  constructor(private peticion:PAjaxServiceService, private ruta:Router, private route:ActivatedRoute){}

  ngOnInit(){
    const idDepartamento = this.route.snapshot.params["idDep"]
    this.nombreDepartamento = this.route.snapshot.params["nombre"];
    this.peticion.listarProfesores(idDepartamento).subscribe({
      next: res=>{
          this.listaProfesores = res;
      },
      error: error=> console.log("Error al obtener los departamentos: ",error)
    })
  }

  eliminarProfesor(profesor:Profesores){
    //Tengo que pasar el parametro del id del departamento para que se haga correctamente
    const idDepartamento = this.route.snapshot.params["idDep"];
    if(confirm("¿Realmente desea eliminar a " + profesor.nombre + " " + profesor.apellidos + " ?")){
      this.peticion.eliminarProfesor(profesor.id,idDepartamento).subscribe({
        next: res=>{
          this.listaProfesores = res
        },
        error: error=> console.log("Error al eliminar al profesor: ",error)
      })
    }
    }

    viajarFormularioAnadir(){
      const idDepartamento = this.route.snapshot.params["idDep"];
      this.ruta.navigate(["formProfe",-1,idDepartamento]);
    }

    viajarFormularioModificar(profesor:Profesores){
      const idDepartamento = this.route.snapshot.params["idDep"];
      this.ruta.navigate(["formProfe",profesor.id,idDepartamento]);
    }
}
