import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entrada, alcool=0, gasolina=0, diesel=0;

        while (true){
            entrada = scan.nextInt();

            if (entrada == 1){
                alcool += 1;
            } else if (entrada == 2) {
                gasolina+=1;
            } else if (entrada == 3) {
                diesel+=1;
            } else if (entrada == 4) {
                break;
            }

        }

        System.out.println("Muito obrigada!");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);
    }
}
