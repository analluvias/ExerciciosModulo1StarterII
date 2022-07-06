import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n;
        float n1, n2, divisao;

        n = scan.nextInt();

        for (int i =0; i < n; i++){
            n1 = scan.nextFloat();
            n2 = scan.nextFloat();

            divisao = n1/n2;

            if (n2 != 0){
                System.out.printf("%.1f %n", divisao);
            }
            else {
                System.out.println("divisão impossível");
            }
        }
    }
}
