public class conversionDatos {
    public static void main(String[] args){
        //1. de int a double
        int num1 = 5;
        double num2 = num1;
        System.out.println("num2 = " + num2);
        //2. de double a int
        double num3 = 5.5;
        int num4 = (int) num3;
        System.out.println("num4 = " + num4);
        //3. de byte a int
        byte num5 = 5;
        int num6 = num5;
        System.out.println("num6 = " + num6);

        //4. de  short a long
        short num7 = 5;
        long num8 = num7;
        System.out.println("num8 = " + num8);

        //5. de double a long
        double num9 = 5.5;
        long num10 = (long) num9;
        System.out.println("num10 = " + num10);

        //6. de int a byte
        int num11 = 5;
        byte num12 = (byte) num11;
        System.out.println("num12 = " + num12);        
    }
}