import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PAjaxService } from '../p-ajax.service';

@Component({
  selector: 'app-owner',
  imports: [CommonModule],
  templateUrl: './owner.component.html',
  styleUrl: './owner.component.css'
})
export class OwnerComponent implements OnInit{
  
  public personas:any[] = [];

  constructor(private servicioPAjax:PAjaxService){}

  ngOnInit(): void {
    this.servicioPAjax.getOwners().subscribe({
      next: res =>{
        this.personas = res;
        console.log("Personas: ",this.personas);
      },
      error: error => console.log("Error: ",error)
    });
  }

}
