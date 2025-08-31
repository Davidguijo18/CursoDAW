import { Component } from '@angular/core';
import { PAjaxServiceService } from '../../Servicios/p-ajax-service.service';
import { Factura } from '../../Modelos/factura';
import { Router } from '@angular/router';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-principal',
  imports: [RouterLink],
  templateUrl: './principal.component.html',
  styleUrl: './principal.component.css'
})
export class PrincipalComponent {
  public listadoFacturas:Factura[] = [];

  constructor(private peticion:PAjaxServiceService, private ruta:Router){}

  ngOnInit(){
    this.peticion.listarFacturas().subscribe({
      next: res=>{
        this.listadoFacturas = res
        console.log("Mostrando facturas: ",res)
      },
      error: error =>{console.log("Error al mostrar el listado de facturas: ",error)}
    })
  }
}
