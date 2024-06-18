import java.util.Scanner;

public class MesesDelAnio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        switch (mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            default:
                System.out.println("Mes no reconocido");
        }
    }
}
