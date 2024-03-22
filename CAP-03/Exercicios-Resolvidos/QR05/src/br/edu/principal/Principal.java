package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sal, perc, aumento, novosal;

        System.out.println("Digite o salário:");
        sal = scanner.nextDouble();

        System.out.println("Digite o percentual de aumento:");
        perc = scanner.nextDouble();

        aumento = sal * perc/100;
        System.out.println("O valor do aumento é: " + aumento);

        novosal = sal + aumento;
        System.out.println("O novo salário é: " + novosal);

        scanner.close();
    }
}
