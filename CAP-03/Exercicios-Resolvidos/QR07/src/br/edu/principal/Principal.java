package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sal, salreceber, imp;

        System.out.println("Digite o salário base:");
        sal = scanner.nextDouble();

        imp = sal * 10/100;
        salreceber = sal + 50 - imp;

        System.out.println("O salário a receber é: " + salreceber);

        scanner.close();
    }
}
