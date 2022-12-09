public class testMain {
    public static void main(String[] args) {
        Libro libro1 = new Libro("1", "El principito", "Bueno", 1943);
        Revista revista1 = new Revista("2", "National Geographic", "Bueno", 2019, 1);
        System.out.println(libro1);
        System.out.println(revista1);
        libro1.Prestar();
        System.out.println(libro1);
        revista1.Prestar();
        System.out.println(revista1);
        libro1. Devolver();
        System.out.println(libro1);
    }
}