import { Routes,RouterOutlet } from '@angular/router';
import { ListaPersonasComponent } from './Componentes/lista-personas/lista-personas.component';
import { FormPersonaComponent } from './Componentes/form-persona/form-persona.component';

export const routes: Routes = [
    {
        path:"",
        component:ListaPersonasComponent
    },
    {
        path:"addPer/:id",
        component:FormPersonaComponent
    }
];
