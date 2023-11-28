package exercicios.exe01;

import java.util.Scanner;

public class TestProduct {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product produto = new Product();

        System.out.println("Enter product data:");

        System.out.println("Name: ");
        produto.name = scan.nextLine();
        System.out.println("Price: ");
        produto.price = scan.nextDouble();
        System.out.println("Quantity in stock: ");
        produto.quantity = scan.nextInt();


        System.out.println("Product data: " + produto.toString());

        System.out.println("Enter the number of products to be added in stock: " );
        int quantity = scan.nextInt();
        produto.addvalueInStock(quantity);

        System.out.println("Updated data: " + produto.toString());

        System.out.println("Enter the number of products to be added in stock: " );
        quantity = scan.nextInt();
        produto.removeProducts(quantity);

        System.out.println("Updated data: " + produto.toString());

    }
}
