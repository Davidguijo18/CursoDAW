import { Component } from '@angular/core';
import { Departamentos } from '../../Modelos/departamentos';
import { PAjaxServiceService } from '../../Servicios/p-ajax-service.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-form-departamentos',
  standalone: false,
  
  templateUrl: './form-departamentos.component.html',
  styleUrl: './form-departamentos.component.css'
})
export class FormDepartamentosComponent {
  public departamento:Departamentos = <Departamentos>{};

  constructor(private peticion:PAjaxServiceService, private ruta:Router, private route:ActivatedRoute){
    this.departamento = {
      id:0,
      nombre:"",
      descripcion:""
    }
  }

  enviar(){
    this.peticion.anadirDepartamento(this.departamento).subscribe({
      next: res =>{
          console.log("Insercion de departamento completada: ",res)
      },
      error: error => console.log("Error al insertar un nuevo departamento: ",error)
    })

    this.ruta.navigate([""]);
    }
}
