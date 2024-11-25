package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] arg) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Digite sua Idade: ");
		int idade = scn.nextInt();

		String categoria;

		if (idade >= 0 && idade <= 12) {
			categoria = "crianca";
		} else if (idade >= 13 && idade <= 17) {
			categoria = "adolescente";
		} else if (idade >= 18 && idade <= 64) {
			categoria = "adulto";
		} else if (idade >= 65) {
			categoria = "idoso";
		} else {
			categoria = "invalida";
		}

		switch (categoria) {
		case "crianca":
			System.out.println("Você é uma criança.");
			break;
		case "adolescente":
			System.out.println("Você é um adolescente.");
			break;
		case "adulto":
			System.out.println("Você é um adulto.");
			break;
		case "idoso":
			System.out.println("Você é um idoso.");
			break;
		default:
			System.out.println("Idade inválida.");
			break;
		}
		scn.close();
	}
}