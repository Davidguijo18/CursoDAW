import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PrincipalComponent } from './Componentes/principal/principal.component';
import { ListaDetalleComponent } from './Componentes/lista-detalle/lista-detalle.component';

const routes: Routes = [
  {
    path:"",
    component:PrincipalComponent
  },

  {
    path:"listaDetalles/:idFactura/:numeroFactura",
    component:ListaDetalleComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
