package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro cateto: ");
        double cateto1 = sc.nextDouble();
        System.out.print("Digite o valor do segundo cateto: ");
        double cateto2 = sc.nextDouble();
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        System.out.println("O valor da hipotenusa é: " + hipotenusa);
        sc.close();
    }
}
