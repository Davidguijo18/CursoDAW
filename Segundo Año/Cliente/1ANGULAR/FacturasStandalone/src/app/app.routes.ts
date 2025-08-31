import { Routes } from '@angular/router';
import { PrincipalComponent } from './Componentes/principal/principal.component';
import { ListaDetalleComponent } from './Componentes/lista-detalle/lista-detalle.component';

export const routes: Routes = [
    {
        path:"",
        component:PrincipalComponent
      },
    
      {
        path:"listaDetalles/:idFactura/:numeroFactura",
        component:ListaDetalleComponent
      }
];
