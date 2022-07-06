package program;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = scan.nextInt();

        List<Employee> empregados = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Employee #"+(i+1));
            System.out.print("ID: ");
            Integer id = scan.nextInt();

            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Salary: ");
            Double salary = scan.nextDouble();

            empregados.add(new Employee(id, name, salary));

        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalaryIncreased = scan.nextInt();

        Employee empregadoAumentaSalario = empregados.stream().filter(x -> x.getId() == idSalaryIncreased)
                .findFirst().orElse(null);

        if (empregadoAumentaSalario == null){
            System.out.println("ID inexistente.");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = scan.nextDouble();
            empregadoAumentaSalario.salaryIncrease(percentage);
        }

        System.out.println("\nList of employees: ");
        for (Employee empregado: empregados) {
            System.out.printf("%d: %s, %.2f %n", empregado.getId(), empregado.getName(),
                    empregado.getSalary());
        }

    }

}
