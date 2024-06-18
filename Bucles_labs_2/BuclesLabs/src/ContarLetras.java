import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.println("Ingrese la letra que quiere contar: ");
        char letra = sc.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra " + letra + " aparece: " + contador + " veces en su frase");
    }
}

