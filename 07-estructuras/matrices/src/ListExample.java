import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        //Lista de enteros
        List<Integer> numbers = new ArrayList<Integer>(); // array redimensionable

        //agregar elementos a la lista
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //imprimo la lista
        System.out.println(numbers);
    }
}
