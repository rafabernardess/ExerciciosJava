package exercicios;

import java.util.Scanner;

public class ExercicioCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número para calcular o fatorial: ");
		int numero = scanner.nextInt();

		long fatorial = 1;

		switch (numero >= 0 ? (numero == 0 ? 0 : 1) : -1) {
		case -1:
			System.out.println("Não é possível calcular o fatorial de um número negativo.");
			break;

		case 0:
			System.out.println("O fatorial de 0 é 1.");
			break;

		case 1:
			for (int i = 1; i <= numero; i++) {
				fatorial *= i;
			}
			System.out.println("O fatorial de " + numero + " é " + fatorial + ".");
			break;

		default:
			System.out.println("Erro inesperado.");
		}

		scanner.close();

	}
}
