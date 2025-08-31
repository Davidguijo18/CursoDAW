import {  NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaDepartamentosComponent } from './Componentes/lista-departamentos/lista-departamentos.component';
import { ListadoProfesoresComponent } from './Componentes/listado-profesores/listado-profesores.component';
import { FormDepartamentosComponent } from './Componentes/form-departamentos/form-departamentos.component';
import { FormProfesoresComponent } from './Componentes/form-profesores/form-profesores.component';

const routes: Routes = [
  {
    path:"",
    component:ListaDepartamentosComponent
  },

  {
    path:"anadirDepto",
    component:FormDepartamentosComponent
  },

  {
    path:"verProfes/:idDep/:nombre",
    component:ListadoProfesoresComponent
  },

  {
    path:"formProfe/:idProfe/:idDepto",
    component:FormProfesoresComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
