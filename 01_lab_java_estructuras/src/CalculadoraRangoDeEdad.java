import java.util.Scanner;

public class CalculadoraRangoDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su edad por favor");

        int edad = scanner.nextInt();

        if (edad >= 0 && edad <= 3) {
            System.out.println("Usted es un bebe");
        } else if (edad >= 3 && edad <= 10) {
            System.out.println("Usted es un Niño");
        } else if (edad >= 10 && edad <= 15) {
            System.out.println("Usted es un Pre-Adolecente");
        } else if (edad >= 15 && edad <= 21) {
            System.out.println("Usted es un Adulto Joven");

        } else if (edad >= 21 && edad <= 45) {
            System.out.println("Usted es Adulto");

        } else if (edad >= 45 && edad <= 60) {
            System.out.println("Usted es Adulto Maduro");
        } else if (edad >= 60) {
            System.out.println("Usted es Abuelo");

        } else System.out.println("El valor ingresado no es valido");
        scanner.close();
    }

}
