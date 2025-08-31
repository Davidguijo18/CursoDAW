import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Factura } from '../Modelos/factura';
import { DetalleFacturas } from '../Modelos/detalle-facturas';

@Injectable({
  providedIn: 'root'
})
export class PAjaxServiceService {
  private url:string = "http://localhost/ajax/facturas/servidor.php";

  constructor(private http:HttpClient) {}

  listarFacturas(){
    let pa = JSON.stringify({
      servicio:"facturas"
    })

    return this.http.post<Factura[]>(this.url,pa);
  }

  listarDetallesFacturas(idF:number){
    let pa = JSON.stringify({
      servicio:"detalle",
      id:idF
    })
    return this.http.post<DetalleFacturas[]>(this.url,pa);
  }

  anadirDetalle(factura:DetalleFacturas){
    let pa = JSON.stringify({
      servicio:"anade",
      detalle:factura,
      id_factura:factura.id_factura
      
    })
    return this.http.post<DetalleFacturas[]>(this.url,pa);
  }

  eliminarFactura(idDetalle:number, idFactura:number){
    let pa = JSON.stringify({
      servicio:"borra",
      id:idDetalle,
      id_factura:idFactura
    })

    return this.http.post<DetalleFacturas[]>(this.url,pa);
  }
}
