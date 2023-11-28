package exercicios.exe03;

import java.util.Scanner;

public class TestEmployee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee em = new Employee();

        em.name = sc.nextLine();
        em.grossSalary = sc.nextDouble();
        em.tax = sc.nextDouble();

        System.out.println(em.toString());

        System.out.println("Wich percentage to increase salary? ");
        double abono = sc.nextDouble();

        System.out.println("Update data: " + em.name + ", " + "$ " + em.increaseSalary(abono));









        sc.close();
    }
}
