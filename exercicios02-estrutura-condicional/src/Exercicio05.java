/*
	Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade
	deste item. A seguir, calcule e mostre o valor da conta a pagar.
	
			CÓDIGO       ESPECIFICAÇÃO           PREÇO
			   1        Cachorro Quente         R$ 4.00
			   2           X-Salada             R$ 4.50
			   2           X-Bacon              R$ 5.00
			   2        Torrada Simples         R$ 2.00
			   2          Refrigerante          R$ 1.50
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		double totalPagamento = 0;
		if (codigo == 1) {
			totalPagamento = quantidade * 4.00;
			System.out.printf("TOTAL: R$ %.2f%n", totalPagamento);
		} else if (codigo == 2) {
			totalPagamento = quantidade * 4.50;
			System.out.printf("TOTAL: R$ %.2f%n", totalPagamento);
		} else if (codigo == 3) {
			totalPagamento = quantidade * 5.00;
			System.out.printf("TOTAL: R$ %.2f%n", totalPagamento);
		} else if (codigo == 4) {
			totalPagamento = quantidade * 2.00;
			System.out.printf("TOTAL: R$ %.2f%n", totalPagamento);
		} else if (codigo == 5) {
			totalPagamento = quantidade * 1.50;
			System.out.printf("TOTAL: R$ %.2f%n", totalPagamento);
		}

		sc.close();

	}

}
