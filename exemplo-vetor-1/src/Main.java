import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?");
        int n = scan.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i<vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextInt();
        }

        System.out.println("Numeros negativos: ");

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }
    }
}
