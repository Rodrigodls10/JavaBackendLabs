public class MaximoArreglo {
    public static void main(String[] args) {
        int[] arreglo = {6,8,9,23,54,76,88};
        int Maximo = arreglo[0];
        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i] > Maximo){
                Maximo = arreglo[i];
            }

        }
        System.out.println("El maximo de arreglo es: "+Maximo);
    }

}

