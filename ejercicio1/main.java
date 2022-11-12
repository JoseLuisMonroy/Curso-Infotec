public class main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 20, 1.80, 80, true);
        Persona persona2 = new Persona("Pedro", 21, 1.70, 70, true);
        System.out.println("Nombre: " + persona1.getName() + " Edad: " + persona1.getAge());
        System.out.println("Nombre: " + persona2.getName() + " Edad: " + persona2.getAge());
        Salon.PersonaNull(persona1);
        Salon.PersonaNull(persona2);
        System.out.println("Nombre: " + persona1.getName() + " Edad: " + persona1.getAge());
        System.out.println("Nombre: " + persona2.getName() + " Edad: " + persona2.getAge());
    }
}