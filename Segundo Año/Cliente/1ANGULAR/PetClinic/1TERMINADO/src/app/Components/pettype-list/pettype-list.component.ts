import { Component, ElementRef } from '@angular/core';
import { PetType } from '../../Models/pet-type';
import { PetTypeService } from '../../Services/pet-type.service';
import { FormsModule } from '@angular/forms';
import { RouterLink,RouterLinkActive } from '@angular/router';
import { PettypeAddComponent } from "../pettype-add/pettype-add.component";

@Component({
  selector: 'app-pettype-list',
  imports: [FormsModule, RouterLink, RouterLinkActive, PettypeAddComponent],
  templateUrl: './pettype-list.component.html',
  styleUrl: './pettype-list.component.css'
})
export class PettypeListComponent {
  public listaPetTypes:PetType[] = [];
  public is_insert:boolean = false;
  public current_edit:{ //Para guardar una referencia de lo que se está editando (por si cancela el usuario)
    pettype:PetType,
    input:any
  };
  public selId = -1; //Para saber el id del que estamos o vamos a editar

  constructor(private peticion:PetTypeService, private elRef:ElementRef){
    this.listaPetTypes = <PetType[]>[];
    this.current_edit = {pettype:<PetType>{}, input:null};
  }

  ngOnInit(){
    this.peticion.obtenerPetTypes().subscribe({
      next: res => this.listaPetTypes = res,
      error: error => {console.log ("Error al listar los pet types: ",error)}
    })
  }

  showAddPettypeComponent(){
    this.is_insert = !this.is_insert;
  }

  onNewPettype(newPettype:PetType){
    this.listaPetTypes.push(newPettype);
    this.showAddPettypeComponent();
  }

  editando(id:number){
    return (id == this.selId);
  }

  editPettype(pettype:PetType, name:HTMLInputElement, nameId:number){
    console.log("Pettype: ",pettype);
    console.log("Name: ",name);
    console.log("Name ID: ",nameId);

    if(this.selId == -1){ //Vemos si estamos editando ya: 
      this.selId = nameId;
      //Guardamos los valores por si luego se cancela la edición
      this.current_edit.pettype = JSON.parse(JSON.stringify(pettype)); //Debemos clonarlo
      this.current_edit.input = name;
      //Accedemos a input y le damos el foco
      this.elRef.nativeElement = name;
      this.elRef.nativeElement.focus();
    }else{
      if(pettype.id == this.current_edit.pettype.id){ //Le ha dado a cancelar la edición
        this.selId = -1;
        //Deshacemos lo que haya podido escribir el usuario
        pettype.name = this.current_edit.pettype.name;
      }else{ //Si pulsa en otro botón le volvemos a dar el foto al input en edición
        this.elRef.nativeElement = this.current_edit.input;
        this.elRef.nativeElement,focus();
      }
    }
  }

  updatePettype(pettype:PetType){
    console.log("Pettype: ",pettype);
    this.peticion.modificarPetType(pettype).subscribe({
      next: res =>{
        console.log("Respuesta de modificar pettype: ",res);
        //Terminamos la edicion
        this.selId = -1;
      },
      error: error=>{console.log("Error al modificar el pettype: ",error)}
    })
  }

  deletePettype(pettype:PetType){
    let mensaje = "¿Deseas eliminar el tipo " + pettype.name + " ?";
    if(confirm(mensaje)){
      this.peticion.eliminarPetType(pettype.id).subscribe({
        next: res=>{
          this.listaPetTypes = this.listaPetTypes.filter(tipo => tipo.id != pettype.id);
          console.log("Se ha eliminado el pet type: ",res);
        },
        error: error =>{console.log("Error al borrar el pettype: ",error)}
      })
    } 
  }
}
