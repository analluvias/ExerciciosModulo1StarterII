import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int inteiro;
        double pontof;

        System.out.println("String: ");
        x = sc.next();
        System.out.println(x);

        System.out.println("Inteiro");
        inteiro = sc.nextInt();
        System.out.println(inteiro);

        System.out.println("Float/Double");
        pontof = sc.nextDouble();
        System.out.println(pontof);


        sc.close();
    }
}
