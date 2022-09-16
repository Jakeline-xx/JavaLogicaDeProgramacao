package ex04Pessoas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<PessoaFisica> listaPessoaFisica = new ArrayList<>();
        ArrayList<PessoaJuridica> listaPessoaJuridica = new ArrayList<>();
        PessoaFisica pessoaFis = new PessoaFisica(1, 1222, "12221","00929200020", "282882828", 1, "teste");
        listaPessoaFisica.add(pessoaFis);
        PessoaJuridica pessoaJuri = new PessoaJuridica(1, 1222, "12221","00929200020", "282882828");
        listaPessoaJuridica.add(pessoaJuri);

        int opcao;

        do {
            System.out.printf("------------------------------------\n");
            System.out.printf("Bem vindo ao Sistema de Cadastro de Pessoas\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Cadastrar Pessoa Fisica\n" + "2 - Cadastrar Pessoa Juridica \n" + "3 - Solicitar Renda Anual\n" + "4 - Sair\n");

            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();

            if (opcao == 1) {
                int id = listaPessoaFisica.size() + 1;

                System.out.println("Digite seu cpf: ");
                String cpf = ler.next();
                for (PessoaFisica pessoa : listaPessoaFisica) {
                    if(pessoa.getCpf().equals(cpf)){
                        System.out.println("Já existe cadastro com esse cpf");
                    }
                    if(!pessoa.getCpf().equals(cpf)) {
                        System.out.println("Digite seu nome: ");
                        String nome = ler.next();

                        System.out.println("Digite sua idade: ");
                        int idade = ler.nextInt();

                        System.out.println("Digite seu rg: ");
                        String rg = ler.next();

                        System.out.println("Digite seu telefone: ");
                        String telefone = ler.next();

                        System.out.println("Digite sua renda mensal: ");
                        int rendaMensal = ler.nextInt();

                        PessoaFisica pessoaFisica = new PessoaFisica(id, rendaMensal, telefone, cpf, rg, idade, nome);
                        listaPessoaFisica.add(pessoaFisica);

                        System.out.println("Pronto! Seu cadastro foi criado com sucesso!");
                        System.out.println("O id do seu cadastro é: " + listaPessoaFisica.size() + "\n\n");
                        break;
                    }
                }
            }else if(opcao == 2) {
                int id = listaPessoaJuridica.size() + 1;

                System.out.println("Digite o cnpj: ");
                String cnpj = ler.next();

                for (PessoaJuridica pessoa : listaPessoaJuridica) {
                    if(pessoa.getCnpj().equals(cnpj)){
                        System.out.println("Já existe cadastro com esse cnpj");
                    }
                    if(!pessoa.getCnpj().equals(cnpj)){
                        System.out.println("Digite a razao social: ");
                        String razaoSocial = ler.next();

                        System.out.println("Digite o telefone: ");
                        String telefone = ler.next();

                        System.out.println("Digite a renda mensal: ");
                        int rendaMensal = ler.nextInt();

                        PessoaJuridica pessoaJuridica = new PessoaJuridica(id, rendaMensal, telefone, cnpj, razaoSocial);
                        listaPessoaJuridica.add(pessoaJuridica);

                        System.out.println("Pronto! Seu cadastro foi criado com sucesso!");
                        System.out.println("O id do seu cadastro é: " + listaPessoaJuridica.size() + "\n\n");
                        break;
                    }
                }
            }else if(opcao == 3) {
                System.out.println("Pressione 1 para Pessoa Física e 2 para Jurídica:\n");
                int tipo = ler.nextInt();
                if(tipo == 1){
                    System.out.println("Digite o CPF:");
                    String cpf = ler.next();
                    for (PessoaFisica pessoa : listaPessoaFisica) {
                        if(pessoa.getCpf().equals(cpf)){
                            System.out.println(pessoa.calcularRendaAnual());
                        }
                    }
                }else{
                    System.out.println("Digite o CNPJ:");
                    String cnpj = ler.next();
                    for (PessoaJuridica pessoa : listaPessoaJuridica) {
                        if(pessoa.getCnpj().equals(cnpj)){
                            System.out.println(pessoa.calcularRendaAnual());
                        }
                    }
                }
            }
        } while (opcao != 4);
        ler.close();
    }
}
