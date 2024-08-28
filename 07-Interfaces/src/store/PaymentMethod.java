package store;

// definir la interfaz llamada PaymentMethod
public interface PaymentMethod {
    // defino dos metodos, que no tienen cuerpo (solo la firma)
    // que devuelven un boolean y otro que no devuelve nada (void)
    // cada vez que una clase implemente esta interfaz, estara obligada a proporcionar sus versiones de estos metodos
    boolean authorizedPayment(double amount);
    void processPayment(double amount);
}
