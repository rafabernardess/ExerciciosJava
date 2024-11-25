package exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int valor1 = scn.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = scn.nextInt();
		float resultado;
		System.out.println("Digite a opera��o a ser feita: ");
		String operacao = scn.next();

		switch (operacao) {
		case "+":
			resultado = valor1 + valor2;
			System.out.println("A soma dos numeros digitados �: " + resultado);
			break;
		
		case "-":
			resultado = valor1 - valor2;
			System.out.println("A subtra��o dos numeros digitados �: " + resultado);
			break;
			
		case "/": 
			 if (valor2 != 0) { 
                 resultado = (float) valor1 / valor2;
                 System.out.println("A divis�o dos n�meros digitados �: " + resultado);
             } else {
                 System.out.println("Erro: divis�o por zero n�o � permitida.");
             }
			 break;
			
		case "*":
			resultado = valor1 * valor2; 
			System.out.println("A multiplica��o dos numeros digitados �: " + resultado);
			break;
			
		default: 
			System.out.println("opera��o invalida");
			
		}
	scn.close();
	}
}
