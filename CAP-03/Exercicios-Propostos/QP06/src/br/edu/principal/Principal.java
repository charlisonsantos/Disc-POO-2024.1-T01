package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = sc.nextDouble();
        System.out.print("Digite o valor das vendas do funcionário: ");
        double vendas = sc.nextDouble();
        double comissao = vendas * 0.04; // 4% de comissão
        double salarioFinal = salarioFixo + comissao;
        System.out.println("A comissão é: " + comissao);
        System.out.println("O salário final é: " + salarioFinal);
        sc.close();
    }
}
