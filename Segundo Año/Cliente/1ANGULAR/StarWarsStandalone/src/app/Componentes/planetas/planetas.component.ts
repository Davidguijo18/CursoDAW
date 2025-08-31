import { Component,Input } from '@angular/core';

@Component({
  selector: 'app-planetas',
  standalone:true,
  imports: [],
  templateUrl: './planetas.component.html',
  styleUrl: './planetas.component.css'
})
export class PlanetasComponent {
  @Input() public planeta: any; 
}
