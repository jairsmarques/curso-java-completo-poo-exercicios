/*
	Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. 
	Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, 
	mostrar na tela o nome da pessoa mais velha.
 */

package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();

			vect[i] = new Pessoa(nome, idade);
		}

		int pessoaMaisVelha = 0;
		int posicaoPessoaMaisVelha = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() > pessoaMaisVelha) {
				pessoaMaisVelha = vect[i].getIdade();
				posicaoPessoaMaisVelha = i;
			}
		}

		System.out.println("PESSOA MAIS VELHA: " + vect[posicaoPessoaMaisVelha].getNome());

		sc.close();

	}

}
