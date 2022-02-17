package Desafio;

/*Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
 * A base e altura da escada devem ser iguais ao valor de n. A ultima linha não deve conter nenhum espaço.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioEscada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variáveis
		List<String> degrausEscada = new ArrayList<>();
		int n; // n representa a quantidade de degraus da escada para a sua altura e base

		// Leitor da entrada de dados
		Scanner read = new Scanner(System.in);

		// Lógica
		System.out.println(" Digite a altura da escada: ");
		n = read.nextInt();

		// Impressão do loop da escada
		for (int x = 0; x < n; x++) {
			degrausEscada.add(" ".repeat(n - x) + "*".repeat(x + 1));
		}

		for (String d : degrausEscada) {
			System.out.println(d);
		}

	}

}
