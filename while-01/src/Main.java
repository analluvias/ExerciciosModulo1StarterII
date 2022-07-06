import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int SENHA = 2002;
        int x;

        while (true){
            x=scan.nextInt();

            if (x==SENHA){
                System.out.println("Acesso permitido.");
                break;
            }
            else {
                System.out.println("Senha inválida.");
            }
        }
    }
}
