import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String name;
        double grossSalary, tax, percentage;

        System.out.print("Name: ");
        name = scan.nextLine();

        System.out.print("Gross Salary: ");
        grossSalary = scan.nextDouble();

        System.out.print("Tax: ");
        tax = scan.nextDouble();

        Employee e1 = new Employee(name, grossSalary, tax);

        System.out.println("Employee: " + e1.toString());

        System.out.print("Which percentage to increase salary?");
        percentage = scan.nextDouble();

        e1.increaseSalary(percentage);

        System.out.println("Updated data: "+ e1.toString());
    }
}
