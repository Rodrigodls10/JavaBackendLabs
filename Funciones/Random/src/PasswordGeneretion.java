import java.util.Random;

public class PasswordGeneretion {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$^-+=";

    public static void main(String[] args) {
        int lenght = 12; // Largo de la contrasena
        String password = generatePassword(lenght);
        System.out.println("Pass generada: " + password);
    }
    public static String generatePassword(int length) {
        Random random = new Random();
        StringBuilder password = new StringBuilder(length); // crea un string del tamano 12

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }
        return password.toString();
    }
}
