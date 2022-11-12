public class main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 20, 1.80, 80, true);
        Persona persona2 = new Persona("Pedro", 21, 1.70, 70, true);
        Estudiante estudiante1 = new Estudiante(persona1);
        Estudiante estudiante2 = new Estudiante(persona2);
        //imprimri atributos de estudiante1)
        System.out.println("Nombre: " + estudiante1.getPersona().getName());
        System.out.println("Edad: " + estudiante1.getPersona().getAge());
        System.out.println("Altura: " + estudiante1.getPersona().getHeight());

    }
    public static void compararInstancias( Persona persona1, Persona persona2){
        if (persona1.equals(persona2)){
            System.out.println("Las instancias son iguales");
        }else{
            System.out.println("Las instancias son diferentes");
        }
    }
}