package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num, quad, cubo, r2, r3;

        System.out.println("Digite um número positivo e maior que zero:");
        num = scanner.nextDouble();

        quad = Math.pow(num, 2);
        cubo = Math.pow(num, 3);
        r2 = Math.sqrt(num);
        r3 = Math.cbrt(num);

        System.out.println("Número ao quadrado: " + quad);
        System.out.println("Número ao cubo: " + cubo);
        System.out.println("Raiz quadrada: " + r2);
        System.out.println("Raiz cúbica: " + r3);

        scanner.close();
    }
}
