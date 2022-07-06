package program;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double soma=0, alturaMedia, percentagemMenos16;
        int menor16=0;
        String nomesMenor16 = "";

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scan.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++){
            System.out.printf("Dados %da pessoa%n", i+1);
            scan.nextLine();
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Idade: ");
            int idade = scan.nextInt();
            System.out.print("Altura: ");
            double altura = scan.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);

            soma += pessoas[i].getAltura();

            if (pessoas[i].getIdade() < 16){
                menor16 += 1;
                nomesMenor16 += pessoas[i].getNome() + " ";
            }
        }

        alturaMedia = soma / pessoas.length;

        percentagemMenos16 = (double) menor16 / pessoas.length * 100;

        System.out.printf("Altura Média: %.2f%n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%n", percentagemMenos16);
        System.out.println(nomesMenor16);


    }
}
