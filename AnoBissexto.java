package exercicios;

import java.util.Scanner;

public class AnoBissexto {
	
	public static void main(String[] args) {
		
		System.out.println("Verificar se o ano é bissexto");
		System.out.print("Informe o ano com 4 dígitos: ");
		
		Scanner teclado = new Scanner(System.in);
		int ano = teclado.nextInt();
		
		boolean anoDivisaoExataPor4 = ano % 4 == 0;
		boolean anoNaoDivisaoExataPor100 = ano % 100 != 0;
		boolean anoNaoDivisaoExataPor4 = ano % 4 != 0;
		boolean anoDivisaoExataPor400 = ano % 400 == 0;
				
		teclado.close();
		
		if ((anoDivisaoExataPor4 && anoNaoDivisaoExataPor100)
				|| (anoNaoDivisaoExataPor4 && anoDivisaoExataPor400)) {
			System.out.println("O ano "+ ano + " é bissexto");
			return;
		} 
			System.out.println("O ano "+ ano + " não é bissexto");		
	}

}
