package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sal, aumento, novosal;

        System.out.println("Digite o salário:");
        sal = scanner.nextDouble();

        aumento = sal * 25/100;
        novosal = sal + aumento;
        System.out.println("O novo salário é: " + novosal);

        scanner.close();
    }
}
