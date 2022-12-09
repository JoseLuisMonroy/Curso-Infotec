public class Circulo extends Figura{
    private int radio;
    
    public Circulo(int r) {
        this.radio = r;
    }

    @Override
    public double area() {

        return Math.PI*Math.pow(getRadio(), 2);
    }
    public double getRadio() {
        //cast from int to double
        return (double)radio;
    }
}