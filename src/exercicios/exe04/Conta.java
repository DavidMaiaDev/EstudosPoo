package exercicios.exe04;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    private String numConta;
    private String NomeTitular;
    private double valorInicial;



    public Conta(String numConta, String nomeTitular){
        this.numConta = numConta;
        this.NomeTitular = nomeTitular;
        this.valorInicial = 0.0;

    }

    public Conta(String numConta, String nomeTitular, double valorInicial){
        this.numConta = numConta;
        this.NomeTitular = nomeTitular;
        deposito(valorInicial);
    }

    public String getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return NomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        NomeTitular = nomeTitular;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void deposito(double valor){
        valorInicial += valor;
    }
    public double saque(double saque){
        valorInicial -= saque;
        if(valorInicial > 0.0){
          valorInicial = valorInicial - 5.0;
        }
        return valorInicial;
    }
    public String toString(){
        return getNumConta() + "\n" + getNomeTitular()+ "\n" + String.format("%.2f", getValorInicial());
    }
}
