package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        int num1 = 17;
        int num2 = 12;
        int num3 = 8;
        int num4 = 3;
        int num5 = 16;
        int soma = 0;

        //se eu tiver um if com apenas uma linha eu posso escolher entre colocar ou não as chaves

        if (num1 % 2 ==0) soma += num1;
        if (num2 % 2 == 0) soma += num2;
        if (num3 % 2 == 0) soma += num3;
        if (num4 % 2 == 0) soma += num4;
        if (num5 % 2 ==0) soma += num5;

        System.out.println("O valor da soma dos números pares é: " + soma);
    }
}