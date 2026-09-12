/*
	Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. 
	Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais. 
	Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa
	decimal cada.
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
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		System.out.println();
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		double mediaVetor = soma / n;
		System.out.printf("MÉDIA DO VETOR = %.3f%n", mediaVetor);

		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for (int i = 0; i < n; i++) {
			if (vect[i] < mediaVetor) {
				System.out.println(vect[i]);
			}
		}

		sc.close();

	}

}
