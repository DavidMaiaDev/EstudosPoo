package exercicios.exe04;

import java.util.Scanner;

public class TestConta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cadastrando conta...");
        System.out.println("Digite o Número da Conta: ");
        String NumConta = scan.next();
        System.out.println("Digite o Nome do Titular da Conta: ");
        String nomeTitular = scan.next();


        System.out.println("================================================");
        System.out.println("Você deseja depositar um valor agora?");
        System.out.println("================================================");

        Conta conta;
        String saber = scan.next();

        if(saber.equals("sim")) {
            System.out.println("Digite o valor a ser depositado: ");
            double valor = scan.nextDouble();
            conta = new Conta(NumConta, nomeTitular, valor);
            System.out.println(conta.toString());
        }
        else{
            conta = new Conta(NumConta, nomeTitular);
            System.out.println(conta.toString());

        }


        System.out.println("Saque: " );
        double valorSaque = scan.nextDouble();
        conta.saque(valorSaque);


        System.out.println(conta.toString());

        scan.close();
    }
}
