public class SumaDiagonal {
    public static void main(String[] args) {
        int [][] Matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };
        int SumaDiagonal = 0;
        for (int i = 0; i < Matriz.length; i++) {
            SumaDiagonal += Matriz[i][i];
        }
        System.out.println("Suma diagonal: " + SumaDiagonal);
    }
}
