import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { JuegoDadosComponent } from './juegoDados/juegoDados.component';
import {AcercaDeComponent} from './acercaDe/acercaDe.component';

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