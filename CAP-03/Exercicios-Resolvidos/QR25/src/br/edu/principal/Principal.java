package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo do espetáculo teatral: ");
        double custo = scanner.nextDouble();

        System.out.print("Digite o preço do convite: ");
        double convite = scanner.nextDouble();

        int qtd = (int) Math.ceil(custo / convite);

        System.out.println("Quantidade de convites que devem ser vendidos: " + qtd);

        scanner.close();
    }
}
