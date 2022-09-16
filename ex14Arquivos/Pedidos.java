package ex14Arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedidos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        ArrayList<String> lines = new ArrayList<>();

        String path = "C:\\Users\\jakel\\Desktop\\pedidos.txt";

        do {

            System.out.println("Nome:");
            String nome = ler.next();
            lines.add(nome);

            System.out.println("Quantidade de produtos a serem cadastrados");
            int qtdCadastro = ler.nextInt();

            for (int i = 1; i <= qtdCadastro; i++) {
                System.out.println("produto:");
                String nomeProduto = ler.next();
                System.out.println("quantidade:");
                int qtdProduto = ler.nextInt();
                System.out.println("preco:");
                double preco = ler.nextDouble();

                lines.add(nomeProduto + "," + qtdProduto + "," + preco);
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

                for (String line : lines) {

                    bw.write(line);
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Deseja adicionar mais um pedido?");
            System.out.println("1-Sim\n" + "2-Não");
            opcao = ler.nextInt();

        } while (opcao != 2);
        ler.close();
    }

}