package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida em pés: ");
        double pes = scanner.nextDouble();

        double polegadas = pes * 12;
        double jardas = pes / 3.0; // Usamos 3.0 para garantir a divisão de números reais
        double milhas = jardas / 1760.0; // Usamos 1760.0 para garantir a divisão de números reais

        System.out.println("Polegadas: " + polegadas);
        System.out.println("Jardas: " + jardas);
        System.out.println("Milhas: " + milhas);

        scanner.close();
    }
}
