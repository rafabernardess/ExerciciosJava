package exercicios;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] arg) {
		Scanner imp = new Scanner(System.in);
		System.out.println("Digite seu salário para o calculo de impostos: ");
		float salario = imp.nextFloat();
		int porcentagem = 5;
		
		if(salario <= 1500.00){
			porcentagem = 5;
		}else if(salario >= 1501.00 && salario <= 3000){
			porcentagem = 10;
		}else if(salario > 3000.00){
			porcentagem = 15;
		}
		
		float imposto = (porcentagem * salario) / 100;		
		
		switch(porcentagem){
		case 5:			
			System.out.println("O valor a pagar de imposto é de: R$" + imposto);
		break;
		case 10:
			System.out.println("O valor a pagar de imposto é de: R$" + imposto);
		break;
		case 15:
			System.out.println("O valor a pagar de imposto é de: R$" + imposto);
		}
		imp.close();
	}
}
