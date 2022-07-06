package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int added, removed;

        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Price: ");
        Double price = scan.nextDouble();;

        System.out.print("Quantity: ");
        int quantity = scan.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("Product data: "+ product);

        System.out.print("Enter the number of products to be added in stock: ");
        added = scan.nextInt();

        product.addProducts(added);

        System.out.println("Updated data: "+ product);

        System.out.print("Enter the number of products to be removed from stock: ");
        removed = scan.nextInt();

        product.removeProducts(removed);

        System.out.println("Updated data: "+ product);

    }
}
