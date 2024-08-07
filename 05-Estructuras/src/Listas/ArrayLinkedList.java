package Listas;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        // Crear y llenar LinkedList
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        // Medir el tiempo de acceso en ArrayList
        long startTime = System.nanoTime();
        Integer elementArrayList = arrayList.get(50000); // Acceder a un elemento en el medio
        long endTime = System.nanoTime();
        long arrayListTime = endTime - startTime;

        // Medir el tiempo de acceso en LinkedList
        startTime = System.nanoTime();
        Integer elementLinkedList = linkedList.get(50000); // Acceder a un elemento en el medio
        endTime = System.nanoTime();
        long linkedListTime = endTime - startTime;

        // Imprimir los tiempos de acceso
        System.out.println("Tiempo de acceso a la ArrayList: " + arrayListTime + " ns");
        System.out.println("Tiempo de acceso a la LinkedList: " + linkedListTime + " ns");
    }
}


