public class Funcion {
    public static void main (String[] args){
         // llamo a la funcion multiplicar
        int operacion = multiplicar(4,5);
        System.out.println("El valor de la operacion es:" + operacion);
        int operacion2 = multiplicar(8,9);
        System.out.println("El valor de la operacion es:" + operacion2);
    }
    public static int multiplicar(int num1, int num2) {
        int resultado= 0;
        resultado = num1 * num2;
        return resultado;
        //return = num1 * num2 es lo mismo que escribirlo en tres lineas de arriba

    }
}
