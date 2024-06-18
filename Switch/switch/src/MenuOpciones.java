        import org.w3c.dom.ls.LSOutput;

        import java.util.Scanner;
public class MenuOpciones {
    public static void main(String[] args) {
//        switch (expression) {
//            case value1:
//                //bloque de codigo a ejecutar
//                break;
//            case value2:
//                //bloque de codigo a ejecutar
//                break;
//            default:
//                //bloque se ejecuta si ninguno de los casos anteriores coinciden
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un opcion: ");
        System.out.println("1. Iniciar juego");
        System.out.println("2. Configuracion");
        System.out.println("3. Salir");
        int opcion = sc.nextInt();
        switch(opcion) {
            case 1:
                System.out.println("Iniciando el juego");
                break;
            case 2:
                System.out.println("Abriendo configuraciones...");
                break;
            case 3:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Opcion invalida");
        }


        }


    }

