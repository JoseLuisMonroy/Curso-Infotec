class PilaEnteros {
    private vector: number[] = [];

    public insertar (elemento: number): void {
        this.vector.push(elemento);
    }

    public extraer () {
        if (this.vector.length > 0) {
            return this.vector.pop();
        } else {
            return null;
        }
    }
}

class PilaStrings {
    private vector: string[] = [];

    public insertar (elemento: string): void {
        this.vector.push(elemento);
    }

    public extraer () {
        if (this.vector.length > 0) {
            return this.vector.pop();
        } else {
            return null;
        }
    }
}   
