import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  nombre  = 'Jose Monroy';
  edad = 19;
  mail = `jkskjsjk@gmail.com`;
  sueldos = [1893, 2309, 1230];
  activo = true;
  
  esActivo(){
    if (this.activo){
      return `Es un trabajador activo`;
    }else{
      return `Es un trabajador inactivo`;
    }
  }

  ultimos3Sueldos(){
    let suma = 0;
    for (let i = 0; i < this.sueldos.length; i++){
      suma += this.sueldos[i];
    }
    return suma;
  }
}
