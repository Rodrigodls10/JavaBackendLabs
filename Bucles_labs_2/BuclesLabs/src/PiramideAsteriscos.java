public class PiramideAsteriscos {
    public static void main(String[] args) {
        int altura = 5;

        for (int i = 1; i <= altura; i++) {
            for (int j = altura - i; j >= 1 ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i *2 -1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
