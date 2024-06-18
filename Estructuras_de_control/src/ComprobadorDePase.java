import java.util.Scanner;

public class ComprobadorDePase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calificacion = scanner.nextInt();

        if (calificacion >= 6 && calificacion <= 8) {
            System.out.println("Usted aprobo el examen");
        }else if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Usted probo el examen ampliamente");
        }else if (calificacion >= 11 && calificacion <= 12) {
            System.out.println("Usted aprobo el examen de taquito");
        }else if (calificacion < 6 ) {
            System.out.println("Usted no aprobo el examen");

        }else System.out.println("el valor ingresado no es valido");
        scanner.close();
    }
}
