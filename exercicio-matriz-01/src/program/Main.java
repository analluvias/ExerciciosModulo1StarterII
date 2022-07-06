package program;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a ordem da matriz: ");
        int n = scan.nextInt();

        int[][] matriz = new int[n][n];

        int valoresNegativos=0;


        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j<matriz[i].length; j++){

                System.out.printf("[%d][%d] = ", i, j);
                matriz[i][j] = scan.nextInt();

                if (matriz[i][j] < 0){
                    valoresNegativos += 1;
                }
            }

        }

        System.out.println("\nDiagonal principal: ");
        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j<matriz[i].length; j++){

                if (i == j){
                    System.out.print(matriz[i][j]+ " ");
                }
            }

        }

        System.out.println("\nValores negativos: "+valoresNegativos);

        scan.close();
    }

}
