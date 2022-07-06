import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t1, t2, total;
        int dia1, dia2;

        t1 = scan.nextInt();
        t2 = scan.nextInt();

        if (t2 > t1){
            total = t2 - t1;
        }
        else {
            dia1 = 24 - t1;
            dia2 = t2;

            total = dia1 + dia2;
        }

        System.out.printf("O JOGO DUROU: %d HORAS", total);

    }
}
