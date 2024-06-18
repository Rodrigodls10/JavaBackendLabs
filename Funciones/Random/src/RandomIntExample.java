public class RandomIntExample {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int randomInt = (int) (Math.random() * (max - min + 1)) + min; // rango desde 0 hasta max - min + 1
        System.out.println("Random number: " + min + " y " + max + " = " + randomInt);
    }
}
