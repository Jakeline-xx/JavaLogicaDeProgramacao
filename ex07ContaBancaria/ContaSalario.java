package ex07ContaBancaria;

public class ContaSalario extends Conta {
    private String empresa;

    public ContaSalario() {}

    public ContaSalario(int id, String agencia, String numero, Double saldo, String tipoConta, String empresa) {
        super(id, agencia, numero, saldo, tipoConta);
        this.id = id;
    }

    public String getNomeEmpresa() {
        return empresa;
    }

    public void setNomeEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
