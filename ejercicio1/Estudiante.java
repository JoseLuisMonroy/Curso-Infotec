public class Estudiante{
    static String Grupo;
    static int Boleta;
    static double Promedio;
    private Persona persona;

    // Constructor estatico
    static {
        Grupo = "A";
        Boleta = 123456;
        Promedio = 9.5;
    }
    public Estudiante(Persona persona) {
        this.persona = persona;
    }
    public Estudiante(Estudiante estudiante) {
        this.persona = estudiante.persona;
    }
    

    static Persona PersonaNull (Persona persona){
        persona.setName(null);
        persona.setAge(0);
        persona.setHeight(0);
        persona.setWeight(0);
        persona.setStudent(false);
        return persona;
    }
    static String Concatenar (String string1, String string2){
        return string1 + "-" + string2;
    }

    public static String getGrupo() {
        return Grupo;
    }
    public static void setGrupo(String grupo) {
        Grupo = grupo;
    }
    public static int getBoleta() {
        return Boleta;
    }
    public static void setBoleta(int boleta) {
        Boleta = boleta;
    }
    public static double getPromedio() {
        return Promedio;
    }
    public static void setPromedio(double promedio) {
        Promedio = promedio;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Nombre " + persona.getName() + ", Edad " + persona.getAge();
    }
}