package br.com.rocha.estruturaRepeticao;

import java.util.Scanner;

public class TesteWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int valor = sc.nextInt();
        int soma = 0;
        while (valor != 0){
            valor = sc.nextInt();
            soma += valor;
        }
        System.out.println("Soma é: " + soma);
    }
}
