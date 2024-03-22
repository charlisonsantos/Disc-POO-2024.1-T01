package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, peso1, peso2, peso3, soma1, soma2, soma3, total, media;

        System.out.println("Digite a primeira nota e seu peso:");
        nota1 = scanner.nextDouble();
        peso1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota e seu peso:");
        nota2 = scanner.nextDouble();
        peso2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota e seu peso:");
        nota3 = scanner.nextDouble();
        peso3 = scanner.nextDouble();

        soma1 = nota1 * peso1;
        soma2 = nota2 * peso2;
        soma3 = nota3 * peso3;
        total = peso1 + peso2 + peso3;
        media = (soma1 + soma2 + soma3) / total;

        System.out.println("A média ponderada é: " + media);

        scanner.close();
    }
}

