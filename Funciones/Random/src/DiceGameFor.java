import java.util.Scanner;

public class DiceGameFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de veces que vas a tirar los dados");
        int n = sc.nextInt();
        sc.close();

        int [] frequencies = new int [13]; // un array de 13 elementos, los valores van del 2 al 12
        // Los indices de frequencies son [0,1,2,3,4,5,6,7,8,9,10,11,12] por eso int [13]

        for (int i = 0; i < n; i++) {
            int dice1 = rollDice();
            int dice2 = rollDice();
            int sum = dice1 + dice2;
            frequencies[sum]++;
        }
        System.out.println("Resultados despues de lanzar los dados " + n + " veces");
        for (int i = 2; i<=12; i++){
            System.out.println("NUmero: " + i + " salio " + frequencies[i] + " veces");
        }
    }
    public static int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }
}
