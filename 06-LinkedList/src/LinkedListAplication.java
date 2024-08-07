import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAplication {
    public static void main(String[] args) {
        // Crear una LinkedList para implementar la cola
        Queue<String> cola = new LinkedList<>();

        // Encolar elementos
        cola.add("A");
        cola.add("B");
        cola.add("C");
        cola.add("D");

        // Imprimir la cola después de encolar elementos
        System.out.println("Queue after enqueuing elements: " + cola);

        // Desencolar un elemento
        String elementoDesencolado = cola.remove();

        // Imprimir el elemento desencolado
        System.out.println("Element dequeued: " + elementoDesencolado);

        // Imprimir la cola después de desencolar un elemento
        System.out.println("Queue after dequeuing an element: " + cola);
    }
}
