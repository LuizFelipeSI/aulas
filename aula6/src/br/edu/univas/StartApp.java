package br.edu.univas;

public class StartApp {

    public static void main(String[] args) {

        //para: quanto sabe a quantidade exata a ser executado

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!!!");
            System.out.println("valor atual I: " + i);

        }

        for (int i = 0, j = 5; i < 10; i++) {
            System.out.println("I  = " + i + " J = " + j);

        }

        int idade = 20;
        int anoAtual = 2022;
        for (; idade >= 0; idade--) {
            System.out.println("Idade = " + idade + " ano = " + anoAtual--);
        }

        for(; idade <= 20; ) {
            System.out.println("Idade = " + idade++ + " ano = " + anoAtual++);
        }

        // == é sinal de comparação

        for (;;) {
            System.out.println("Idade = " + idade-- + " ano = " + anoAtual--);
            if (idade == -1) {
                break;

            }
        }

        // enquanto: quando nao sei a quantidade exata

        while (idade <=20) {
            System.out.println("Idade = " + idade++ + " ano = " + anoAtual++);
        }

        while (true) {
            System.out.println("Idade = " + idade-- + " ano = " + anoAtual--);
            if (idade < 0) {
                break;

            }
        }

        //repita: precisa imprimir pelo menos uma vez

        do {
            System.out.println("Idade = " + idade++ + " ano = " + anoAtual++);
        } while (idade <= 20);

        for (int m = 1; m < 50; m++) {
            if (m % 2 == 0) {
                continue;
            }

            System.out.println(m);
        }
    }
}
