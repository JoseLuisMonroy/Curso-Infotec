import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  art = {
    codigo: 0,
    descripcion: '',
    precio: 0,
  }

  articulos = [
    { codigo: 1, descripcion: 'Papas', precio: 10.5 },
    { codigo: 2, descripcion: 'Manzanas', precio: 22.3 },
    { codigo: 3, descripcion: 'Melon', precio: 15.7 },
    { codigo: 4, descripcion: 'Cebollas', precio: 18.9 },
    { codigo: 5, descripcion: 'Calabazas', precio: 20.1 },
  ];

  hayArticulos() {
    return this.articulos.length > 0;
  }

  borrarArticulo(codigos: number) {
    this.articulos = this.articulos.filter(a => a.codigo !== codigos);
  }

  agregarArticulo() {
    if(this.art.codigo === 0) {
      alert('Debe ingresar un código distinto de cero');
      return;
    }
    const existe = this.articulos.find(a => a.codigo === this.art.codigo);
    if(existe) {
      alert('El código ya existe');
      return;
    }
    this.articulos.push({codigo: this.art.codigo, descripcion: this.art.descripcion, precio: this.art.precio});
    this.art.codigo = 0;
    this.art.descripcion = '';
    this.art.precio = 0;
  }

  seleccionarArticulo(codigo: number) {
    const existe = this.articulos.find(a => a.codigo === codigo);
    if(existe) {
      this.art.codigo = existe.codigo;
      this.art.descripcion = existe.descripcion;
      this.art.precio = existe.precio;
    }
  }
  
  editarArticulo(codigo: number) {
    const existe = this.articulos.find(a => a.codigo === codigo);
    if(existe) {
      this.art.codigo = existe.codigo;
      this.art.descripcion = existe.descripcion;
      this.art.precio = existe.precio;
    }
  }

  modificarArticulo() {
    const existe = this.articulos.find(a => a.codigo === this.art.codigo);
    if(existe) {
      existe.descripcion = this.art.descripcion;
      existe.precio = this.art.precio;
      this.art.codigo = 0;
      this.art.descripcion = '';
      this.art.precio = 0;
    }
  }
}
