package entities;

public class Cliente {
    protected int numeroConta;
    protected String nomeTitular;
    protected double valorEmConta = 0;

    public Cliente(int numeroConta, String nomeTitular, double deposito) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(deposito);
    }

    public Cliente(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getValorEmConta() {
        return valorEmConta;
    }

    public void deposito(double valor){
        this.valorEmConta += valor;
    }

    public void saque(double valor){
        this.valorEmConta -= (valor + 5);
    }

    @Override
    public String toString() {
        return "Numero da conta:  " + numeroConta +
                ", nome do titular: '" + nomeTitular + '\'' +
                ", valor em conta: $ " + String.format("%.2f", valorEmConta);
    }
}
