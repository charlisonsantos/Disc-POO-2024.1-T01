package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura de cada degrau em metros: ");
        double alturaDegrau = scanner.nextDouble();

        System.out.print("Digite a altura que o usuário deseja alcançar em metros: ");
        double alturaUsuario = scanner.nextDouble();

        int qtdDegraus = (int) Math.ceil(alturaUsuario / alturaDegrau);

        System.out.println("Quantidade de degraus a subir: " + qtdDegraus);

        scanner.close();
    }
}
