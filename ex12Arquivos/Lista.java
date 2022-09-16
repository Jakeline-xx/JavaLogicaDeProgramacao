package ex12Arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lista {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] lines = new String[10];

        for (int i = 0; i <= 9; i++) {

            System.out.println("produto:");
            String nome = ler.next();
            System.out.println("quantidade:");
            int qtd = ler.nextInt();
            System.out.println("valor:");
            double valor = ler.nextDouble();
            lines[i] = nome +"," +  String.valueOf(qtd) + "," +String.valueOf(valor);

        }

        String path = "C:\\Users\\jakel\\Desktop\\lista.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        ler.close();
    }
}