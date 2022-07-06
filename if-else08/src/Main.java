import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double salario, imposto=0;

        salario = scan.nextDouble();

        if (salario <= 2000){
            System.out.println("Isento");

        } else {
            salario = salario - 2000;

            if (salario > 0){

                if (salario > 1000){
                    imposto += (float) 1000 * 8/100;

                }
                else {
                    imposto += salario * 8/100;

                }

                salario -= 1000;
            }

            if (salario > 0){
                if (salario > 1500){
                    imposto += (float) 1500 * 18/100;

                }
                else {
                    imposto += salario * 18/100;
                }

                salario -= 1500;
            }

            if (salario > 0){
                imposto += salario * 28 / 100;

            }

            System.out.printf("R$ %.2f", imposto);
        }
    }
}
