import { Component } from '@angular/core';
import { Pets } from '../../Models/pets';
import { PetService } from '../../Services/pet.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Owner } from '../../Models/owner';
import { CommonModule } from '@angular/common';
import { PetType } from '../../Models/pet-type';
import { RouterLink } from '@angular/router';
import { FormBuilder, FormGroup, Validators, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-pet-add',
  imports: [CommonModule, RouterLink, ReactiveFormsModule], // Añadir ReactiveFormsModule
  templateUrl: './pet-add.component.html',
  styleUrl: './pet-add.component.css'
})
export class PetAddComponent {
  public owner: Owner = <Owner>{};
  public pet: Pets = <Pets>{ owner: this.owner, type: {} };
  public listaPetTypes: PetType[] = [];
  public textoBoton: string = "";
  public textoH4: string = "";
  public textoP: string = "";
  public form: FormGroup; // Declarar el FormGroup

  constructor(
    private peticion: PetService,
    private ruta: Router,
    private route: ActivatedRoute,
    private fb: FormBuilder // Inyectar FormBuilder
  ) {
    // Inicializar el formulario reactivo
    this.form = this.fb.group({
      owner: this.fb.control({ value: '', disabled: true }), // Dueño en modo readonly
      name: this.fb.control('', [Validators.required]), // Nombre de la mascota
      birthDate: this.fb.control('', [Validators.required]), // Fecha de nacimiento
      type: this.fb.control('', [Validators.required]) // Tipo de mascota
    });
  }

  ngOnInit() {
    const idPet = this.route.snapshot.params["idPet"];
    const idOwner = this.route.snapshot.params["idOwner"];
    console.log("ID del dueño obtenido de la URL:", idOwner);

    // Obtener el dueño
    this.peticion.obtenerOwner(idOwner).subscribe({
      next: (res) => {
        this.owner = res;
        this.pet.owner = res;
        this.form.patchValue({ owner: res.firstName }); // Asignar el nombre del dueño al campo
        console.log("Dueño obtenido:", res);
      },
      error: (error) => {
        console.log("Error al obtener el dueño:", error);
      }
    });

    // Obtener los tipos de mascotas
    this.peticion.obtenerPetTypes().subscribe({
      next: res => {
        this.listaPetTypes = res;
        console.log("Respuesta de obtenerPetTypes: ", res);
      },
      error: error => {
        console.log("Error al obtener los tipos de pets: ", error);
      }
    });

    // Configurar el formulario para editar o añadir
    if (idPet == "-1") {
      this.textoBoton = "Añadir";
      this.textoH4 = "Nueva mascota";
      this.textoP = "Añadir una nueva mascota";
    } else {
      this.textoBoton = "Editar";
      this.textoH4 = "Modificar mascota";
      this.textoP = "Modificar una mascota";

      this.peticion.obtenerPetId(idPet).subscribe({
        next: res => {
          console.log("Datos del pet obtenidos: ", res);
          this.pet = res;
          this.form.patchValue({
            name: res.name,
            birthDate: res.birthDate,
            type: res.type.id
          });
        },
        error: error => { console.log("Error al obtener el pet por su ID: ", error) }
      });
    }
  }

  anadirPet() {
    if (this.form.invalid) {
      console.log("Formulario inválido");
      return;
    }
  
    const idPet = this.route.snapshot.params["idPet"];
    const idOwner = this.route.snapshot.params["idOwner"];
  
    // Buscar el tipo de mascota seleccionado en la lista
    const selectedType = this.listaPetTypes.find(
      (type) => type.id === this.form.value.type
    );
  
    if (!selectedType) {
      console.error("No se encontró el tipo de mascota seleccionado");
      return;
    }
  
    // Asignar los valores del formulario a la mascota
    this.pet = {
      ...this.pet,
      name: this.form.value.name,
      birthDate: this.form.value.birthDate,
      type: selectedType // Asignar el objeto completo
    };
  
    if (idPet == "-1") {
      console.log("Id del owner: ", this.owner.id);
      console.log("Datos de la mascota a añadir:", this.pet);
  
      this.peticion.anadirPet(this.pet, this.owner.id).subscribe({
        next: (res) => {
          console.log("Se ha añadido una nueva mascota: ", res);
          this.ruta.navigate(["/detailOwner", this.owner.id]);
        },
        error: (error) => {
          console.log("Error al añadir una nueva mascota:", error);
        }
      });
    } else {
      this.peticion.editarPet(this.pet, idOwner, idPet).subscribe({
        next: (res) => {
          console.log("Se ha editado la mascota: ", res);
          this.ruta.navigate(["/detailOwner", this.owner.id]);
        },
        error: (error) => {
          console.log("Error al editar una mascota:", error);
        }
      });
    }
  }
}