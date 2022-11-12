public class listasMetodos{
    public static void main (String[] args){
        System.out.println(ejercicio1( "Hola", "Infotec", 3, 4));
        System.out.println(ejercicio2( ejercicio1("Hola", "Infotec", 3,4), 5.6, 8.5));
        Integer [] arreglo = {10, 58, 68, 920, 15, 16, 85, 75, 32};
        Integer [] cambaido = ejercicio3(arreglo);
        for (int i = 0; i < cambaido.length; i++){
            System.out.println("Posicion " + i + ": " + cambaido[i] );
        }
        

    }
    public static String ejercicio1 (String string1, String string2, Integer int1, Integer int2){
        return string1 + " " + string2 + " " + int1+ " " + int2;
    }
    public static String ejercicio2 (String ejercicio1, double double1, double double2){
        return ejercicio1 + " " + double1 + " " + double2;
    }
    public static Integer[] ejercicio3 (Integer [] arreglo){
        int x = 25;
        int y = 90;
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == 920){
                arreglo[i] = x;
            }
            else if (arreglo[i] == 68){
                arreglo[i] = y;
            }
        }
        return arreglo;
    }

}