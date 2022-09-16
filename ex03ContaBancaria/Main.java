package ex03ContaBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Conta> contasCriadas = new ArrayList<>();
        int opcao;
        int opcaoConta;

        do {
            System.out.println("Bem-vindo ao banco! \n");
            System.out.println("1 - Criacao de Conta\n" + "2 - Deposito\n" + "3 - Saque\n" + "4 - Calculo Rendimento \n"
                    + "5 - Consultar Saldo\n" + "6 - Pagar Fatura\n" + "7 - Sair\n");
            System.out.println("Digite a opção desejada: ");
            opcao = ler.nextInt();

            if (opcao == 1) { //CRIAR CONTA

                int id = contasCriadas.size() + 1;

                System.out.println("Digite o numero da agencia: ");
                String agencia = ler.next();

                System.out.println("Digite o numero da conta do cliente: ");
                String numero = ler.next();

                System.out.println("Escolha uma opção de conta:\n");
                System.out.println("1- Conta Corrente\n" + "2- Conta Poupança\n" + "3- Conta Salario\n");
                opcaoConta = ler.nextInt();

                Conta conta;
                if (opcaoConta == 1) {
                    conta = new ContaCorrente(id, agencia, numero, 0.0, "corrente");
                } else if (opcaoConta == 2) {
                    conta = new ContaPoupanca(id, agencia, numero, 0.0, "poupanca");
                } else {
                    System.out.println("Digite o nome da empresa: ");
                    String nomeEmpresa = ler.next();
                    conta = new ContaSalario(id, agencia, numero, 0.0, "salario", nomeEmpresa);
                }
                contasCriadas.add(conta);

                System.out.println("Pronto! Sua conta foi criada com sucesso!");
                System.out.println("O id da sua conta é: " + contasCriadas.size() + "\n\n");

                ler.nextLine();

            } else if (opcao == 2) {  //DEPOSITO
                System.out.println("Selecione o id da conta para depositar:");
                int id = ler.nextInt();

                System.out.println("Digite o valor do deposito:");
                double valor = ler.nextDouble();

                System.out.println("Digite a quantidade dos dias trabalhados:");
                int dias = ler.nextInt();

                for (Conta conta : contasCriadas) {
                    if(conta.getId() == id){
                        conta.depositarValor(valor, dias);
                        System.out.println("\nDeposito realizado com sucesso!\n");
                    }
                }
                ler.nextLine();
            } else if (opcao == 3) {          //SAQUE
                System.out.println("Selecione o id da conta para sacar:");
                int id = ler.nextInt();

                System.out.println("Digite o valor do saque:");
                double saque = ler.nextDouble();

                Conta conta = contasCriadas.get(id - 1);
                conta.sacarValor(saque);
                System.out.println("Saque realizado com sucesso!\n");
                ler.nextLine();
            } else if (opcao == 4) { //CALCULO RENDIMENTO
                System.out.println("Selecione o id da conta para calcular o rendimento do mês:");
                int id = ler.nextInt();
                Conta contaAuxiliar = contasCriadas.get(id - 1);
                if(!contaAuxiliar.getTipoConta().equals("poupanca")){
                    System.out.println("Apenas a conta poupanca possui rendimento.");
                }else{
                    ContaPoupanca conta = (ContaPoupanca) contasCriadas.get(id - 1);
                    System.out.println(conta.calcularRendimentoMensal());
                    ler.nextLine();
                }
            }else if (opcao == 5) { //CONSULTAR SALDO
                System.out.println("Selecione o id da conta para verificar o saldo:\n");
                int id = ler.nextInt();

                Conta conta = contasCriadas.get(id - 1);
                System.out.println(conta.exibirSaldo());
                ler.nextLine();
            }else if (opcao == 6) {   //PAGAR FATURA
                System.out.println("Selecione o id da conta para pagar a fatura:");
                int id = ler.nextInt();

                Conta contaAuxiliar = contasCriadas.get(id - 1);
                if(!contaAuxiliar.getTipoConta().equals("corrente")){
                    System.out.println("Apenas a conta corrente possui pagamento de fatura.");
                }else {
                    System.out.println("Digite o valor que deseja pagar:\n");
                    double fatura = ler.nextDouble();

                    ContaCorrente conta = (ContaCorrente) contasCriadas.get(id - 1);
                    System.out.println(conta.pagarFatura(fatura));
                    ler.nextLine();
                }
            }

        } while (opcao != 7);
        ler.close();

    }
}