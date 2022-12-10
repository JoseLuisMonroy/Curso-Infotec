public abstract class mainF {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        Triangulo triangulo1 = new Triangulo(5, 10);
        Rectangulo rectangulo1 = new Rectangulo(5, 10);
        System.out.println(circulo1);
        System.out.println(triangulo1);
        System.out.println(rectangulo1);
    }
}