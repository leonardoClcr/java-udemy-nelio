package br.com.rocha.arraysELists;

import java.util.Scanner;

public class Vetor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Vetor02Classe[] vect = new Vetor02Classe[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Vetor02Classe(name, price);
        }

        double sum = 0.0;
        for (int i=0;i<n;i++){
            sum += vect[i].getPrice();
        }

        double avg = sum / n ;

        sc.close();
    }
}
