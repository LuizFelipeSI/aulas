package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) throws IOException {

        //animal

        Scanner leitura = new Scanner (System.in);

        String tipo1 = leitura.nextLine();
        String tipo2 = leitura.nextLine();
        String tipo3 = leitura.nextLine();

        if(tipo1.equals ("vertebrado") && tipo2.equals("ave") && tipo3.equals("carnivoro")) {
            System.out.println("aguia");
        }
        if(tipo1.equals ("vertebrado") && tipo2.equals("ave") && tipo3.equals("onivoro")) {
            System.out.println("pomba");
        }
        if(tipo1.equals ("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("onivoro")) {
            System.out.println("homem");
        }
        if(tipo1.equals ("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("herbivoro")) {
            System.out.println("vaca");
        }
        if(tipo1.equals ("invertebrado") && tipo2.equals("inseto") && tipo3.equals("hematofago")) {
            System.out.println("pulga");
        }
        if(tipo1.equals ("invertebrado") && tipo2.equals("inseto") && tipo3.equals("herbivoro")) {
            System.out.println("lagarta");
        }
        if(tipo1.equals ("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("hematofago")) {
            System.out.println("sanguessuga");
        }
        if(tipo1.equals ("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("onivoro")) {
            System.out.println("minhoca");
        }
    }
}