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

        Integer testaExistenciaId = verificaSeIdExiste(empregados, idSalaryIncreased);
        if (testaExistenciaId == null){
            System.out.println("ID inexistente.");
        }else {
            System.out.print("Enter the percentage: ");
            double percentage = scan.nextDouble();
            empregados.get(testaExistenciaId).salaryIncrease(percentage);
        }

        System.out.println("List of employees: ");
        for (Employee empregado: empregados) {
            System.out.printf("%d: %s, %.2f %n", empregado.getId(), empregado.getName(),
                    empregado.getSalary());
        }

    }

    public static Integer verificaSeIdExiste(List<Employee> empregados, Integer id){
        for (int i = 0; i < empregados.size(); i++){
            if (empregados.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

}
