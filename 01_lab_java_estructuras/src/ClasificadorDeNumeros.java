import java.util.Scanner;

public class ClasificadorDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println(" El numero ingresado es positivo");
        }else if (numero < 0){
            System.out.println("El numero ingresado es negativo");
        }

        scanner.close();


    }
}
