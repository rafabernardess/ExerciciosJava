package exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Digite uma nota de 0 a 10: ");
		int nota = scn.nextInt();

			switch (nota) {
			case 10:
			case 9:
				System.out.println("Classifica��o: A");
				break;
			case 8:
			case 7:
				System.out.println("Classifica��o: B");
				break;
			case 6:
			case 5:
				System.out.println("Classifica��o: C");
				break;
			case 4:
			case 3:
				System.out.println("Classifica��o: D");
				break;
			case 2:
			case 1:
			case 0:
				System.out.println("Classifica��o: F");
				break;
			}
			scn.close();
		}
	}

