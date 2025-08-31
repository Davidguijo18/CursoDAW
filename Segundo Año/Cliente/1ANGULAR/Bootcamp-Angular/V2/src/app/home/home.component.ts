import { Component } from '@angular/core';
import { BorrarComponent } from '../borrar/borrar.component';
import { Persona } from '../persona';

@Component({
  selector: 'app-home',
  imports: [BorrarComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})

export class HomeComponent {
  public mensaje:string="Me estoy cagando";

  public objeto = {
    nombre:"Ricardo",
    apellidos:"Linterna"
  };

  public array: string[] = ["Hola","Muy buenas","Yo soy","Adrian"];
}
