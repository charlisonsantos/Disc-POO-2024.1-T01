package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sal, salreceber, grat, imp;

        System.out.println("Digite o salário base:");
        sal = scanner.nextDouble();

        grat = sal * 5/100;
        imp = sal * 7/100;
        salreceber = sal + grat - imp;

        System.out.println("O salário a receber é: " + salreceber);

        scanner.close();
    }
}
