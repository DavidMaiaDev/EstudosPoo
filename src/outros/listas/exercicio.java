package outros.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<EmployeeExe> emp = new ArrayList<>();


        System.out.println("How many employees will be registered?");
        int quant = sc.nextInt();

        for (int i = 0; i < quant; i++) {
            EmployeeExe employee = new EmployeeExe();
            System.out.println("Employee #"+ (i + 1)+":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            employee.setId(id);
            employee.setName(name);
            employee.setSalary(salary);
            emp.add(employee);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int id2 = sc.nextInt();

        boolean found = false;

        for(EmployeeExe percorre : emp){
            if(percorre.getId() == id2){
                found = true;
                System.out.println("Enter the percentage: ");
                double tax = sc.nextDouble();
                percorre.increaseSalary(tax);
                break;
            }
        }
        if (!found) {
            System.out.println("This id does not exist!");
        }


        System.out.println("List of employees: ");
        for (EmployeeExe employ : emp) {
            System.out.println(employ);
        }


        sc.close();
    }
}
