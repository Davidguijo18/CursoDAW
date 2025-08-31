import { Component,Input } from '@angular/core';

@Component({
  selector: 'app-planetas',
  standalone: false,
  
  templateUrl: './planetas.component.html',
  styleUrl: './planetas.component.css'
})
export class PlanetasComponent {
  @Input() public planeta: any; 
}
