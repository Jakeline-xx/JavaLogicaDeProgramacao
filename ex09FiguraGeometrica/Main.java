package ex09FiguraGeometrica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[]args){
        System.out.println("Exercicio 09 - Figuras Geometricas");
        System.out.println("-----------------------------------");
        int qtdCadastros = 0;
        ArrayList<Quadrado> quadrados = new ArrayList<>();
        ArrayList<Retangulo> retangulos = new ArrayList<>();
        ArrayList<Circulo> circulos = new ArrayList<>();

        qtdCadastros = obtemQuantidades(qtdCadastros,"Quantas figuras geometricas voce gostaria de cadastrar?");


        for (int i = 0; i < qtdCadastros;) {
        System.out.println("Digite o codigo da figura a ser cadastrada");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retangulo");
        System.out.println("3 - Circulo");
        int tipoFigura =scanner.nextInt();
        switch (tipoFigura){
            case 1:
                System.out.println("Qual sera o lado do Quadrado ?");
                float lado = scanner.nextFloat();
                Quadrado quadrado = new Quadrado(lado);
                quadrados.add(quadrado);
                i++;
                break;
            case 2:
                System.out.println("Qual sera o lado1 do Retangulo ?");
                float lado1 = scanner.nextFloat();
                System.out.println("Qual sera o lado2 do Retangulo ?");
                float lado2 = scanner.nextFloat();
                System.out.println("Qual sera o lado3 do Retangulo ?");
                float lado3 = scanner.nextFloat();
                System.out.println("Qual sera o lado4 do Retangulo ?");
                float lado4 = scanner.nextFloat();
                Retangulo retangulo = new Retangulo(lado1,lado2,lado3,lado4);
                retangulos.add(retangulo);
                i++;
                break;
            case 3:
                System.out.println("Qual sera o valor de raio do Circulo?");
                float raio = scanner.nextFloat();
                Circulo circulo = new Circulo(raio);
                circulos.add(circulo);
                i++;
                break;
            default:
                System.out.println("Opcao Invalida...");
                break;
        }
        }
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("\t\t\t Apresentando os valores cadastrados");
        System.out.println(" -- Quadrados:");
        for (Quadrado quadrado:quadrados) {
            System.out.println("Lado: " + quadrado.getLado1());
            System.out.println("Area: " + quadrado.obterArea());
            System.out.println("Perimetro: " + quadrado.obterPerimetro());
            System.out.println("---");
        }
        System.out.println(" -- Retangulos:");
        for (Retangulo retangulo:retangulos) {
            System.out.println("Lado1: " + retangulo.getLado1());
            System.out.println("Lado2: " + retangulo.getLado2());
            System.out.println("Lado3: " + retangulo.getLado3());
            System.out.println("Lado4: " + retangulo.getLado4());
            System.out.println("Area: " + retangulo.obterArea());
            System.out.println("Perimetro: " + retangulo.obterPerimetro());
            System.out.println("---");
        }
        for(Circulo circulo: circulos){
            System.out.println("Raio: " + circulo.getRaio());
            System.out.println("Area: " + circulo.obterArea());
            System.out.println("Perimetro: " + circulo.obterPerimetro());
            System.out.println("---");
        }
    }

    //Tratamento de quantidades
    public static int obtemQuantidades(int qtd,String mensagem){
        while(qtd<1){
            System.out.println(mensagem);
            qtd = scanner.nextInt();
            if(qtd<1)
                System.out.println("Opcao Invalida...");
        }
        System.out.println("Perfeito, vamos la cadastrar "+ qtd + " figura(s) geometrica(s)!");
        return qtd;
    }

}
