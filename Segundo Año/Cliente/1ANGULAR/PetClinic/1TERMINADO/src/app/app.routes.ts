import { Routes } from '@angular/router';
import { OwnersComponent } from './Components/owners/owners.component';
import { FormOwnerComponent } from './Components/form-owner/form-owner.component';
import { OwnerDetailsComponent } from './Components/owner-details/owner-details.component';
import { PetAddComponent } from './Components/pet-add/pet-add.component';
import { PetListComponent } from './Components/pet-list/pet-list.component';
import { VisitListComponent } from './Components/visit-list/visit-list.component';
import { VisitAddComponent } from './Components/visit-add/visit-add.component';
import { PettypeListComponent } from './Components/pettype-list/pettype-list.component';
import { SpecialtyListComponent } from './Components/specialty-list/specialty-list.component';
import { VetsComponent } from './Components/vets/vets.component';
import { VetAddComponent } from './Components/vet-add/vet-add.component';

export const routes: Routes = [
    {
        path:"",
        component:OwnersComponent
    },

    {
        path:"formOwner/:id",
        component:FormOwnerComponent
    },
    {
        path:"detailOwner/:idOwner",
        component:OwnerDetailsComponent
    },
    {
        path:"petList",
        component:PetListComponent
    },
    {
        path:"petAdd/:idOwner/:idPet",
        component:PetAddComponent
    },
    {
        path:"visitList",
        component:VisitListComponent
    },
    {
        path:"addVisit/:petId/:esEditar/:idVisita",
        component:VisitAddComponent
    },
    {
        path:"pettypeList",
        component:PettypeListComponent    
    },
    {
        path:"specialityList",
        component:SpecialtyListComponent
    },
    {
        path:"veterinarios",
        component:VetsComponent
    },
    {
        path:"formVet/:idVet",
        component:VetAddComponent
    }
];
