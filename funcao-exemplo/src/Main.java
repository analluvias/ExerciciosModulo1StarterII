import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2, n3;

        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();

        int maior = max(n1, n2, n3);

        showResult(maior);

    }

    public static int max (int n1, int n2, int n3){
        int aux;

        if (n1 > n2 && n1 > n3){
            aux = n1;
        } else if (n2 > n3) {
            aux = n2;
        }
        else {
            aux = n3;
        }

        return aux;
    }

    public static void showResult(int valor){
        System.out.printf("O maior é %d", valor);
    }
}
