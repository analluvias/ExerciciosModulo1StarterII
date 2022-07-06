import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos valores terão cada vetor? ");
        int n = scan.nextInt();

        int[] v1 = new int[n];
        int[] v2 = new int[n];
        int[] v3 = new int[n];

        System.out.println("Digite os valores do vetor a: ");
        for (int i = 0; i < v1.length; i++){
            v1[i] = scan.nextInt();
        }

        System.out.println("Digite os valores do vetor b: ");
        for (int i = 0; i < v2.length; i++){
            v2[i] = scan.nextInt();
        }

        System.out.println("Vetor resultante: ");
        for (int i = 0; i < v3.length; i++){
            v3[i] = v1[i] + v2[i];
            System.out.println(v3[i]);
        }
    }
}
