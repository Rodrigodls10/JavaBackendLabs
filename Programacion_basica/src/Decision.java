public class Decision {
    public static void main(String[] args) {
        // ejemplo
        int a = 6;
        int b=10;

        if (a > b ) {
            System.out.println("a es mayor que b");

        } else if (a < b) {
            System.out.println("a es menor que b");
        } else {
            System.out.println(" a es igual que b");
        }
        // switch
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;

        }


    }
}
