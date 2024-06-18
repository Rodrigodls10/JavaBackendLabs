import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        names.add("John");
        names.add("Jane");
        names.add("Bob");

        System.out.println(names);
        System.out.println("El primer elemento es: " + names.get(0));

        //borrar un elemento
        names.remove(2);
        System.out.println("Despues de eliminar a Bob: " + names);
        for (String name: names) {
            System.out.println("Nombre: " + names);
        }
    }
}
