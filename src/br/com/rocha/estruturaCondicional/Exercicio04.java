package br.com.rocha.estruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("A duração foi de: " + duracao + " HORAS");

        sc.close();
    }

}
