import java.util.Scanner;

public class Duplicar {
    // Metodo para duplicar el numero proporcionado
    public static int duplicarNumero(int numero) {
        return numero * 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para duplicar: ");
        int numero = scanner.nextInt();
        int resultado = duplicarNumero(numero);
        System.out.println("El doble de " + numero + " es: " + resultado);
        scanner.close();
    }

}
