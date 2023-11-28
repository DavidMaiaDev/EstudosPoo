package exercicios.exe03;

public class Employee {
    public String name;
    public double grossSalary;

    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public double increaseSalary(double percentage){
        return percentage * grossSalary / 100 + netSalary();
    }

    public String toString(){
        return "Name: " + name + "\n" + "Gross Salary: "
                + String.format("%.2f", grossSalary) + "\n" + "Tax: " + String.format("%.2f", tax) +
                "\n" + "\n" +
                "Employee: " + name + ", " + "$ " + String.format("%.2f", netSalary());
    }
}
