package store;

public class Paypal implements PaymentMethod{
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public boolean authorizedPayment(double amount){
        System.out.println("Authorizing PayPal payment for: " + amount);
        // TODO: Logica de autorizacion del PayPal
        if (email == null || email.isEmpty()) {
            System.out.println("Authorizing PayPal payment failed: No email associated with PayPal account.");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Authorizing PayPal payment failed: Invalid amount.");
        }
        return false;
    }


    @Override
    public void processPayment(double amount) {
        // TODO: logica de procesamiento de pago
        if (authorizedPayment(amount)) {
            System.out.println("Processing PayPal payment for: " + amount);

            //simulando la logica de procesamiento

            System.out.println("Payment processed successfully for PayPal account." + email);

        }else {
            System.out.println("Payment processing failed. Payment failed.");
        }
    }
}

