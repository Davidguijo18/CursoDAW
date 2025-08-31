import { Component } from '@angular/core';
import { DetalleFacturas } from '../../Modelos/detalle-facturas';
import { Router } from '@angular/router';
import { PAjaxServiceService } from '../../Servicios/p-ajax-service.service';
import { ActivatedRoute } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-lista-detalle',
  imports: [FormsModule],
  templateUrl: './lista-detalle.component.html',
  styleUrl: './lista-detalle.component.css'
})
export class ListaDetalleComponent {
  public listaDetallesFacturas:DetalleFacturas[] = [];
  public detalleFactura:DetalleFacturas = <DetalleFacturas>{};
  public idFactura:number = 0;
  public numeroFactura:number = 0;
  public anadir:boolean = false;
  public totalIva = 0;
  public totalTotal = 0;

  constructor(private peticion:PAjaxServiceService,private ruta:Router, private route:ActivatedRoute){
    this.idFactura = this.route.snapshot.params["idFactura"];
    this.numeroFactura = this.route.snapshot.params["numeroFactura"];
  }

  ngOnInit(){
    this.peticion.listarDetallesFacturas(this.idFactura).subscribe({
      next: res =>{
        for (let i = 0; i < res.length; i++) {
          this.totalTotal += ((res[i].cantidad * res[i].precio) + ((res[i].tipo_iva / 100) * (res[i].precio * res[i].cantidad)));
          this.totalIva += ((res[i].tipo_iva / 100) * (res[i].precio * res[i].cantidad));
        }
        this.listaDetallesFacturas = res
      },
      error: error =>{console.log("Error al mostrar los datos de la factura: ",error)}
    })
  }

  volverAlInicio(){
    this.ruta.navigate([""]);
  }

  cancelarFormulario(){
    this.anadir = false
  }

  anadirDetalle(){
    if(this.anadir)
      this.anadir = false;
    else
      this.anadir = true;
  }

  anadirLineaDetalle(){
    this.detalleFactura.id_factura = this.idFactura
    this.peticion.anadirDetalle(this.detalleFactura).subscribe({
      next: res =>{
        console.log("Se ha añadido una nueva factura");
        this.anadir = false,
        this.listaDetallesFacturas = res
      },
      error: error =>{console.log("Error al añadir factura: ",error)}
    })
  }

  eliminarDetalle(factura:DetalleFacturas){
    this.detalleFactura.id_factura = this.idFactura
    if(confirm("¿Desea eliminar la factura de " + factura.concepto + " ?")){
      this.peticion.eliminarFactura(factura.id,this.idFactura).subscribe({
        next: res =>{
          console.log("Se ha eliminado con exito")
          this.listaDetallesFacturas = res;
        },
        error: error => console.log("Error eliminando la factura: ",error)
      })
    }
  }

  modificarDetalle(){

  }
}
