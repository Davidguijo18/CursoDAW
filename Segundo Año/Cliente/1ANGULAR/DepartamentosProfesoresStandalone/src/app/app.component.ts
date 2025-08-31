import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ListaDepartamentosComponent } from "./Componentes/lista-departamentos/lista-departamentos.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, ListaDepartamentosComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'DepartamentosProfesoresModulos';
}
