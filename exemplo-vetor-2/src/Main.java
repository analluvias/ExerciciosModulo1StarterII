import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números vai digitar? ");
        int n = scan.nextInt();

        double[] vetor = new double[n];

        double soma = 0, media;

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextDouble();

            soma += vetor[i];
        }
        media = soma / vetor.length;

        System.out.print("Valores = ");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
        System.out.println("SOMA = "+soma);
        System.out.println("MEDIA = "+media);

    }
}
