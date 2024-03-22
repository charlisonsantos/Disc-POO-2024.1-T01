package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora no formato (hh.mm): ");
        double hora = scanner.nextDouble();

        int h = (int) hora;
        double m = hora - h;

        int conversao = (int) ((h * 60) + (m * 100));

        System.out.println("Hora em minutos: " + conversao + " minutos");

        scanner.close();
    }
}
