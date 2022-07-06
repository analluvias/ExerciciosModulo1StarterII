import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, fatorial=1;

        n = scan.nextInt();

        for (int i = 1; i<=n; i++){

            fatorial *= i;

        }

        System.out.println(fatorial);
    }
}
