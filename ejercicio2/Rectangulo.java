public class Rectangulo extends Figura{
    private int base;
    private int altura;

    public Rectangulo(int b, int a) {
        this.base = b;
        this.altura = a;
    }

    @Override
    public double area() {
        return base * altura;
    }
}