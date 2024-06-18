public class Area {
    // Metodo para calcular el area de un circulo
    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }
    // sobrecargar para calcular el area de un rectangulo
    public static double calcularArea(double largo, double ancho) {
        return largo * ancho;
    }

    public static void main(String[] args) {
        System.out.println("El area del circulo con radio 5 es: " + calcularArea(5.0));
        System.out.println("El area del rectangulo de 6x8 es: " + calcularArea(6.0, 8.0));
    }
}
