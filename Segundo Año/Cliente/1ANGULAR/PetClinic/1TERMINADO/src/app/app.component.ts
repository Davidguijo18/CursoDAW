import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PrimeNG } from 'primeng/config';
import { MenubarModule } from 'primeng/menubar';
import { Router } from '@angular/router';
import { AvatarModule } from 'primeng/avatar';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,AvatarModule,MenubarModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  public items: any[];
  constructor(private primeng: PrimeNG,private ruta:Router) {
    this.items = [
      { label: 'Dueños', icon: 'pi pi-home',items: [
        { label: 'Listar dueños', icon: 'pi pi-pencil',command: () => this.ruta.navigate(['/']) },
        { label: 'Añadir dueño', icon: 'pi pi-code',command: () => this.ruta.navigate(['formOwner/-1']) }
      ]},
      { label: 'Veterinarios', icon: 'pi pi-info',command: () => this.ruta.navigate(['/veterinarios']) },
      { label: 'Pet Types', icon: 'pi pi-info',command: () => this.ruta.navigate(['/pettypeList']) },
      { label: 'Especialidades', icon: 'pi pi-envelope',command: () => this.ruta.navigate(['/specialityList'])},
    ];
  }
  ngOnInit() {
      this.primeng.ripple.set(true);
  }
}
