import java.util.LinkedList;
import java.util.List;

public class IntroLinkedList {
    public static void main(String[] args) {
        // Crear una LinkedList de cadenas
        List<String> lista = new LinkedList<>();

        // Añadir elementos a la LinkedList
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");
        lista.add("JavaScript");

        // Imprimir la LinkedList
        System.out.println("LinkedList: " + lista);

        LinkedList<String> linkedList = (LinkedList<String>) lista; // Cast a LinkedList

        // Obtener el primer y último elemento
        String primerElemento = linkedList.getFirst();
        String ultimoElemento = linkedList.getLast();

        // Imprimir el primer y último elemento
        System.out.println("First element: " + primerElemento);
        System.out.println("Last element: " + ultimoElemento);

        lista.removeFirst();
        lista.removeLast();

        // Imprimir la LinkedList después de removeFirst y removeLast
        System.out.println("LinkedList after removeFirst and removeLast: " + lista);
    }
}




