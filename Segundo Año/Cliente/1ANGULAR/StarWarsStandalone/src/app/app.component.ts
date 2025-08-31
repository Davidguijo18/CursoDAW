import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ListaPersonajesComponent } from "./Componentes/lista-personajes/lista-personajes.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, ListaPersonajesComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'StarWarsStandalone';
}
