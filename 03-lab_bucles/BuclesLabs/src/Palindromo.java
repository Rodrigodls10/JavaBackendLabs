import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su palabra:");
        String palindromo = sc.nextLine();
        String PalindromoSinNada = palindromo.replaceAll("[\\s.,!?]", "");


        boolean palindromoValido = true;
        for (int i = 0; i < PalindromoSinNada.length() / 2; i++){
            if(PalindromoSinNada.charAt(i) != PalindromoSinNada.charAt(PalindromoSinNada.length() -1 -i)){
                palindromoValido = false;

            }
        }
        if(palindromoValido){
            System.out.println("Palindromo valido");
        }else {
            System.out.println("Palindromo invalido");
        }



    }
}






