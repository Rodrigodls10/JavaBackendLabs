import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");

        String cadena = sc.nextLine();
        String cadenaInvertida = "";

        for (int i = cadena.length() -1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);

        }
        System.out.println(cadenaInvertida);
    }
}
