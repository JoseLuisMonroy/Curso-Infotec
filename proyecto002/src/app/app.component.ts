import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Mostrar dados aleatorios';

  valor1: string = "";
  valor2: string = "";
  valor3: string = "";
  constructor() { 
    this.valor1 = this.valorAleatorio();
    this.valor2 = this.valorAleatorio();
    this.valor3 = this.valorAleatorio();
  }

  valorAleatorio(): string {
    let valor = Math.floor(Math.random() * 6) + 1;
    return valor.toString();
  }

  lanzar(): void {
    this.valor1 = this.valorAleatorio();
    this.valor2 = this.valorAleatorio();
    this.valor3 = this.valorAleatorio();
  }
}
