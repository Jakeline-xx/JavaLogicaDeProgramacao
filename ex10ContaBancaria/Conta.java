package ex10ContaBancaria;

public class Conta implements IContaBancaria {
    protected int id;
    protected String agencia;
    protected String numero;
    protected double saldo;
    protected String tipoConta;
    public Conta(){}

    public Conta(int id, String agencia, String numero, Double saldo, String tipoConta) {
        this.id = id;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String exibirSaldo() {
        return ("Saldo atual: " + this.getSaldo());
    }

    public String sacarValor(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            return("Operação concluída com sucesso!");
        } else return("Seu saldo é insuficiente para completar esta ação!");

    }

    public void depositarValor(double valor) {
        this.saldo += valor;
    }

}
