package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area, raio;

        System.out.println("Digite o valor do raio:");
        raio = scanner.nextDouble();

        area = 3.1415 * raio * raio;

        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }
}
