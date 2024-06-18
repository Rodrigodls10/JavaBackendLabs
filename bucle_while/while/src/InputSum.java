import java.util.Scanner;

public class InputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Ingrese numeros para sumar. Ingrese 0 para terminar . ");
        numero = sc.nextInt();

        while (numero != 0) {
            suma += numero;
            System.out.println("Ingrese el siguiente numero (0 para terminar).");
            numero = sc.nextInt();
        }
        System.out.println("La suma es: " + suma);
    }
}
