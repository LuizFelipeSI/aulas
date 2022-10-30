package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) throws IOException {

        //salário

        Scanner leitura = new Scanner(System.in);

        int Number  = leitura.nextInt();
        int worked_h= leitura.nextInt();
        float receive_h = leitura.nextFloat();
        float salary=(float)worked_h*receive_h;

        System.out.println("NUMBER = " + Number);
        System.out.println("SALARY = " +"U$ "+ String.format("%.2f",salary));

    }
}