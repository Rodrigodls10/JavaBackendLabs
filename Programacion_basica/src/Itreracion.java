public class Itreracion {
    public static void main(String[] args) {
        // for - while - do - while

        // Ciclo for mas adecuado para cuando tengo todo controlado y se cuando empiezo y cuando termino

        for (int i = 0; i < 5; i++) { // i++ siguinifica que vaya aumentando el valor de i de 1 en 1
            System.out.println("i vale: " + i);
        }

        // cilco while
        // mas adecuado para cuando no tengo tan claras las veces que voy a repetir el ciclo
        int j = 0;
        while (j < 5) {
            System.out.println("j es =" + j);
            j++;
        }

        // do-while
        // al menos una vez se va a ejecutar
        int k = 0;
        do {
            System.out.println("K =" + k);
            k++;
        } while (k<6);
        System.out.println("Al finalizar el bloque do-while k vale:" + k );

    }
}
