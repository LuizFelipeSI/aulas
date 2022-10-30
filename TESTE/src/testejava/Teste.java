package testejava;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //QUESTÃO 1

        int notaGuilherme = 0;
        int notaEwerton = 0;
        int notaFabio = 0;
        int candidatoMaisVotado = 0;
        int somaCandidato1= 0;
        int somaCandidato2= 0;
        int somaCandidato3= 0;
        int somaCandidato4= 0;
        int somaCandidato5= 0;

        String[] nome = new String[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do candidato");
            nome[i] = leitura.next();
            System.out.println("Digite a nota do recrutador Guilherme:");
            notaGuilherme = leitura.nextInt();
            System.out.println("Digite a nota do recrutador Ewerton:");
            notaEwerton = leitura.nextInt();
            System.out.println("Digite a nota do recrutador Fábio:");
            notaFabio = leitura.nextInt();

            int soma = notaGuilherme+notaEwerton+notaFabio;

            if (i==0) {
                somaCandidato1=soma;
            } else if (i==1) {
                somaCandidato2=soma;
            } else if (i==2) {
                somaCandidato3=soma;
            } else if (i==3) {
                somaCandidato4=soma;
            } else {
                somaCandidato5=soma;
            }

            if (candidatoMaisVotado ==0 || candidatoMaisVotado<soma) {
                candidatoMaisVotado =soma;
            }
        }

        System.out.println(nome[0] + ": " + somaCandidato1);
        System.out.println(nome[1] + ": " + somaCandidato2);
        System.out.println(nome[2] + ": " + somaCandidato3);
        System.out.println(nome[3] + ": " + somaCandidato4);
        System.out.println(nome[4] + ": " + somaCandidato5);

        if(somaCandidato1 == candidatoMaisVotado) {
            System.out.println("O candidato mais votado foi: " + nome[0] + " com " + somaCandidato1 + " votos");
        } else if (somaCandidato2 == candidatoMaisVotado) {
            System.out.println("O candidato mais votado foi: " + nome[1] + " com " + somaCandidato2 + " votos");
        } else if (somaCandidato3 == candidatoMaisVotado) {
            System.out.println("O candidato mais votado foi: " + nome[2] + " com " + somaCandidato3 + " votos");
        } else if (somaCandidato4 == candidatoMaisVotado) {
            System.out.println("O candidato mais votado foi: " + nome[3] + " com " + somaCandidato4 + " votos");
        } else if (somaCandidato5 == candidatoMaisVotado) {
            System.out.println("O candidato mais votado foi: " + nome[4] + " com " + somaCandidato5 + " votos");
        }
    }
}
