package store;

public class Paypal implements PaymentMethod {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public boolean authorizedPayment(double amount) {
        System.out.println("Authorizing PayPal payment for: " + amount);

        // Validación de email
        if (email == null || email.isEmpty() || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            System.out.println("Authorization failed: Invalid email address.");
            return false;
        }

        // Validación de monto
        if (amount <= 0) {
            System.out.println("Authorization failed: Amount must be greater than zero.");
            return false;
        }

        // Puedes agregar un límite máximo de pago si es necesario
        double MAX_PAYMENT_AMOUNT = 10000.00; // Ejemplo de límite máximo
        if (amount > MAX_PAYMENT_AMOUNT) {
            System.out.println("Authorization failed: Amount exceeds maximum limit.");
            return false;
        }

        // Si todas las validaciones son correctas, autorizamos el pago
        System.out.println("Authorization successful for PayPal account: " + email);
        return true;
    }

    @Override
    public void processPayment(double amount) {
        // Procesamos el pago solo si la autorización es exitosa
        if (authorizedPayment(amount)) {
            System.out.println("Processing PayPal payment for: " + amount);

            // Simulación de la lógica de procesamiento
            try {
                // Aquí iría la lógica para comunicarse con la API de PayPal.
                // Por ejemplo, podrías hacer una solicitud HTTP para procesar el pago.

                System.out.println("Payment processed successfully for PayPal account: " + email);
            } catch (Exception e) {
                // Manejo de errores durante el procesamiento del pago
                System.out.println("Error during payment processing: " + e.getMessage());
            }
        } else {
            System.out.println("Payment processing failed. Authorization error.");
        }
    }
}
