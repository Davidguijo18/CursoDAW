import { Component } from '@angular/core';
import { SpecialtyService } from '../../Services/specialty.service';
import { Speciality } from '../../Models/speciality';
import { Output } from '@angular/core';
import { EventEmitter } from '@angular/core';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-specialty-add',
  imports: [FormsModule],
  templateUrl: './specialty-add.component.html',
  styleUrl: './specialty-add.component.css'
})
export class SpecialtyAddComponent {
  @Output() onNew = new EventEmitter<Speciality>();
  
    public newSpeciality: Speciality = { id: 0, name: '' };
  
    constructor(private specialityService: SpecialtyService, private ruta:Router) {}
  
    addSpeciality() {
      if (this.newSpeciality.name.trim() == '') {
        alert('El nombre de la especialidad no puede estar vacío.');
        return;
      }
  
      this.specialityService.anadirSpeciality(this.newSpeciality).subscribe({
        next: res => {
          this.onNew.emit(res);
          this.newSpeciality.name = '';
        },
        error: (error) => {console.error('Error al agregar una nueva especialidad:', error)}
      });
    }
}
