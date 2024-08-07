package Arrays;
import java.util.Arrays;

public class MetodosUtiles {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 1, 2};

        // Ordenar el array
        Arrays.sort(numeros);

        // Imprimir el array ordenado
        System.out.println("Arreglo ordenado " + Arrays.toString(numeros));

        // Buscar un elemento en el array
        int elementoABuscar = 3;
        int indice = Arrays.binarySearch(numeros, elementoABuscar);

        // Imprimir el resultado de la búsqueda
        if (indice >= 0) {
            System.out.println("Elemento " + elementoABuscar + " esta en la posicion " + indice);
        } else {
            System.out.println("Elemento " + elementoABuscar + " no encontrado en el arreglo.");
        }
    }
}


