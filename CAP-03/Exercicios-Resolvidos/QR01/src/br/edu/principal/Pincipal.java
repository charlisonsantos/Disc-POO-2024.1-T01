package br.edu.principal;

import java.util.Scanner;

public class Pincipal {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Digite o primeiro número:");
		        int n1 = scanner.nextInt();

		        System.out.println("Digite o segundo número:");
		        int n2 = scanner.nextInt();

		        System.out.println("Digite o terceiro número:");
		        int n3 = scanner.nextInt();

		        System.out.println("Digite o quarto número:");
		        int n4 = scanner.nextInt();

		        int soma = n1 + n2 + n3 + n4;
		        System.out.println("A soma dos números é: " + soma);

		        scanner.close();
		    }

	}