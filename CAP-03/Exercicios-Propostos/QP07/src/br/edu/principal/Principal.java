package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de dinheiro em reais: ");
        double dinheiro = sc.nextDouble();
        double dolar = dinheiro / 1.80;
        double marco = dinheiro / 2.00;
        double libra = dinheiro / 3.57;
        System.out.println("Valor em dólares: " + dolar);
        System.out.println("Valor em marco alemão: " + marco);
        System.out.println("Valor em libra esterlina: " + libra);
        sc.close();
    }
}
