public class DiceGame {
    public static void main(String[] args) {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int sum = dice1 + dice2;
        System.out.println("Lanzamiento de dado 1: " + dice1 + "\nLanzamiento de dado 2: " + dice2);


    }


    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}
