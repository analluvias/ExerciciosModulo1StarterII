import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double width, height;

        System.out.println("Entre com a largura e altura do retângulo: ");
        width = scan.nextDouble();
        height = scan.nextDouble();

        Rectangle r1 = new Rectangle(width, height);

        System.out.printf("AREA: %.2f%n", r1.Area());

        System.out.printf("PERIMETRO: %.2f%n", r1.Perimeter());

        System.out.printf("DIAGONAL: %.2f",r1.Diagonal());
    }
}
