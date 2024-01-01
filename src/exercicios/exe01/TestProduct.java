package exercicios.exe01;

import java.util.Scanner;

public class TestProduct {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product data:");

        System.out.println("Name: ");
        String name = scan.nextLine();
        System.out.println("Price: ");
        double price = scan.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = scan.nextInt();

        Product produto = new Product();
        produto.setName(name);
        produto.setPrice(price);


        System.out.println("Updated Name: " + produto.getName());
        System.out.println("Product data: " + produto.toString());

        System.out.println("Enter the number of products to be added in stock: " );
        int quant = scan.nextInt();
        produto.addvalueInStock(quant);

        System.out.println("Updated data: " + produto.toString());

        System.out.println("Enter the number of products to be added in stock: " );
        quantity = scan.nextInt();
        produto.removeProducts(quantity);

        System.out.println("Updated data: " + produto.toString());

    }
}
