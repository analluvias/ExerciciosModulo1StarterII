package program;

import entities.Cliente;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Cliente[] clientes = new Cliente[10];

        System.out.print("How many rooms will be rented? ");
        int rented = scan.nextInt();

        for (int i = 0; i < rented; i++){
            scan.nextLine();
            System.out.println("Rent #"+ (i+1));
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();
            System.out.print("Quarto: ");
            int quarto = scan.nextInt();

            clientes[quarto] = new Cliente(name, email, quarto);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < clientes.length; i++){
            if (clientes[i] != null){
                System.out.printf("%d: %s, %s%n", clientes[i].getQuarto(), clientes[i].getNome(),
                        clientes[i].getEmail());
            }
        }
    }
}
