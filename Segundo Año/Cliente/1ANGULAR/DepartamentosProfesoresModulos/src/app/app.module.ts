import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaDepartamentosComponent } from "./Componentes/lista-departamentos/lista-departamentos.component";
import { HttpClient,HttpClientModule } from '@angular/common/http';
import { ListadoProfesoresComponent } from './Componentes/listado-profesores/listado-profesores.component';
import { FormDepartamentosComponent } from './Componentes/form-departamentos/form-departamentos.component';
import { FormsModule } from '@angular/forms';
import { FormProfesoresComponent } from './Componentes/form-profesores/form-profesores.component';

@NgModule({
  declarations: [
    AppComponent,
    ListadoProfesoresComponent,
    FormDepartamentosComponent,
    FormProfesoresComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ListaDepartamentosComponent,
    HttpClientModule,
    FormsModule
],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
