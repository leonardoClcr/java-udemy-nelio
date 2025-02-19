package br.com.rocha.trabalhandoComArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {

        File file = new File("C:\\temp\\in.txt");

        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());;
        }
        finally {
            if (sc !=null){
                sc.close();
            }
        }
    }
}
