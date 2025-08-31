import { Component } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, Validators } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import * as CryptoJS from 'crypto-js';
import { LoginService } from '../../Servicios/login.service';

@Component({
  selector: 'app-login',
  imports:[FormsModule,ReactiveFormsModule],
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  public form: FormGroup;
  public loginIncorrecto: boolean = false;

  constructor(private servicioLogin:LoginService ,private fb: FormBuilder) {
    this.form = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
      clave: ['', [Validators.required, Validators.minLength(2)]] 
    });
  }

  validar() {
    if (this.form.invalid) {
      return;
    }

    const log = this.form.value;
    console.log("Log: ", log);

    const claveHash = CryptoJS.SHA3(log.clave).toString(CryptoJS.enc.Base64);
    console.log("hashClave: ", claveHash);
    log.clave = claveHash;
    console.log("Log: ", log);

    // Procedemos a la validación
    this.servicioLogin.getLogin_perfil(log).subscribe(
      res => {
        console.log(res);

        if ((res.estado) || (res.estado == "NO")) {
          this.loginIncorrecto = true;
        } else {
          this.loginIncorrecto = false;

          localStorage.setItem("JWT", res.JWT);
        }
      },
      error => {
        console.error("Error en la validación: ", error);
        this.loginIncorrecto = true;
      }
    );
  }
}