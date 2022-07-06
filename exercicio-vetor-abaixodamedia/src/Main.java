import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos elementos terão o vetor? ");
        int n = scan.nextInt();

        double[] vetor = new double[n];
        double soma = 0, media;

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um n°: ");
            vetor[i] = scan.nextDouble();
            soma += vetor[i];
        }
        media = soma/ vetor.length;

        System.out.println("Media do vetor = "+media);
        System.out.println("Elementos abaixo da média: ");
        for (int i = 0; i < vetor.length; i++){

            if (vetor[i]<media){
                System.out.println(vetor[i]);
            }

        }

    }
}
