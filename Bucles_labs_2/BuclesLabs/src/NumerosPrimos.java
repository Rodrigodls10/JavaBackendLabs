public class NumerosPrimos {
    public static void main(String[] args) {
        for (int numero = 2; numero <= 100; numero++) {
            boolean esPrimo = true;
            for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
                if (numero % divisor == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println("Los numeros primos hasta el 100 son:" + numero);
            }
        }
    }
}
