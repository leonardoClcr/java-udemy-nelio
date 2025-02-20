package br.com.rocha.orientacaoAObjetos.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta acc;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter the account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)? ");
        String resposta = sc.nextLine();

        if (resposta == "y") {
            System.out.println("Enter initial deposit value: ");
            double valor = sc.nextDouble();
            acc = new Conta(number, name, valor);
        } else {
            acc = new Conta(number, name);
        }

        sc.close();

    }
}
