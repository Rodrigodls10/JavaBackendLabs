public class LinearSearch {
    public static void main (String [] args){
        int [] array = {10,20,30,40,50};
        int target = 30;
        int index = linearSearch (array, target);

        if (index != -1){
            System.out.println("Elemento encontrado en el indice " + index);
        }else {
            System.out.println("Elemento no encontrado");
        }


    }

    public static int linearSearch (int [] array, int target){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
