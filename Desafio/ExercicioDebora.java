package Desafio;

/* D�bora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 * A p�gina de cadastro exigia o preenchimento dos campos de nome e senha, por�m a senha precisa ser forte. 
 * O site considera uma senha forte quando ela satisfaz os seguintes crit�rios:
 *		Possui no m�nimo 6 caracteres.
 *		Cont�m no m�nimo 1 digito.
 *		Cont�m no m�nimo 1 letra em min�sculo.
 *		Cont�m no m�nimo 1 letra em mai�sculo.
 *		Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+
 *	D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem certeza se � uma senha forte. 
 *	Para ajudar D�bora, construa um algoritmo que informe qual � o n�mero m�nimo de caracteres que devem ser adicionados 
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

		// Vari�veis
		String senha;
		int qtd;

		// Leitor da entrada de dados
		Scanner read = new Scanner(System.in);

		// L�gica
		System.out.println("Digite sua senha: ");
		senha = read.next();

		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[!@#$%^&*()-+])" + "(?=\\S+$).{6}$";

		// Combina��o da senha fornecida com o regex
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(senha);

		// Verifica��o da quantidade de caracteres da senha
		if (senha.length() < 6) {
			qtd = 6 - senha.length();
			System.out.println("Deve ser digitado " + qtd + " caracters para a senha ser considerada segura");
		}

	}

}
