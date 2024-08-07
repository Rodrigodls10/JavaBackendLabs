package Listas;
import java.util.List;
import java.util.ArrayList;

public class Listaslab {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        // Añadir elementos del 1 al 5
        for (int i = 1; i <= 5; i++) {
            lista.add(i);
        }

        // Imprimir la lista
        System.out.println("List: " + lista);
    }
}


