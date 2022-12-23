let funcionAnonima = function (a: number, b: number, c?: number) {
    if (c) {
        return a + b + c;
    }
    return a + b;
}