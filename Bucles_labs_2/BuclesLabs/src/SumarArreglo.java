public class SumarArreglo {
    public static void main(String[] args) {
        int[] Arreglo = {5,6,8,10,54,67,90};
        System.out.println("El arreglo contiene los numeros: 5,6,8,10,54,67,90");
        int suma = 0;
        for (int i = 0; i < Arreglo.length; i++) {
            suma += Arreglo[i];
        }
        System.out.println("La suma del arreglo es: " + suma);
    }
}
