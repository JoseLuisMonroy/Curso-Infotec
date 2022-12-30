import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'letras'
})
export class LetrasPipe implements PipeTransform {

  transform(value: any, args?: any): any {
      if(args != null){
        if(args == `ingles`){
          switch(value){
            case 1: return `One`;
            case 2: return `Two`;
            case 3: return `Three`;
            case 4: return `Four`;
            case 5: return `Five`;
            case 6: return `Six`;
            case 7: return `Seven`;
        }
      }
      if(args == `portugues`){
        switch(value){
          case 1: return `Um`;
          case 2: return `Dois`;
          case 3: return `Três`;
          case 4: return `Quatro`;
          case 5: return `Cinco`;
          case 6: return `Seis`;
          case 7: return `Sete`;
        }
      }
    }
    switch(value){
      case 1: return `Uno`;
      case 2: return `Dos`;
      case 3: return `Tres`;
      case 4: return `Cuatro`;
      case 5: return `Cinco`;
      case 6: return `Seis`;
      case 7: return `Siete`;
    }
    return null;
  }
}
