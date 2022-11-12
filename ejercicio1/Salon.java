public class Salon{
    static String Grupo;
    static int NumAlumnos;
    static double PromedioEdad;

    public Salon(String grupo, int numAlumnos, double promedioEdad) {
        Grupo = grupo;
        NumAlumnos = numAlumnos;
        PromedioEdad = promedioEdad;
    }
    static Persona PersonaNull (Persona persona){
        persona.setName(null);
        persona.setAge(0);
        persona.setHeight(0);
        persona.setWeight(0);
        persona.setStudent(false);
        return persona;
    }
    static String Concatenar (String string1, String strin2){
        return string1 + "-" + strin2;
    }

}