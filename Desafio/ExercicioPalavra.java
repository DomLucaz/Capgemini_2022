package Desafio;

/* Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas 
 * para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o n�mero de pares 
 * de substrings que s�o anagramas.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ExercicioPalavra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Vari�veis
		String palavra;

		// Leitor da entrada de dados
		Scanner read = new Scanner(System.in);

		// L�gica
		System.out.println("Digite o texto : ");
		palavra = read.nextLine();

		// Mencionei uma fun��o para melhor entendimento
		anagrama(palavra);
	}

	//  Fun��o criada
	static void anagrama(String palavra) {

		// Armazenamento do valor dos caracteres colocados
		HashMap<String, Integer> mapa = new HashMap<>();

		// L�gica
		for (int i = 0; i <= palavra.length(); i++) {

			for (int j = i; j < palavra.length(); j++) {

				// Vari�vel para armazenar os caracteres
				char[] caracter = palavra.substring(i, j + 1).toCharArray();
				Arrays.sort(caracter);
				String subCaract = new String(caracter);

				// Verificar cada substring
				if (mapa.containsKey(subCaract)) {
					mapa.put(subCaract, mapa.get(subCaract) + 1);
				} else {
					mapa.put(subCaract, 1);
				}
			}
		}

		// Verificador dos anagramas
		int contPares = 0;

		for (String cont : mapa.keySet()) {

			int n = mapa.get(cont);
			contPares += (n * (n - 1)) / 2;
		}
		System.out.print("Quantidade de pares que s�o anagramas � de " + contPares);
	}

}
