import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        a = scan.nextInt();

        b = scan.nextInt();

        if ((a % b == 0) || (b % a == 0)){
            System.out.printf("Sâo Multiplos");
        }
        else {
            System.out.printf("Não são Multiplos");
        }
    }
}
