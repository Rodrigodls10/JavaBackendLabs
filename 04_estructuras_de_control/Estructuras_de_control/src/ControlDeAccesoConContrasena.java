import java.util.Scanner;

public class ControlDeAccesoConContrasena {
    public static void main(String[] args) {
        //configurar la contrasena correcta
        //Final es una palabra clave para que un valor sea inmutable (que se vuelva constante)
        final String CONTRASENA_CORRECTA = "Java.2024";
        final int EDAD_MINIMA = 18;

        //Crear el scanner para ller la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        //solicitar la edad
        System.out.println("Ingrese si edad: ");
        int edad = scanner.nextInt();// nextInt() consume el numero pero no el salto de linea
        scanner.nextLine();




        // Verificar los requisitos minimos
        if (edad >= EDAD_MINIMA) {
            //pedimos la contrasena
            System.out.println("ingrese su contraseña para acceder: ");
            String contraseña = scanner.nextLine();

            // Verificar si la contrasena es correcta
            if (CONTRASENA_CORRECTA.equals(contraseña)) {
                System.out.println("Bienvenido al sistema");

            }else {
                System.out.println("Acceso denegado");
            }
        }else {
            System.out.println("Acceso denegado, no cumples con la edad minima.");



        }
    }
}
