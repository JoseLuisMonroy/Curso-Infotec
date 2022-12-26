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
