package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, r1, r2;

        System.out.println("Digite o primeiro número:");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        num2 = scanner.nextDouble();

        r1 = Math.pow(num1, num2);
        r2 = Math.pow(num2, num1);

        System.out.println("O primeiro número elevado ao segundo é: " + r1);
        System.out.println("O segundo número elevado ao primeiro é: " + r2);

        scanner.close();
    }
}