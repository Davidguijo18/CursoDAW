import { Component } from '@angular/core';
import { Output } from '@angular/core';
import { EventEmitter } from '@angular/core';
import { PetType } from '../../Models/pet-type';
import { PetTypeService } from '../../Services/pet-type.service';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pettype-add',
  imports: [FormsModule],
  templateUrl: './pettype-add.component.html',
  styleUrl: './pettype-add.component.css'
})
export class PettypeAddComponent {
  @Output() onNew = new EventEmitter<PetType>();

  public newPetType: PetType = { id: 0, name: '' };

  constructor(private petTypeService: PetTypeService, private ruta:Router) {}

  addPetType() {
    if (this.newPetType.name.trim() == '') {
      alert('El nombre del tipo de mascota no puede estar vacío.');
      return;
    }

    this.petTypeService.anadirPetType(this.newPetType).subscribe({
      next: res => {
        this.onNew.emit(res);
        this.newPetType.name = '';
      },
      error: (error) => {console.error('Error al agregar el tipo de mascota:', error)}
    });
  }
}
