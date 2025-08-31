import { Component, Input } from '@angular/core';
import { Visit } from '../../Models/visit';
import { PetService } from '../../Services/pet.service';
import { Output } from '@angular/core';
import { EventEmitter } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-visit-list',
  imports: [RouterLink],
  templateUrl: './visit-list.component.html',
  styleUrl: './visit-list.component.css'
})
export class VisitListComponent {

  @Input() visits:Visit[] = [];
  @Input() idPet:number = 0;
  @Output() eliminaVisita = new EventEmitter<number>();

  constructor(private peticion:PetService){}

  ngOnInit(){
    console.log("Visitas del pet: ",this.visits);
  }

  eliminarVisita(visita:Visit){
    if(confirm("¿Desea eliminar la visita con concepto: " + visita.description + " ?")){
      this.peticion.eliminarVisita(visita.id).subscribe({
        next: res=>{
        this.visits = this.visits.filter(v => v.id !== visita.id); //Filtro la lista localmente
        this.eliminaVisita.emit(visita.id); //Emito el id de la visita eliminada
        },
        error: error=>{console.log("Error al eliminar la visita: ",error)}
      })
    }
  }
}
