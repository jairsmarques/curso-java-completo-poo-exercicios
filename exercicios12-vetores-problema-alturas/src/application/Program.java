/*
	Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. 
	Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de
	pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			vect[i] = new Pessoa(nome, idade, altura);
		}

		System.out.println();
		double somaAltura = 0.0;
		for (int i = 0; i < vect.length; i++) {
			somaAltura += vect[i].getAltura();
		}
		double mediaAltura = somaAltura / vect.length;
		System.out.printf("Altura média: %.2f%n", mediaAltura);

		int quantidadeMenorIdade = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				quantidadeMenorIdade++;
			}
		}
		double mediaMenorIdade = quantidadeMenorIdade * 100.0 / vect.length;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", mediaMenorIdade);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}

		sc.close();

	}

}
