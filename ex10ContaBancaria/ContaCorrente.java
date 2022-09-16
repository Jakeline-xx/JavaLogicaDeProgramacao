package ex10ContaBancaria;

public class ContaCorrente extends Conta {
    public ContaCorrente(){}

    public ContaCorrente(int id, String agencia, String numero, double saldo, String tipoConta){
        super(id, agencia, numero, saldo, tipoConta);
    }

    public String pagarFatura(double valorFatura) {
        if (valorFatura <= saldo) {
            sacarValor(valorFatura);
            return ("Pagamento da fatura realizado com sucesso. Novo saldo:" + getSaldo());
        }else{
            return ("Saldo insuficiente para o pagamento da fatura. \nValor da fatura: "
                    + valorFatura
                    + "\nSaldo atual: "
                    + getSaldo());
        }
    }
}
