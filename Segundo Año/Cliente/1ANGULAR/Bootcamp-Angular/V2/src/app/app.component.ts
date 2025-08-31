import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { RouterLink } from '@angular/router';
import { SearchComponent } from "./search/search.component";
import { OwnerComponent } from "./owner/owner.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, RouterLink, SearchComponent, OwnerComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'bootcamp-angular';
  msgEventSearch:string = "";

  search(evento:any){
    this.msgEventSearch = evento.query + " => " + evento.resultado;
  }
}
