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
        compararAtributos(persona1, persona2);

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
    //Realiza un procedimiento que compare cada uno de los atributos de la Persona con otro Objeto del mismo tipo de forma optimizada
    public static void compararAtributos(Persona persona1, Persona persona2){
        boolean comparacion = true;
        while (comparacion){
            if (persona1.getName().equals(persona2.getName())){
                if (persona1.getAge() == persona2.getAge()){
                    if (persona1.getHeight() == persona2.getHeight()){
                        if (persona1.getWeight() == persona2.getWeight()){
                            if (persona1.isStudent() == persona2.isStudent()){
                                System.out.println("Los atributos son iguales");
                                comparacion = false;
                            }else{
                                System.out.println("Los atributos son diferentes");
                                comparacion = false;
                            }
                        }else{
                            System.out.println("Los atributos son diferentes");
                            comparacion = false;
                        }
                    }else{
                        System.out.println("Los atributos son diferentes");
                        comparacion = false;
                    }
                }else{
                    System.out.println("Los atributos son diferentes");
                    comparacion = false;
                }
            }else{
                System.out.println("Los atributos son diferentes");
                comparacion = false;
            }
        }
    }

}