package Desafio;

/*Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espa�os. 
 * A base e altura da escada devem ser iguais ao valor de n. A ultima linha n�o deve conter nenhum espa�o.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioEscada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Vari�veis
		List<String> degrausEscada = new ArrayList<>();
		int n; // n representa a quantidade de degraus da escada para a sua altura e base

		// Leitor da entrada de dados
		Scanner read = new Scanner(System.in);

		// L�gica
		System.out.println(" Digite a altura da escada: ");
		n = read.nextInt();

		// Impress�o do loop da escada
		for (int x = 0; x < n; x++) {
			degrausEscada.add(" ".repeat(n - x) + "*".repeat(x + 1));
		}

		for (String d : degrausEscada) {
			System.out.println(d);
		}

	}

}
