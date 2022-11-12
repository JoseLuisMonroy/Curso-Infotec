public class main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 20, 1.80, 80, true);
        Persona persona2 = new Persona(persona1);
        Estudiante estudiante1 = new Estudiante(persona1);
        Estudiante estudiante2 = new Estudiante(estudiante1);
        System.out.println(estudiante1.getPersona().getName() + estudiante2.getPersona().getName());
        compararInstancias(persona1, persona2);
        compararHashcode(persona1, persona2);
        System.out.println(Estudiante.Concatenar("Hola", "Mundo"));
        System.out.println(estudiante1);
        

    }
    public static void compararInstancias( Persona persona1, Persona persona2){
        if (persona1.equals(persona2)){
            System.out.println("Las instancias son iguales");
        }else{
            System.out.println("Las instancias son diferentes");
        }
    }
    public static void compararHashcode( Persona persona1, Persona persona2){
        if (persona1.hashCode() == persona2.hashCode()){
            System.out.println("Los hashcode son iguales");
        }else{
            persona2 = persona1;
            compararHashcode(persona1, persona2);
        }
    }

}