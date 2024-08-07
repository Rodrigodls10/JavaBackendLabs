package Arrays;

public class ArraysMultidimensionales {
    public static void main(String[] args) {
        // Crear e inicializar una matriz de 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Variable para almacenar la suma de los elementos de la diagonal principal
        int sumaDiagonal = 0;

        // Sumar los elementos de la diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];
        }

        // Imprimir la suma de los elementos de la diagonal principal
        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
    }
}


