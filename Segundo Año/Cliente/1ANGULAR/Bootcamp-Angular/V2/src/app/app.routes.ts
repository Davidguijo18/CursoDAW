import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { BorrarComponent } from './borrar/borrar.component';
import { NuevoComponent } from './nuevo/nuevo.component';
import { SearchComponent } from './search/search.component';
import { OwnerComponent } from './owner/owner.component';

export const routes: Routes = [
    {path: '', component: HomeComponent},
    {path: 'borrar', component: BorrarComponent},
    {path: 'nuevo', component: NuevoComponent},
    {path: 'search', component: SearchComponent},
    {path: 'owner', component: OwnerComponent}
];
