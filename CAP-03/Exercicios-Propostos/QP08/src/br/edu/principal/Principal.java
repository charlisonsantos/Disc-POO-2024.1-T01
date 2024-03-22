package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora: ");
        int hora = sc.nextInt();
        System.out.print("Digite os minutos: ");
        int minutos = sc.nextInt();
        int minutosTotais = hora * 60 + minutos;
        int segundosTotais = minutosTotais * 60;
        System.out.println("Hora convertida em minutos: " + minutosTotais);
        System.out.println("Total de minutos: " + minutosTotais);
        System.out.println("Total de segundos: " + segundosTotais);
        sc.close();
    }
}
