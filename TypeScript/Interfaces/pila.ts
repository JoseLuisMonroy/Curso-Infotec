class PilaGenerica<T> {
    private pila: T[] = [];
    push(elemento: T) {
        this.pila.push(elemento);
    }
    pop(): T | undefined {
        if (this.pila.length > 0) {
            return this.pila.pop();
        }
        else {
            throw new Error("No hay elementos en la pila");
        }
    }
}

let pilaNumeros = new PilaGenerica<number>();
pilaNumeros.push(32);
pilaNumeros.push(45);
pilaNumeros.push(67);
pilaNumeros.push(89);
console.log(pilaNumeros.pop());
console.log(pilaNumeros.pop());
console.log(pilaNumeros.pop());
console.log(pilaNumeros.pop());

let pilaStrings = new PilaGenerica<string>();
pilaStrings.push("Hola");
pilaStrings.push("Mundo");
pilaStrings.push("!");
console.log(pilaStrings.pop());
console.log(pilaStrings.pop());
console.log(pilaStrings.pop());
