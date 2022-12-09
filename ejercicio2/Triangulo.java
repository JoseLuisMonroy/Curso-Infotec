public class Triangulo extends Figura{
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        //cast from int to double
        return (double)base;
    }
    public double getAltura() {
        //cast from int to double
        return (double)altura;
    }

    @Override
    public double area() {
        return (getBase() * getAltura())/2;
    }

}