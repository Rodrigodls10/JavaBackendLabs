import java.util.Scanner;

public class ControlDeAtracciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedir edada
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        //pedir altura
        System.out.println("Ingrese su altura");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Esta acompanado? (Si/No)");
        String acompanado = scanner.nextLine();
        boolean acompanadoBool = "Si".equalsIgnoreCase(acompanado);

        String resultado = evaluarAcceso(edad, altura, acompanadoBool);
        System.out.println("Tiene acceso: " + resultado); // devuelve si o no
        scanner.close();


    }
    /**
     * Evalua las condiciones de acceso a la atraccion
     * @param edad del visitante
     * @param altura del visitante en metros (1.80)
     * @para acompanado indica si viene con alguien que lo acompana
     * @return Un mensaje inidicando si esta permitido acceder o no (si o no)
     */
    public static String evaluarAcceso(int edad, double altura, boolean acompanadoBool){

    }
    /*

     */



}

