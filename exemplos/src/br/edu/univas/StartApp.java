package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class StartApp {

    public static void main (String [] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        //exemplo string.format

        int aluno = 1;
        double soma = 0;
        for (aluno = 1; aluno <= 30; aluno++) {

            System.out.println("digite sua nota: ");

            int nota = leitura.nextInt();
            soma += nota;
        }
        double media = soma / 30;
        System.out.println(String.format("a media das notas foi: %.1f", media));


        //exemplo equals (ler a palavra que o usuario digita)

        String word1 = leitura.next();
        String word2 = leitura.next();
        String word3 = leitura.next();

        if (word1.equals("vertebrado") && word2.equals("ave") && word3.equals("carnivoro")) {
            System.out.println("aguia");
        } else if (word1.equals("vertebrado") && word2.equals("ave") && word3.equals("onivoro")) {
            System.out.println("pomba");
        } else if (word1.equals("vertebrado") && word2.equals("mamifero") && word3.equals("onivoro")) {
            System.out.println("homem");
        } else if (word1.equals("vertebrado") && word2.equals("mamifero") && word3.equals("herbivoro")) {
            System.out.println("vaca");
        } else if (word1.equals("invertebrado") && word2.equals("inseto") && word3.equals("hematofago")) {
            System.out.println("pulga");
        } else if (word1.equals("invertebrado") && word2.equals("inseto") && word3.equals("herbivoro")) {
            System.out.println("lagarta");
        } else if (word1.equals("invertebrado") && word2.equals("anelideo") && word3.equals("hematofago")) {
            System.out.println("sanguessuga");
        } else if (word1.equals("invertebrado") && word2.equals("anelideo") && word3.equals("onivoro")) {
            System.out.println("minhoca");
        }
    }
}





