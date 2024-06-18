import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<>(); // Por ejemplo : ["Jose Perez" , "Pedro Fernandez", ..]
        int option;

        do {
            System.out.println("1. Crear usuario");
            System.out.println("2. Borrar usuario");
            System.out.println("3. Mostrar usuario");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opcion: ");
            option = sc.nextInt();
            sc.nextLine(); // Consumir el salto de numero que tenia el numero

            switch (option) {
                case 1:
                    System.out.println("Ingrese el nombre del usuario: ");
                    String NewUser = sc.nextLine();
                    users.add(NewUser);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del usuario a borrar: ");
                    String UserToRemove = sc.nextLine();
                    users.remove(UserToRemove);
                    break;
                case 3:
                    System.out.println("Usuarios: ");
                    for (String user : users) {
                        System.out.println(user);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }while (option != 4);
        sc.close();
    }
}
