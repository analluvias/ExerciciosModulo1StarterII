import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B, C, D, diferenca;

        A = scan.nextInt();

        B = scan.nextInt();

        C = scan.nextInt();

        D = scan.nextInt();

        diferenca = (A*B - C*D);

        System.out.printf("Diferenca = %d", diferenca);

    }
}
