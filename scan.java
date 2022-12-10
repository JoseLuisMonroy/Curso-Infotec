import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String name = sc.nextLine();
        System.out.println("Ingresa tu edad: ");
        int age = sc.nextInt();
        System.out.println("Hola " + name + " tienes " + age + " años");
    }
}