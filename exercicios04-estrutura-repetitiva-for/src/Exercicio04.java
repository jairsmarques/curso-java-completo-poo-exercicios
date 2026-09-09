/*
 	Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão
 	do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao 
 	impossivel".
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int x, y;
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();

			if (y != 0) {
				System.out.println((double) x / y);
			} else {
				System.out.println("divisão impossível");
			}
		}

		sc.close();

	}

}
