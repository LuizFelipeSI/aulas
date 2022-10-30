package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        float[] vendas = new float[150];
        float menorVenda = 0.0f;
        float maiorVenda = 0.0f;
        float somaVenda = 0.0f;

        for (int i = 0; i < 150; i++) {
            System.out.println("Por favor digite o valor da venda:");
            vendas[i] = leitura.nextFloat();
            somaVenda += vendas[i];

            if (i == 0) {
                menorVenda = vendas[i];
                maiorVenda = vendas[i];
            } else if (vendas[i] < menorVenda) {
                menorVenda = vendas[i];
            } else if (vendas[i] > maiorVenda) {
                maiorVenda = vendas[i];
            }
        }

        float precoMedio = somaVenda / 150;

        System.out.println("Menor venda: " + menorVenda);
        System.out.println("Maior venda: " + maiorVenda);
        System.out.println("Soma das vendas: " + somaVenda);
        System.out.println("Média das vendas: " + precoMedio);
    }
}