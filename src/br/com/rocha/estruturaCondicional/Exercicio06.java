package br.com.rocha.estruturaCondicional;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero de 1 à 100: ");
        int valor = sc.nextInt();

        if (valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor <= 50) {
            System.out.println("Intervalo [25,50]");
        } else if (valor <= 100) {
            System.out.println("Intervalo [75,100]");
        } else if (valor < 0.0 || valor > 100.0) {
            System.out.println("Fora de intervalp");
        }

    }
}
