import java.util.ArrayList;
import java.util.List;

public class MultiDImensionalList {
    public static void main(String[] args) {
        //Crear una lista de listas de enteros
        List<List<Integer>> matrix = new ArrayList<>();


        // agregar filas a la matriz
        for (int i = 0; i < 3; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(i * j);
            }
            //
        }
    }
}
