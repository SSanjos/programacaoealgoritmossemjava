package exercicios;
//Programa que valida uma senha digitada de acordo com os seguintes critérios: mínimo de
//6 caracteres, pelo menos um caracter especial " !@#$%&*()+- ", uma letra maiúscula, uma
//letra minúscula e um dígito.

import java.util.Scanner;

public class VerificadorSenhaForteV03 {

	public static void main(String[] args) {

		boolean validacao = false;
		int tamanhoSenha = 0;
		int tam = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Crie sua senha. Requisitos: Minino de 6 caracteres, pelo menos um caracter");
		System.out.println("especial !@#$%&*()+-, uma letra maiúscula, uma letra minúscula e um dígito.");
		System.out.println();

		while (tamanhoSenha < 6 || validacao == false) {

			tamanhoSenha = 0;
			validacao = false;

			System.out.print("Digite uma senha: ");
			String senha = teclado.next();

			tamanhoSenha = senha.length();

			if (tamanhoSenha < 6) {
				tam = 6 - tamanhoSenha;
				System.out.println("Você digitou uma senha com " + tamanhoSenha + " caracteres, falta(m) " + tam + ".");
			}

			validacao = validarSenha(senha);
			if (validacao == false)
				System.out.println("Senha inválida!");

			System.out.println("========================================");

		}
		System.out.println("SENHA CADASTRADA!");
		teclado.close();

	}

	private static boolean validarSenha(String senha) {
		return senha.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&*()-+])(?=\\S+$).{6,}"); // requisitos para
																									// senha
	}
}
