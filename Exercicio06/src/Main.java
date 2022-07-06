import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        float a, b, c;
        double pi = 3.14159, aTriangulo, aCirculo, aTrapezio, aQuadrado, aRetangulo;

        a = scan.nextFloat();

        b = scan.nextFloat();

        c = scan.nextFloat();

        aTriangulo = a * c / 2;

        aCirculo = pi * c * c;

        aTrapezio = (a + b) * c / 2;

        aQuadrado = b*b;

        aRetangulo = a*b;

        System.out.printf("Triangulo = %.3f %n", aTriangulo);
        System.out.printf("Circulo = %.3f %n", aCirculo);
        System.out.printf("Trapezio = %.3f %n", aTrapezio);
        System.out.printf("Quadrado = %.3f %n", aQuadrado);
        System.out.printf("Retangulo = %.3f %n", aRetangulo);
    }
}
