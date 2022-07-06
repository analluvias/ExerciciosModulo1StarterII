import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String nome;
        double n1, n2, n3;

        System.out.println("Digite nome, nota 1, nota 2 e nota 3");
        nome = scan.nextLine();
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        n3 = scan.nextDouble();

        Student s1 = new Student(nome, n1, n2, n3);

        s1.situacaoAluno();
    }
}
