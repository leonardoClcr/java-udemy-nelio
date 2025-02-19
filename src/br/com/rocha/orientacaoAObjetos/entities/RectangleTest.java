package br.com.rocha.orientacaoAObjetos.entities;

import java.util.Locale;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rec = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rec.width = sc.nextDouble();
        rec.height = sc.nextDouble();

        double recArea = rec.area();
        double recPerimeter = rec.perimeter();
        double recDiagonal = rec.diagonal();

        System.out.println("Area = " + recArea);
        System.out.println("Perimeter = " + recPerimeter);
        System.out.println("Diagonal = " + recDiagonal);

        sc.close();
    }

}
