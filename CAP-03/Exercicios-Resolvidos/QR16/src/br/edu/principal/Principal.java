package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        double valorHoraTrabalhada = salarioMinimo / 2;
        double salarioBruto = valorHoraTrabalhada * horasTrabalhadas;
        double imposto = salarioBruto * 3 / 100;
        double salarioLiquido = salarioBruto - imposto;

        System.out.println("Salário a receber: " + salarioLiquido);

        scanner.close();
    }
}
