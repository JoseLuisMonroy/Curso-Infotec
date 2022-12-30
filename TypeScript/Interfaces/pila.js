var PilaGenerica = /** @class */ (function () {
    function PilaGenerica() {
        this.pila = [];
    }
    PilaGenerica.prototype.push = function (elemento) {
        this.pila.push(elemento);
    };
    PilaGenerica.prototype.pop = function () {
        if (this.pila.length > 0) {
            return this.pila.pop();
        }
        else {
            throw new Error("No hay elementos en la pila");
        }
    };
    return PilaGenerica;
}());
var pilaNumeros = new PilaGenerica();
pilaNumeros.push(32);
pilaNumeros.push(45);
pilaNumeros.push(67);
pilaNumeros.push(89);
console.log(pilaNumeros.pop());
console.log(pilaNumeros.pop());
console.log(pilaNumeros.pop());
console.log(pilaNumeros.pop());
var pilaStrings = new PilaGenerica();
pilaStrings.push("Hola");
pilaStrings.push("Mundo");
pilaStrings.push("!");
console.log(pilaStrings.pop());
console.log(pilaStrings.pop());
console.log(pilaStrings.pop());
