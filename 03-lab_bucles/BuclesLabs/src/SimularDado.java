import java.util.Random;

public class SimularDado {
    public static void main(String[] args) {
        int [] contador = new int[6];
        Random random = new Random();
        for (int i = 0; i<100; i++) {
            int resultado = random.nextInt(6) + 1;
            contador[resultado - 1]++;
        }
        for (int i = 0; i <contador.length; i++) {
            System.out.println("Cara " + (i+1) + ": " + contador[i] + " veces");
        }

    }
}
