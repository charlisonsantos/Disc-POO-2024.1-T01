package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço de fábrica do veículo: ");
        double precoFabrica = scanner.nextDouble();

        System.out.print("Digite o percentual de lucro do distribuidor: ");
        double percLucro = scanner.nextDouble();

        System.out.print("Digite o percentual de impostos: ");
        double percImpostos = scanner.nextDouble();

        double valorLucro = precoFabrica * percLucro / 100;
        double valorImpostos = precoFabrica * percImpostos / 100;
        double precoFinal = precoFabrica + valorLucro + valorImpostos;

        System.out.println("Valor do lucro do distribuidor: " + valorLucro);
        System.out.println("Valor dos impostos: " + valorImpostos);
        System.out.println("Preço final do veículo: " + precoFinal);

        scanner.close();
    }
}
