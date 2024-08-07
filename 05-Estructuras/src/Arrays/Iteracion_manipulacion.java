package Arrays;

public class Iteracion_manipulacion {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        // Duplicar los valores de cada elemento del array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * 2;
        }

        // Imprimir el array modificado
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}

