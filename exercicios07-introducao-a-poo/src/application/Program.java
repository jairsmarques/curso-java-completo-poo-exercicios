/*
	Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três 
	primeiros trimestres do ano. Ao final,  mostrar qual a nota final do aluno no ano.
	Dizer também se o aluno está aprovado(PASS) ou não (FAILED) e, em caso negativo, quantos
	pontos faltam para o aluno obter o mínimo para ser aprovado(que é 60% da nota).
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		aluno.nome = sc.nextLine();
		aluno.primeiraNota = sc.nextDouble();
		aluno.segundaNota = sc.nextDouble();
		aluno.terceiraNota = sc.nextDouble();

		if (aluno.finalGrade() < 60) {
			System.out.printf("FINAL GRADE: %.2f%n", aluno.finalGrade());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
		} else {
			System.out.printf("FINAL GRADE: %.2f%n", aluno.finalGrade());
			System.out.println("PASS");
		}

		sc.close();

	}

}
