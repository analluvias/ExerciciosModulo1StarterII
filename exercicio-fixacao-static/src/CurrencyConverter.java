public class CurrencyConverter {
    public static final double TAXA = 0.06;

    public static double converter(double preco, double dolares){
        double total = preco * dolares + preco * dolares * TAXA;
        return total;
    }
}
