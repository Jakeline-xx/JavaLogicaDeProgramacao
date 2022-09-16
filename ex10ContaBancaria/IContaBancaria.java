package ex10ContaBancaria;

public interface IContaBancaria {
    public String sacarValor(double valor);

    public void depositarValor(double valor);

    public String exibirSaldo();
}
