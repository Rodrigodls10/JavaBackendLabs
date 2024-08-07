package Listas;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedListTiempo {
    public static void main(String[] args) {
        // Tamaño inicial de las listas
        int size = 100000;

        // Crear y llenar ArrayList y LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Medir el tiempo de inserción en ArrayList
        long startTime = System.nanoTime();
        arrayList.add(size / 2, -1); // Inserción en el medio
        long endTime = System.nanoTime();
        long arrayListInsertionTime = endTime - startTime;

        // Medir el tiempo de inserción en LinkedList
        startTime = System.nanoTime();
        linkedList.add(size / 2, -1); // Inserción en el medio
        endTime = System.nanoTime();
        long linkedListInsertionTime = endTime - startTime;

        // Medir el tiempo de eliminación en ArrayList
        startTime = System.nanoTime();
        arrayList.remove(size / 2); // Eliminación en el medio
        endTime = System.nanoTime();
        long arrayListRemovalTime = endTime - startTime;

        // Medir el tiempo de eliminación en LinkedList
        startTime = System.nanoTime();
        linkedList.remove(size / 2); // Eliminación en el medio
        endTime = System.nanoTime();
        long linkedListRemovalTime = endTime - startTime;

        // Imprimir los tiempos de inserción y eliminación
        System.out.println("ArrayList insertion time: " + arrayListInsertionTime + " ns");
        System.out.println("LinkedList insertion time: " + linkedListInsertionTime + " ns");
        System.out.println("ArrayList removal time: " + arrayListRemovalTime + " ns");
        System.out.println("LinkedList removal time: " + linkedListRemovalTime + " ns");
    }
}
