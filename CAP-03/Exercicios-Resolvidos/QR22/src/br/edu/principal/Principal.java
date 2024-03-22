package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite a quantidade de quilowatts consumida: ");
        double qtdQuilowatts = scanner.nextDouble();

        double valorQuilowatt = salarioMinimo / 5;
        double valorTotal = valorQuilowatt * qtdQuilowatts;
        double desconto = valorTotal * 15 / 100;
        double valorComDesconto = valorTotal - desconto;

        System.out.println("Valor de cada quilowatt: R$ " + valorQuilowatt);
        System.out.println("Valor a ser pago: R$ " + valorTotal);
        System.out.println("Valor a ser pago com desconto de 15%: R$ " + valorComDesconto);

        scanner.close();
    }
}
