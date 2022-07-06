package program;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = scan.nextInt();

        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < alunos.length; i++){
            scan.nextLine();
            System.out.println("Nome: ");
            String nome = scan.nextLine();
            System.out.println("Nota 1 e nota 2: ");
            double n1 = scan.nextDouble();
            double n2 = scan.nextDouble();

            alunos[i] = new Aluno(nome, n1, n2);
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < alunos.length; i++){
            if ((alunos[i].getNota1() + alunos[i].getNota2())/2 >= 6){
                System.out.println(alunos[i].getNome());
            }
        }
    }
}
