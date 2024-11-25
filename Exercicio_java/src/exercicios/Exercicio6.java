package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] arg) {
		Scanner beb = new Scanner(System.in);
		System.out
				.println("Boa Tarde \nDigite o número da bebida desejada:\n1- Café\n2- Chá\n3- Suco\n4- Refrigerante");
		int bebida = beb.nextInt();
		
		switch(bebida){
			case 1:
				System.out.println("A bebida escolhida foi Café ");
			break;
			case 2:
				System.out.println("A bebida escolhida foi Chá");
			break;
			case 3:
				System.out.println("A bebida escolhida foi Suco");
			break;
			case 4:
				System.out.println("A bebida escolhida foi Refrigerante");
			break;
			default:
				System.out.println("Opção digitada inválida");
			break;
		}
		beb.close();
	}
}
