import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  nombre = "Jose Monroy";
  sueldo = 1000.50;
  dias = [`domingo`, `lunes`, `martes`, `miercoles`, `jueves`, `viernes`, `sabado`];
  articulos = [
    { codigo: 1, descripcion: `Arroz`, precio: 10.50 },
    { codigo: 2, descripcion: `Frijoles`, precio: 20.50 },
  ];
  fecha = new Date();
}
