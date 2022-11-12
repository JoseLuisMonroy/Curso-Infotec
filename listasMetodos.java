public class listasMetodos{
    public static void main (String[] args){
        System.out.println(ejercicio1( "Hola", "Infotec", 3, 4));
        System.out.println(ejercicio2( ejercicio1("Hola", "Infotec", 3,4), 5.6, 8.5));
    }
    public static String ejercicio1 (String string1, String string2, Integer int1, Integer int2){
        return string1 + " " + string2 + " " + int1+ " " + int2;
    }
    public static String ejercicio2 (String ejercicio1, double double1, double double2){
        return ejercicio1 + " " + double1 + " " + double2;
    }
}