package br.com.rocha.estruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int n = sc.nextInt();

        if (n >= 0){
            System.out.println("Numero positivo");
        } else {
            System.out.println("Numero negativo");
        }

    }
}

