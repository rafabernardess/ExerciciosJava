package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Bem-Vindo!\n");
		System.out.println("Digite o numero  da opção desejada: \n"
				+ "1- Olá, Mundo!\n" 
				+ "2- Bem-vindo ao Java \n"
				+ "3- Sair do programa");
		int resposta = scn.nextInt();
		
		switch(resposta){
			case 1:
				System.out.println("Olá, Mundo!");
			break;
			case 2:
				System.out.println("Bem-Vindo ao Java!");
			break;
			case 3:
				System.out.println("Fim do Programa");
		}
		scn.close();
	}
}
