import java.util.Scanner;

public class ControlDeAccesoMejorado {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Tipos de eventos disponibles: Infantil, Juvenil, Adultos");
        System.out.println("Ingrese el tipo de evento que desea Acceder");
        String tipoEvento = scanner.nextLine();
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        //determinar el acceso basado en el tipo de evento y la edad
        /*
        .equalsIgnoreCase es un miembro de la calse string. Es un metodo que compara dos cadenas de texto
        para determinar si son iguales
        "texto".equalsIgnoreCase(String"texto a comparar"), es booleano, verdadero si son iguales, falso sino
        IgnoreCase ignora las mayusculas. Texto es igual a texto TEXTO = texto
        Juan juan o Infantil infantil
         */
        if ("infantil".equalsIgnoreCase(tipoEvento)) {
            System.out.println("Bienvenido al evento infantil");
        } else if ("juvenil".equalsIgnoreCase(tipoEvento)){
                if (edad>=12) {
                    System.out.println("Bienvenido al evento juvenil");
                }else {
                    System.out.println("Lo sentimos, debe tener al menos 12 años para ingresar al evento.");
                }

            }else if ("Adultos".equalsIgnoreCase(tipoEvento)){
            if (edad>=18) {
                System.out.println("Bienvenido al evento de adultos");

            }else {
                System.out.println("Lo sentimos, usted no tiene la edad necesaria para este evento");
            }
            scanner.close();

        }
        }
    }

