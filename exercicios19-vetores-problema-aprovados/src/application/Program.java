/*
	Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles 
	tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. 
	Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média 
	das notas seja maior ou igual a 6.0 (seis).
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados: ");
		int n = sc.nextInt();
		Aluno[] vect = new Aluno[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			sc.nextLine();
			String nome = sc.nextLine();
			double notaPrimeiroSemestre = sc.nextDouble();
			double notaSegundoSemestre = sc.nextDouble();

			vect[i] = new Aluno(nome, notaPrimeiroSemestre, notaSegundoSemestre);
		}

		System.out.println("Alunos aprovados:");
		for (int i = 0; i < vect.length; i++) {
			double media = (vect[i].getNotaPrimeiroSemestre() + vect[i].getNotaSegundoSemestre()) / 2;
			if (media >= 6.0) {
				System.out.println(vect[i].getNome());
			}
		}

		sc.close();

	}

}
