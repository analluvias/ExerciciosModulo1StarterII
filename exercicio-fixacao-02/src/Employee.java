public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public double netSalary(){
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage){
        this.grossSalary = this.grossSalary + this.grossSalary * percentage / 100;
    }

    @Override
    public String toString() {
        return name + ", " +
                String.format("$ %.2f", this.netSalary());
    }
}
