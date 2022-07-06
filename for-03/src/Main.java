import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n;
        float P1 = 2, P2 = 3, P3=5, v1, v2, v3, m;

        n = scan.nextInt();

        for (int i=0; i<n; i++){

            v1 = scan.nextFloat();
            v2 = scan.nextFloat();
            v3 = scan.nextFloat();

            m = (v1*P1 + v2*P2 + v3*P3)/10;

            System.out.printf("%.1f %n", m);

        }
    }
}
