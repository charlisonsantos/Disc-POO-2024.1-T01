package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário recebido: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o valor do primeiro cheque emitido: ");
        double cheque1 = scanner.nextDouble();

        System.out.print("Digite o valor do segundo cheque emitido: ");
        double cheque2 = scanner.nextDouble();

        double cpmf1 = cheque1 * 0.38 / 100;
        double cpmf2 = cheque2 * 0.38 / 100;
        double saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;

        System.out.println("Saldo atual: " + saldo);

        scanner.close();
    }
}
