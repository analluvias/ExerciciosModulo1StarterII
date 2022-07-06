import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, in=0, out=0, num;

        n = scan.nextInt();

        for (int i=0; i<n; i++){

            num = scan.nextInt();

            if (num >= 10 && num <= 20){
                in += 1;
            }else {
                out += 1;
            }

        }

        System.out.printf("%d in %n", in);
        System.out.printf("%d out", out);
    }
}
