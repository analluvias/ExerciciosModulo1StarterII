package program;

import entities.Cliente;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String nome;
        int numeroConta, perguntaDeposito;
        double valorInicial = 0, entradaValor;
        Cliente c1;

        System.out.print("Nome: ");
        nome = scan.nextLine();
        System.out.print("Número da conta: ");
        numeroConta = scan.nextInt();

        System.out.println("\nDeseja fazer depósito inicial? \n0 - NAO\n1 - SIM");
        perguntaDeposito = scan.nextInt();

        if (perguntaDeposito == 1){
            System.out.print("\nDigite o valor do depósito inicial: ");
            valorInicial = scan.nextDouble();
            c1 = new Cliente(numeroConta, nome, valorInicial);
        }
        else {
            c1 = new Cliente(numeroConta, nome);
        }


        System.out.println("- Dados da conta - "+c1.toString());


        System.out.print("\nEntre com um valor de depósito: ");
        entradaValor = scan.nextDouble();
        c1.deposito(entradaValor);
        System.out.println("- Update - "+c1.toString());

        System.out.print("\nEntre com um valor de saque: ");
        entradaValor = scan.nextDouble();
        c1.saque(entradaValor);
        System.out.println("- Update - "+c1.toString());
    }
}
