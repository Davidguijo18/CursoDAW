import { Component } from '@angular/core';
import { Speciality } from '../../Models/speciality';
import { SpecialtyService } from '../../Services/specialty.service';
import { ElementRef } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { SpecialtyAddComponent } from "../specialty-add/specialty-add.component";
@Component({
  selector: 'app-specialty-list',
  imports: [FormsModule, SpecialtyAddComponent],
  templateUrl: './specialty-list.component.html',
  styleUrl: './specialty-list.component.css'
})
export class SpecialtyListComponent {
public listaSpecialities:Speciality[] = [];
  public is_insert:boolean = false;
  public current_edit:{ //Para guardar una referencia de lo que se está editando (por si cancela el usuario)
    speciality:Speciality,
    input:any
  };
  public selId = -1; //Para saber el id del que estamos o vamos a editar

  constructor(private peticion:SpecialtyService, private elRef:ElementRef){
    this.listaSpecialities = <Speciality[]>[];
    this.current_edit = {speciality:<Speciality>{}, input:null};
  }

  ngOnInit(){
    this.peticion.listarSpecialities().subscribe({
      next: res => this.listaSpecialities = res,
      error: error => {console.log ("Error al listar las especialidades: ",error)}
    })
  }

  showAddSpecialityComponent(){
    this.is_insert = !this.is_insert;
  }

  onNewSpeciality(newSpeciality:Speciality){
    this.listaSpecialities.push(newSpeciality);
    this.showAddSpecialityComponent();
  }

  editando(id:number){
    return (id == this.selId);
  }

  editSpeciality(speciality:Speciality, name:HTMLInputElement, nameId:number){
    console.log("Especialidad: ",speciality);
    console.log("Name: ",name);
    console.log("Name ID: ",nameId);

    if(this.selId == -1){ //Vemos si estamos editando ya: 
      this.selId = nameId;
      //Guardamos los valores por si luego se cancela la edición
      this.current_edit.speciality = JSON.parse(JSON.stringify(speciality)); //Debemos clonarlo
      this.current_edit.input = name;
      //Accedemos a input y le damos el foco
      this.elRef.nativeElement = name;
      this.elRef.nativeElement.focus();
    }else{
      if(speciality.id == this.current_edit.speciality.id){ //Le ha dado a cancelar la edición
        this.selId = -1;
        //Deshacemos lo que haya podido escribir el usuario
        speciality.name = this.current_edit.speciality.name;
      }else{ //Si pulsa en otro botón le volvemos a dar el foto al input en edición
        this.elRef.nativeElement = this.current_edit.input;
        this.elRef.nativeElement,focus();
      }
    }
  }

  updateSpeciality(speciality:Speciality){
    console.log("Especialidad: ",speciality);
    this.peticion.modificarSpeciality(speciality).subscribe({
      next: res =>{
        console.log("Respuesta de modificar especialidad: ",res);
        //Terminamos la edicion
        this.selId = -1;
      },
      error: error=>{console.log("Error al modificar la especialidad: ",error)}
    })
  }

  deleteSpeciality(speciality:Speciality){
    let mensaje = "¿Deseas eliminar la especialidad " + speciality.name + " ?";
    if(confirm(mensaje)){
      this.peticion.eliminarSpeciality(speciality.id).subscribe({
        next: res=>{
          this.listaSpecialities = this.listaSpecialities.filter(tipo => tipo.id != speciality.id);
          console.log("Se ha eliminado la especialidad: ",res);
        },
        error: error =>{console.log("Error al borrar la especialidad: ",error)}
      })
    } 
  }
}
