package br.com.rocha.arraysELists;

import java.util.Scanner;

public class Vetor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        sc.close();
    }
}
