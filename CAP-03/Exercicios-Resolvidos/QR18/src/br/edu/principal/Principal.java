package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do saco de ração em quilos: ");
        double pesoSaco = scanner.nextDouble();

        System.out.print("Digite a quantidade de ração fornecida para o gato 1 em gramas: ");
        double racaoGato1 = scanner.nextDouble() / 1000;

        System.out.print("Digite a quantidade de ração fornecida para o gato 2 em gramas: ");
        double racaoGato2 = scanner.nextDouble() / 1000;

        double totalFinal = pesoSaco - 5 * (racaoGato1 + racaoGato2);

        System.out.println("Quantidade restante de ração no saco após cinco dias: " + totalFinal + " kg");

        scanner.close();
    }
}
