package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a idade");
        int idade = leitura.nextInt();
        if (idade <= 7) {
            System.out.println("Infantil A");
        } else if (idade <= 10) {
            System.out.println("Infanti B");
        } else if (idade <= 13) {
            System.out.println("Juvenil A");
        } else if (idade <= 17) {
            System.out.println("Juvenil B");
        } else if (idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Sênior");
        }
    }
}