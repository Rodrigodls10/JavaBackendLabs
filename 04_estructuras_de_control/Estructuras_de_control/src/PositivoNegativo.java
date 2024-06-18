import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero (entero)");
        int num = scanner.nextInt();

        if (num>0) {
            System.out.println("el numero es positivo");
        }
        else {
            System.out.println("el numero es negativo");

        }
        scanner.close();



    }
}
