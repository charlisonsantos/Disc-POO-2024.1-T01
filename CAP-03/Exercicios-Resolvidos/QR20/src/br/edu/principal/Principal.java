package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo formado pela escada em graus: ");
        double angulo = scanner.nextDouble();

        System.out.print("Digite a altura da parede onde está a ponta da escada em metros: ");
        double altura = scanner.nextDouble();

        double radiano = Math.toRadians(angulo);
        double escada = altura / Math.sin(radiano);

        System.out.println("Comprimento da escada: " + escada + " metros");

        scanner.close();
    }
}
