public class TiposPrimitivos {
    public static void main(String[] args) {
        /**
         * declaraciones de diferentes tipos de variables primitivas
         * cada una puede contener datos especificos segun su rango
         */
        byte alimnos = 9; // byte tiene valores de 8 bits -128 al 127
        short prestamos = 15800; // short tiene 16 bits -32768 al 32767
        int cantidad = 10; // valores de 32 bits -2.147.483.648 a 2.147.483.647
        long deuda = 4588990;  // son numeros de 64 bit (super grandes)

        // decimales
        double precioProducto = 29.99; // mayor precision que float
        float temperatura = 25.5f; // debo indicar con la f que es un valor float, tiene menos precision

        // operaciones con enteros
        int suma = cantidad + 5; // suma de enteros
        int resta = cantidad - 5; // resta de enteros
        long multiplicacion = deuda * 25; // multiplicacion
        short division = (short) (prestamos / 3); // dividir y hacer un casting

        // decimales
        double divisionDecimal = precioProducto / 3.0;
        float incremento = temperatura = 2.5f;

        // Caracteres
        char letrainicial = 'A';
        char letraFinal = 'Z'; // se envuelve con comillas simples

        // booleanos
        boolean esMayor = true;

        System.out.println("Suma:" + suma);
        System.out.println("resta:" + resta);
        System.out.println("Multiplicacion:" + multiplicacion);
        System.out.println("Suma:" + suma);
        System.out.println("Suma:" + suma);
        System.out.println("Suma:" + suma);


    }
}
