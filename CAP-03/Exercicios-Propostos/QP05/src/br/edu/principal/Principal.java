package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        double novoPreco = preco * 0.9; // 10% de desconto
        System.out.println("O novo preço é: " + novoPreco);
        sc.close();
    }
}
