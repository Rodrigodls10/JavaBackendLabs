import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("mid = " + mid);

            if (array[mid] == key) {
                return mid;
            }else if (array[mid] < key) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int [] data = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190};
        int key = 30;
        int result = binarySearch(data, key);

        if (result == -1) {
            System.out.println("Element not found");
        }else {
            System.out.println("Element found: " + result);
        }
    }
}
