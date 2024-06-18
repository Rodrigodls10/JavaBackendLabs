public class Main {
    /**
     * El metodo main es el punto de entrada de cualquier porograma java
     * Este metodo ivoca a una calculadora simple para demostrar operaciones basicas
     *
     * @param args Argumentos de linea de comando
     */
    public static void main(String[] args) {
        int numero_1 = 25;  // declaro que inicializo la variable numero_1 con el valor 25
        int numero_2 = 5;
        int numero_3 =18;
        System.out.println("Suma: " + (numero_1 + numero_2));

        numero_2 = 50;

        // Realizando peraciones basicas
        System.out.println("Suma: " + (numero_1 + numero_2));

        int resultado_resta = numero_1 - numero_2;
        System.out.println("resta: " + resultado_resta);


    }
}
