package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] arg) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o n�mero do dia da semana (1 a 7): ");
        int dia = scn.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Ter�a-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("S�bado");
                break;
            default:
                System.out.println("N�mero inv�lido! Digite um n�mero entre 1 e 7.");
                break;
        }

        scn.close();
    }
}
