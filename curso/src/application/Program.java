package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Medidas do triângulo x");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Medidas do triângulo y");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Área triangulo x: %.4f%n", areaX);
        System.out.printf("Área triângulo y: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Maior: x");
        }else {
            System.out.println("Maior: y");
        }

        scan.close();

    }
}
