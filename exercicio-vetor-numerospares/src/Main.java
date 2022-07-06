import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar? ");
        int n = scan.nextInt();

        int[] vetor = new int[n];
        String numPares = "";
        int qtdPares = 0;

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextInt();

            if (vetor[i] % 2 == 0){
                qtdPares += 1;
                numPares += vetor[i] + " ";
            }
        }
        System.out.println("Numeros pares: \n"+ numPares);
        System.out.println();
        System.out.println("Quantidade de pares: "+ qtdPares);
    }
}
