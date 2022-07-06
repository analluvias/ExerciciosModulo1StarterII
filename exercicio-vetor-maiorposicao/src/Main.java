import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar? ");
        int n = scan.nextInt();

        double[] vetor = new double[n];
        double maiorValor=0;
        int posMaiorValor=0;

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = scan.nextDouble();

            if (i == 0){
                maiorValor = vetor[i];
                posMaiorValor = 0;
            } else if (vetor[i]>maiorValor) {
                maiorValor = vetor[i];
                posMaiorValor = i;
            }

        }

        System.out.println("Maior valor: "+maiorValor);
        System.out.println("Posição maior valor: "+posMaiorValor);

    }
}
