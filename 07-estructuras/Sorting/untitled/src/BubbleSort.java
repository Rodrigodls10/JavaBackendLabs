import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println("Sorted array: " + Arrays.toString(array));
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,0};
        bubbleSort(data);
        System.out.println("Sorted array: " + Arrays.toString(data));
    }
}
