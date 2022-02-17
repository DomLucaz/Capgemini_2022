package Desafio;

/* Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 * A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. 
 * O site considera uma senha forte quando ela satisfaz os seguintes critérios:
 *		Possui no mínimo 6 caracteres.
 *		Contém no mínimo 1 digito.
 *		Contém no mínimo 1 letra em minúsculo.
 *		Contém no mínimo 1 letra em maiúsculo.
 *		Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
 *	Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. 
 *	Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados 
 *	para uma string qualquer ser considerada segura.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExercicioDebora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variáveis
		String senha;
		int qtd;

		// Leitor da entrada de dados
		Scanner read = new Scanner(System.in);

		// Lógica
		System.out.println("Digite sua senha: ");
		senha = read.next();

		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[!@#$%^&*()-+])" + "(?=\\S+$).{6}$";

		// Combinação da senha fornecida com o regex
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(senha);

		// Verificação da quantidade de caracteres da senha
		if (senha.length() < 6) {
			qtd = 6 - senha.length();
			System.out.println("Deve ser digitado " + qtd + " caracters para a senha ser considerada segura");
		}

	}

}
