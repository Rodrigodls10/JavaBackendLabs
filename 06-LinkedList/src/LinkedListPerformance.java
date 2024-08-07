import java.util.LinkedList;

public class LinkedListPerformance {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        int tamaño = 10000; // Tamaño de la lista para las pruebas

        // Llenar la lista con valores
        for (int i = 0; i < tamaño; i++) {
            lista.add(i);
        }

        // Medir el tiempo de inserción al principio
        long startTime = System.nanoTime();
        lista.addFirst(-1);
        long endTime = System.nanoTime();
        long tiempoInicio = endTime - startTime;

        // Medir el tiempo de inserción en el medio
        startTime = System.nanoTime();
        lista.add(tamaño / 2, 9999);
        endTime = System.nanoTime();
        long tiempoMedio = endTime - startTime;

        // Medir el tiempo de inserción al final
        startTime = System.nanoTime();
        lista.addLast(10001);
        endTime = System.nanoTime();
        long tiempoFinal = endTime - startTime;

        // Imprimir los tiempos
        System.out.println("Time taken to insert at the beginning: " + tiempoInicio + " ns");
        System.out.println("Time taken to insert in the middle: " + tiempoMedio + " ns");
        System.out.println("Time taken to insert at the end: " + tiempoFinal + " ns");
    }
}