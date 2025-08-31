import { Component } from '@angular/core';
import { Profesores } from '../../Modelos/profesores';
import { PAjaxServiceService } from '../../Servicios/p-ajax-service.service';
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-form-profesores',
  standalone: false,
  
  templateUrl: './form-profesores.component.html',
  styleUrl: './form-profesores.component.css'
})
export class FormProfesoresComponent {
  public profesor:Profesores = <Profesores>{}
  public idDepartamento:number = 0;
  public textBoton:string = "";
  public h4Texto:string = "";
  public infoTexto:string = "";

  constructor(private peticion:PAjaxServiceService, private ruta:Router, private route:ActivatedRoute){
    this.idDepartamento = this.route.snapshot.params["idDepto"];
  }

    ngOnInit(){
      const idProfe = this.route.snapshot.params["idProfe"];
      if(idProfe == -1){
        this.textBoton = "Añadir";
        this.h4Texto = "Nuevo profesor";
        this.infoTexto = "Añadir un nuevo profesor";
      }else{
        this.textBoton = "Modificar";
        this.h4Texto = "Edicion profesor";
        this.infoTexto = "Modifica a un profesor";

        this.peticion.seleccionarProfesor(idProfe).subscribe({
          next: res =>{
            this.profesor = res
            console.log("Profesor obtenido: ",res)
          },
          error: error=> console.log("Error al obtener al profesor: ",error)
        })
      }
    }
    enviar(){
      const idProfe = this.route.snapshot.params["idProfe"];
      if(idProfe == -1){
        this.peticion.anadirProfesor(this.profesor,this.idDepartamento).subscribe({
          next: res =>{
            console.log("Profesor añadido: ",res)
          },
          error: error=> console.log("Error al obtener al profesor: ",error)
        })
      }else{
        this.peticion.modificarProfesor(this.profesor,this.idDepartamento).subscribe({
          next: res =>{
            console.log("Profesor mofificado: ",res)
          },
          error: error=> console.log("Error al obtener al profesor: ",error)
        })
      }
    }
}
