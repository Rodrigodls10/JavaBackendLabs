import store.CreditCard;
import store.PaymentMethod;
import store.Paypal;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentMethod paymentMethod = null;
        int choice = 0;

        // Manejo de elección del método de pago
        while (true) {
            System.out.println("Seleccione el método de pago: ");
            System.out.println("1. Tarjeta de crédito");
            System.out.println("2. PayPal");

            try {
                choice = sc.nextInt(); // Posible InputMismatchException
                sc.nextLine(); // Consumir el newline
                if (choice != 1 && choice != 2) {
                    System.out.println("Opción no válida. Por favor ingrese 1 o 2.");
                    continue; // Repite el ciclo hasta que la entrada sea válida
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor ingrese un número.");
                sc.nextLine(); // Limpiar la entrada inválida
            }
        }

        // Manejo del pago según la elección
        if (choice == 1) {
            String cardNumber;
            while (true) {
                // Crear un objeto del tipo CreditCard
                System.out.println("Ingrese el número de tarjeta (16 dígitos): ");
                cardNumber = sc.nextLine();
                if (cardNumber.matches("\\d{16}")) {
                    break; // Sale del ciclo si es válido
                } else {
                    System.out.println("Número de tarjeta inválido. Debe contener 16 dígitos.");
                }
            }

            String cardHolderName;
            while (true) {
                System.out.println("Ingrese el nombre del titular: ");
                cardHolderName = sc.nextLine();
                if (cardHolderName.matches("[a-zA-Z\\s]+")) {
                    break; // Sale del ciclo si es válido
                } else {
                    System.out.println("El nombre del titular solo puede contener letras y espacios.");
                }
            }

            String expirationDate;
            while (true) {
                System.out.println("Ingrese la fecha de vencimiento (MM/YY): ");
                expirationDate = sc.nextLine();
                if (isValidExpirationDate(expirationDate)) {
                    break; // Sale del ciclo si es válido
                } else {
                    System.out.println("La tarjeta está vencida o la fecha es inválida.");
                }
            }

            paymentMethod = new CreditCard(cardNumber, cardHolderName, expirationDate);

        } else if (choice == 2) {
            String email;
            while (true) {
                System.out.println("Ingrese el correo electrónico de PayPal: ");
                email = sc.nextLine();
                if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                    break; // Sale del ciclo si es válido
                } else {
                    System.out.println("Correo electrónico inválido.");
                }
            }

            paymentMethod = new Paypal(email);
        }

        // Validación y procesamiento del monto
        double amount = 0;
        while (true) {
            System.out.println("Ingrese el monto a pagar: ");
            try {
                amount = sc.nextDouble(); // Posible InputMismatchException
                if (amount <= 0) {
                    System.out.println("El monto debe ser mayor que 0.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor ingrese un número válido para el monto.");
                sc.nextLine(); // Limpiar la entrada inválida
            }
        }

        // Procesar el pago
        if (paymentMethod != null) {
            paymentMethod.processPayment(amount);
        }

        sc.close();
    }

    // Validación de la fecha de expiración de la tarjeta
    private static boolean isValidExpirationDate(String expirationDate) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
            YearMonth expDate = YearMonth.parse(expirationDate, formatter);

            // Comparar con la fecha actual
            YearMonth currentMonth = YearMonth.now();
            return !expDate.isBefore(currentMonth); // Verificar que no esté vencida
        } catch (DateTimeParseException e) {
            return false; // Si el formato no es válido
        }
    }
}