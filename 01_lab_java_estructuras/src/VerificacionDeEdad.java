import java.util.Scanner;

public class VerificacionDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad por favor");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        }else if (edad <= 18) {
            System.out.println("Usted es menor de edad");
        }
        scanner.close();
    }
}
