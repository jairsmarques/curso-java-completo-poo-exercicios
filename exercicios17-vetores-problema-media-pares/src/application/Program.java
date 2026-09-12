/*
	Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela 
	a média aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum 
	número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		int quantidadePares = 0;
		int somaPares = 0;
		for (int i = 0; i < n; i++) {
			if (vect[i] % 2 == 0) {
				quantidadePares++;
				somaPares += vect[i];
			}
		}

		if (quantidadePares > 0) {
			double mediaPares = somaPares / quantidadePares;
			System.out.printf("MÉDIA DOS PARES = %.1f%n", mediaPares);
		} else {
			System.out.println("NENHUM NÚMERO PAR");
		}

		sc.close();

	}

}
