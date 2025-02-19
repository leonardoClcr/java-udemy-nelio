package br.com.rocha.estruturaCondicional;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int cod = sc.nextInt();

        System.out.print("Digite a quantidade do produto: ");
        int qtdeProduto = sc.nextInt();

        double totalValor = 0;
        if (cod == 1){
            totalValor = qtdeProduto * 4.00;
        } else if (cod == 2) {
            totalValor = qtdeProduto * 4.50;
        } else if (cod == 3) {
            totalValor = qtdeProduto * 5.00;
        } else if (cod == 4) {
            totalValor = qtdeProduto * 2.00;
        } else if (cod == 5) {
            totalValor = qtdeProduto * 1.50;
        }

        System.out.println("Total: " + totalValor);

    }
}
