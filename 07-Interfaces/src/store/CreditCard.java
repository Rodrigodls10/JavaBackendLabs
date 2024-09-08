package store;

public class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;

    public CreditCard(String cardNumber, String cardHolderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean authorizedPayment(double amount) {
        System.out.println("Authorizing credit card payment for: " + amount);

        // Validar el número de tarjeta
        if (cardNumber == null || cardNumber.length() != 16 || !cardNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Número de tarjeta inválido. Debe contener 16 dígitos.");
        }

        // Validar el nombre del titular
        if (cardHolderName == null || cardHolderName.isEmpty()) {
            throw new IllegalArgumentException("El nombre del titular no puede estar vacío.");
        }

        // Validar la fecha de expiración
        if (!isValidExpirationDate()) {
            throw new IllegalArgumentException("La tarjeta está vencida o la fecha de expiración es inválida.");
        }

        System.out.println("Authorization successful for card ending in: " + cardNumber.substring(cardNumber.length() - 4));
        return true;
    }

    @Override
    public void processPayment(double amount) {
        try {
            if (authorizedPayment(amount)) {
                System.out.println("Processing credit card payment for: " + amount);
                // Aquí iría la lógica para procesar el pago
                System.out.println("Payment processed successfully for card ending in: " + cardNumber.substring(cardNumber.length() - 4));
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Payment processing failed: " + e.getMessage());
        }
    }

    // Método auxiliar para validar la fecha de expiración
    private boolean isValidExpirationDate() {
        if (expirationDate == null || !expirationDate.matches("(0[1-9]|1[0-2])/\\d{2}")) {
            return false;
        }
        // Lógica para verificar que la fecha no esté vencida (esto se puede mejorar con una comparación real)
        return true;
    }
}