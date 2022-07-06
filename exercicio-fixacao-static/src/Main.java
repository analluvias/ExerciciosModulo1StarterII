import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double preco, dolaresComprados;

        System.out.print("Qual o preço do dolar? ");
        preco = scan.nextDouble();

        System.out.print("Quantos dolares deseja comprar?");
        dolaresComprados = scan.nextDouble();

        System.out.printf("Preço a pagar em reais: %.2f", CurrencyConverter.converter(preco, dolaresComprados));
    }
}
