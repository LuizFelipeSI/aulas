package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {

    public static void main (String[] args) throws IOException {

        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite o salário:");
        float salario = leitura.nextFloat();
        if (salario <= 1903.98f) {
            System.out.println("Você se enquadrou na faixa de: Isento do IR");
        } else if (salario <= 2826.66f) {
            System.out.println("Você se enquadrou na faixa de: 7,5% do IR");
        } else if (salario <= 3751.05f) {
            System.out.println("Você se enquadrou na faixa de: 15,0% do IR");
        } else if (salario <= 4664.68f) {
            System.out.println("Você se enquadrou na faixa de: 22.5% do IR");
        } else {
            System.out.println("Você se enquadrou na faixa de: 27,5% do IR");
        }
    }
}
