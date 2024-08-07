package Listas;

import java.util.ArrayList;
import java.util.List;

public class MetodosComunesDeListas {
    public static void main(String[] args) {
        // Crear una lista de cadenas
        List<String> lista = new ArrayList<>();

        // Añadir elementos a la lista
        lista.add("Apple");
        lista.add("Banana");
        lista.add("Cherry");

        // Verificar si la lista contiene un elemento
        String elementoABuscar = "Banana";
        if (lista.contains(elementoABuscar)) {
            System.out.println("The list contains " + elementoABuscar);
        } else {
            System.out.println("The list does not contain " + elementoABuscar);
        }

        // Eliminar un elemento específico
        lista.remove("Banana");

        // Imprimir la lista después de la eliminación
        System.out.println("List after removal: " + lista);
    }
}
