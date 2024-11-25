package exercicios;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] arg) {

		Scanner id = new Scanner(System.in);
		System.out.println(
				"Digite o numero do filme que deseja assistir:\n1- Turma da Monica \nClassificação Etária: G(livre para todos os públicos)\n2- As aventuras de tintim \nClassificação Etária: PG(Para maiores de 10 anos) \n3- As vantagens de Ser Invisivel \nClassificação Etária: PG-13(Para maiores de 13 anos)\n4- Jogos Mortais \nClassificação Etária: R(Para Maiores de 18 anos)  ");
		int filme = id.nextInt();
		int idade_f;
		int idade;
		
		switch (filme) {
		case 1:
			System.out.println("Filme escolhido foi 'Turma da Monica'");
			System.out.println("Muito Obrigado pela preferência e boa sessão");
			break;

		case 2:
			idade_f = 10;
			System.out.println("Filme escolhido foi 'As aventuras de Tintim'");
			System.out.println("Digite sua idade: ");
			idade = id.nextInt();
			if(idade < idade_f){
				System.out.println("Idade não permitida para este filme");
			}else {
				System.out.println("Muito Obrigado pela preferência e boa sessão");
			}
			break;

		case 3:
			idade_f = 13;
			System.out.println("Filme escolhido foi 'As vantagens de ser invisível'");
			System.out.println("Digite sua idade: ");
			idade = id.nextInt();
			if(idade < idade_f){
				System.out.println("Idade não permitida para este filme");
			}else {
				System.out.println("Muito Obrigado pela preferência e boa sessão");
			}
			break;
			

		case 4:
			idade_f = 18;
			System.out.println("Filme escolhido foi 'Jogos Mortais'");
			System.out.println("Digite sua idade: ");
			idade = id.nextInt();
			if(idade < idade_f){
				System.out.println("Idade não permitida para este filme");
			}else {
				System.out.println("Muito Obrigado pela preferência e boa sessão");
			}
			break;

		default:
			System.out.println("Número de sessão Inválida, Digite uma sessão válida");
		}

		id.close();
	}

}
