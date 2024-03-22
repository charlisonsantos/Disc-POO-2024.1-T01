package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dep, taxa, rend, total;

        System.out.println("Digite o valor do depósito:");
        dep = scanner.nextDouble();

        System.out.println("Digite o valor da taxa de juros:");
        taxa = scanner.nextDouble();

        rend = dep * taxa/100;
        total = dep + rend;

        System.out.println("O valor do rendimento é: " + rend);
        System.out.println("O valor total depois do rendimento é: " + total);

        scanner.close();
    }
}
