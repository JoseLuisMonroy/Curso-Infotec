import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-juego-dados',
  templateUrl: './juego-dados.component.html',
  styleUrls: ['./juego-dados.component.css']
})

export class JuegoDadosComponent implements OnInit {
  valor1: number;
  valor2: number;
  valor3: number;

  constructor() { 
    this.valor1 = this.valorAleatorio();
    this.valor2 = this.valorAleatorio();
    this.valor3 = this.valorAleatorio();
  }

  valorAleatorio() {
    return Math.trunc(Math.random() * 6) + 1;
  }

  lanzar(): void {
    this.valor1 = this.valorAleatorio();
    this.valor2 = this.valorAleatorio();
    this.valor3 = this.valorAleatorio();
  }

  ngOnInit(): void {
  }
}