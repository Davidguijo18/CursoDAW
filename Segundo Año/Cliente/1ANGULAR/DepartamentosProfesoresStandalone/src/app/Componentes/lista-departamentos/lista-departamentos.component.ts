import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PAjaxServiceService } from '../../Servicios/p-ajax-service.service';
import { Departamentos } from '../../Modelos/departamentos';

@Component({
  selector: 'app-lista-departamentos',
  imports: [CommonModule],
  templateUrl: './lista-departamentos.component.html',
  styleUrl: './lista-departamentos.component.css'
})
export class ListaDepartamentosComponent {
  public listaDepartamentos:Departamentos[] = [];

  constructor(private peticion:PAjaxServiceService){}

  ngOnInit(){
    this.peticion.listarDepartamentos().subscribe({
      next: res=>{
          this.listaDepartamentos = res;
      },
      error: error=> console.log("Error al obtener los departamentos: ",error)
    })
  }
}
