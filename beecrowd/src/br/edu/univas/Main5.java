package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) throws IOException {

        //salário com bônus

        Scanner leitura = new Scanner (System.in);

        String nome = leitura.next();
        double salario = leitura.nextDouble();
        double vendas = leitura.nextDouble();
        double comissao = vendas * 0.15;
        double total = salario + comissao;

        System.out.println("TOTAL = " +"R$ "+ String.format("%.2f", total));
    }
}