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
		System.out.println("Digite a operação a ser feita: ");
		String operacao = scn.next();

		switch (operacao) {
		case "+":
			resultado = valor1 + valor2;
			System.out.println("A soma dos numeros digitados é: " + resultado);
			break;
		
		case "-":
			resultado = valor1 - valor2;
			System.out.println("A subtração dos numeros digitados é: " + resultado);
			break;
			
		case "/": 
			 if (valor2 != 0) { 
                 resultado = (float) valor1 / valor2;
                 System.out.println("A divisão dos números digitados é: " + resultado);
             } else {
                 System.out.println("Erro: divisão por zero não é permitida.");
             }
			 break;
			
		case "*":
			resultado = valor1 * valor2; 
			System.out.println("A multiplicação dos numeros digitados é: " + resultado);
			break;
			
		default: 
			System.out.println("operação invalida");
			
		}
	scn.close();
	}
}
