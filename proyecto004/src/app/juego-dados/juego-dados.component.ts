import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-juego-dados',
  templateUrl: './juego-dados.component.html',
  styleUrls: ['./juego-dados.component.css']
})

export class JuegoDadosComponent implements OnInit {
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

  ngOnInit(): void {
  }
}