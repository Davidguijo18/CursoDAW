import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaPersonajesComponent } from './Componentes/lista-personajes/lista-personajes.component';
import { PlanetasComponent } from './Componentes/planetas/planetas.component';

@NgModule({
  declarations: [
    AppComponent,
    ListaPersonajesComponent,
    PlanetasComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule, //Necesario implementar esto
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
