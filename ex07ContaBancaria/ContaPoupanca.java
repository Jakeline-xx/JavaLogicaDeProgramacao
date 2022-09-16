package ex07ContaBancaria;

public class ContaPoupanca extends Conta {
    private double rendimentoMensal = 0.01;

    public ContaPoupanca() {}

    public ContaPoupanca(int id, String agencia, String numero, Double saldo, String tipoConta) {
        super(id, agencia, numero, saldo, tipoConta);
    }

    public String calcularRendimentoMensal() {
        return ("Sua conta está rendendo: " + (saldo * rendimentoMensal) + " esse mês");
    }
}
