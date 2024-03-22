package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Digite o valor da base:");
        base = scanner.nextDouble();

        System.out.println("Digite o valor da altura:");
        altura = scanner.nextDouble();

        area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }
}
