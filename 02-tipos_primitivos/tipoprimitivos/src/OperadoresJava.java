public class OperadoresJava {
    public static void main(String[] args) {
        // operadores aritmeticos
        int a = 10, b = 3, c = 25;
        System.out.println("aritmeticos:");
        System.out.println( "suma:" + a + b);
        System.out.println( " suma (con parentesis):" + (a +b));
       // System.out.println("resta:" + a - b); no se puede pasar el signo de menos solo
        System.out.println("resta:" + (a - b));
        System.out.println("multiplicacion:" + (a * b));
        System.out.println("division:" + (a / b)); // division
        System.out.println("modulo:" + (a % b)); // residuo de la division
        System.out.println(10/2);
        System.out.println(846%2);

        // operadores de asignacion
        System.out.println("c antes:" +c); // 25
        c += 5; // c= c+5
        System.out.println("c despues:" +c); // 30

        // operadores de comparacion
        System.out.println("\nconmparacion");
        System.out.println("a==b:" + (a==b)); // Me dice que a = b cosa que es falso
        System.out.println("a!=b:" + (a!=b)); // me dice que a es diferente de b "diferente de"
        System.out.println("a>b:" + (a>b));
        System.out.println("a<b:" + (a<b));
        System.out.println("a<=b:" + (a<=b));
        System.out.println("a>=b:" + (a>=b));




    }
}
