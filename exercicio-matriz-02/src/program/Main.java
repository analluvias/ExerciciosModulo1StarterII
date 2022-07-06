package program;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas e colunas da matriz: ");
        int n = scan.nextInt(), m = scan.nextInt();

        int[][] matriz = new  int[n][m];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.printf("[%d][%d] = ", i , j);
                matriz[i][j] = scan.nextInt();

            }

        }

        System.out.println("Digite o número de referência: ");
        int numReferecia = scan.nextInt();

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == numReferecia){

                    System.out.printf("Position: [%d][%d]%n", i, j);

                    if (i != 0){
                        procuraAcima(matriz, i , j);
                    }
                    if (i < matriz.length - 1){
                        procuraAbaixo(matriz, i , j);
                    }
                    if (j != 0){
                        procuraAEsquerda(matriz, i , j);
                    }
                    if (j < matriz[i].length - 1){
                        procuraAdireita(matriz, i , j);
                    }
                    System.out.println();
                }

            }

        }
    }

    private static void procuraAdireita(int[][] matriz, int i, int j) {

        int num = matriz[i][j+1];

        System.out.println("Right: "+num);
    }

    private static void procuraAEsquerda(int[][] matriz, int i, int j) {

        int num = matriz[i][j-1];

        System.out.println("Left: "+num);
    }

    public static void procuraAcima(int[][] matriz, int i, int j){

        int num = matriz[i-1][j];

        System.out.println("Up: "+num);

    }

    private static void procuraAbaixo(int[][] matriz, int i, int j) {

        int num = matriz[i+1][j];

        System.out.println("Down: "+num);

    }

}
