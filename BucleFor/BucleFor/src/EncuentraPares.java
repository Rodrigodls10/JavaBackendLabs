public class EncuentraPares {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //array tiene los elementos ordenados
        int sumaDeseada = 10;
        System.out.println("Pares que suman " + sumaDeseada + " :");
        //      System.out.println("numeros [0]" + numeros[0]);
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros [i] + numeros[j] == sumaDeseada) {
                    System.out.println(numeros[i]+ " + " + numeros[j]+ "=" + sumaDeseada);
                }
            }
        }
    }
}
