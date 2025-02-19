package br.com.rocha.orientacaoAObjetos.entities;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("Enter with the data of employee: ");
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println(emp);

        sc.close();
    }
}
