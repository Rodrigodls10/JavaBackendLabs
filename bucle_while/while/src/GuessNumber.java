import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess;
        int numbreToGuess = (int)(Math.random()*100) + 1; // Numero entre 1 y 100
        int contador = 0;

        do {
            System.out.print("Adivine el numero (1-100): ");
            guess = sc.nextInt();
            contador++;
            if (guess < numbreToGuess) {
                System.out.println("Mas grande el numero.");
            }else if(guess > numbreToGuess){
                System.out.println("Mas chico el numero.");
            }
        }while(guess != numbreToGuess);
        System.out.println("Congrats! El numero era: " + numbreToGuess + " y te llevo " + contador);
    }
}
