package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a diagonal maior: ");
        double diagonalMaior = sc.nextDouble();
        System.out.print("Digite a diagonal menor: ");
        double diagonalMenor = sc.nextDouble();
        double area = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("A área do losango é: " + area);
        sc.close();
    }
}
