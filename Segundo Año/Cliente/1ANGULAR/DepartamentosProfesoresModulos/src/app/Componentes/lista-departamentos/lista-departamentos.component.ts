import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PAjaxServiceService } from '../../Servicios/p-ajax-service.service';
import { Departamentos } from '../../Modelos/departamentos';
import { Router } from '@angular/router';

@Component({
  selector: 'app-lista-departamentos',
  imports: [CommonModule],
  templateUrl: './lista-departamentos.component.html',
  styleUrl: './lista-departamentos.component.css'
})
export class ListaDepartamentosComponent {
  public listaDepartamentos:Departamentos[] = [];

  constructor(private peticion:PAjaxServiceService, private ruta:Router){}

  ngOnInit(){
    this.peticion.listarDepartamentos().subscribe({
      next: res=>{
          this.listaDepartamentos = res;
      },
      error: error=> console.log("Error al obtener los departamentos: ",error)
    })
  }

  viajarListadoProfesores(departamento:Departamentos){
    this.ruta.navigate(["verProfes",departamento.id,departamento.nombre]);
  }

  viajarAnadirDepto(){
    this.ruta.navigate(["anadirDepto"]);
  }
}
