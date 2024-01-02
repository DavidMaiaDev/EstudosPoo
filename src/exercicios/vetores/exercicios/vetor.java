package exercicios.vetores.exercicios;

import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        double[] vetor = new double [num];

        for (int i=0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i < vetor.length; i++){
            sum += vetor[i];
        }

        double avg = sum / vetor.length;

        System.out.println("AVERAGE HEIGHT:  " + String.format("%.2f", avg));



        sc.close();
    }


}
