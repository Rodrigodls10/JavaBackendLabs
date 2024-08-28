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

        // Lógica de validación del número de tarjeta
        if (cardNumber == null || cardNumber.length() != 16 || !cardNumber.matches("\\d+")) {
            System.out.println("Authorization failed: Invalid card number.");
            return false;
        }

        // Validación del nombre del titular de la tarjeta
        if (cardHolderName == null || cardHolderName.isEmpty()) {
            System.out.println("Authorization failed: Card holder name is missing.");
            return false;
        }

        // TODO: implementar lógica de validación de la fecha de expiración

        System.out.println("Authorization successful for card ending in: " + cardNumber.substring(cardNumber.length() - 4));
        return true;
    }

    @Override
    public void processPayment(double amount) {
        if (authorizedPayment(amount)) {
            System.out.println("Processing credit card payment for: " + amount);

            // TODO: Implementar la lógica para procesar el pago
            System.out.println("Payment processed successfully for card ending in: " + cardNumber.substring(cardNumber.length() - 4));
        } else {
            System.out.println("Payment processing failed due to authorization error.");
        }
    } // Método auxiliar para validar la fecha de expiración
    private boolean isValidExpirationDate() {
        // Simulación simple que verifica si la fecha de expiración está en formato MM/YY y no está vencida
        // Esto se puede mejorar usando una fecha actual y comparando
        //!expirationDate.matches("(0[1-9]|1[0-2])/\\d{2}")) esto lo que hace es verificar que se ingrese un valor valido de mes y año
        if (expirationDate == null || !expirationDate.matches("(0[1-9]|1[0-2])/\\d{2}")) {
            return false;
        }

        // Lógica de verificación de la fecha 
        // En un entorno real sec debería comparar con la fecha actual.
        return true;
    }


}