import java.util.Scanner;

public class InteractiveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea una instancia de scanner

        // solicitar al usuario el primer numero
        System.out.println("Ingrerse el primer numero");
        int num1 = scanner.nextInt();

        // solicitar al usuario el segundo numero
        System.out.println("Ingrerse el segundo numero");
        int num2 = scanner.nextInt();

        // cerrar scanner
        scanner.close();
        int resultado = sumar(num1, num2);
        System.out.println("La suma de" + num1 + " " + num2 + "Es igual a " + resultado );


    }
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }
}
