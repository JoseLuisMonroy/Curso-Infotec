import { Component } from '@angular/core';
import { ArticulosService } from './articulos.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  articulos: any;
  constructor(private articulosServicio: ArticulosService) {}
  ngOnInit() {
    this.articulosServicio.getArticulos().subscribe((data: {}) => {
      this.articulos = data;
    });
  }

}
