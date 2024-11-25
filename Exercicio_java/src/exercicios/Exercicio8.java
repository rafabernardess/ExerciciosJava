package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] arg) {
		Scanner temp = new Scanner(System.in);
		System.out.println("Escolha o modo de convers�o\n1- Celcius para fahrenheit\n2- Fahrenheit para celcius");
		int escolha = temp.nextInt();
		
		switch(escolha) {
		case 1:
			System.out.println("Digite a temperatura que deseja converter para 'Fahrenheit': ");
			double Celcius_F = temp.nextInt();
			double conv_C_F = ((Celcius_F * (9.0/5)) + 32) ; 
			System.out.println("A temperatura Celcius (�C) convertida para fahrenheit(�F) � de: " + conv_C_F + "�F");
		break;
		
		case 2:
			System.out.println("Digite a temperatura que deseja converter para 'Celcius': ");
			double Fahren_C = temp.nextInt(); 
			double conv_F_C = ((Fahren_C - 32) * (5.0 / 9)); 
			System.out.println("A temperatura fahrenheit(�F) convertida para Celcius (�C) � de: " + conv_F_C + "�C");
		break;
		}
		temp.close();
	}

}
