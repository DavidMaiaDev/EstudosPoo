package exercicios.vetores.exercicios;

import java.util.Scanner;

public class fixacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar?");
        int num = sc.nextInt();
        double[] vector = new double[num];
        for(int i = 0; i < vector.length; i++) {
            System.out.println("Digite um número: ");
            vector[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for(int i = 0; i < vector.length; i++){
            sum += vector[i];
        }

        System.out.println("VALORES = " + vector[0]+ ", " + vector[1] + ", " + vector[2] + ", " + vector[3]);
        System.out.println("SOMA = "+ String.format("%.2f", sum));
        System.out.println("MÉDIA = "+ String.format("%.2f", sum / vector.length));










        sc.close();
    }
}
