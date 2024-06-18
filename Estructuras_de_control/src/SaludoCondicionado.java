import java.util.Scanner;

public class SaludoCondicionado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la hora por favor");
        int hora = scanner.nextInt();

        if (hora >= 6 && hora <=12 ){
        System.out.println("Buenos Dias");

        }else if (hora >12 && hora <=18) {
            System.out.println("Buendas Tardes");

        }else if (hora >18 && hora <=24) {
            System.out.println("Buenas Noches");
        }
        scanner.close();


    }
}
