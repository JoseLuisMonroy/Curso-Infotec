import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { JuegoDadosComponent } from './juego-dados/juego-dados.component';
import {AcercaDeComponent} from './acerca-de/acerca-de.component';

const routes: Routes = [
  {
    path: 'juegoDados',
    component: JuegoDadosComponent
  },
  {
    path: 'acercaDe',
    component: AcercaDeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }