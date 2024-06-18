import java.util.Scanner;

public class ControlDeAcceso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad por favor");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Tienes acceso al evento.");
        }else {
            System.out.println("No tienes accseso al evento.");
        }
        scanner.close();
    }
}
