package exercicios.vetores.exercicios;

import exercicios.exe01.Product;

import java.util.Scanner;

public class vetor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Product[] vector = new Product[num];

        for(int i = 0; i < vector.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vector[i] = new Product(name, price);
        }
        double sum = 0.0;

        for(int i =0; i < vector.length; i++){
            sum += vector[i].getPrice();
        }

        double avg = sum / vector.length;

        System.out.println("AVERAGE PRICE:  " + String.format("%.2f", avg));

        sc.close();

    }
}
