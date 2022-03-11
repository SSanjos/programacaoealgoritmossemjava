package exercicios;

import java.util.Scanner;

public class VericacaoOa10eSePar {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Verificar se está entre 0 e 10 e se é par"); 
			
		System.out.print("Informe um numero: ");
		int num = teclado.nextInt();
		
		teclado.close();
		
		boolean numeroMenorIgualDezEMaiorIgualZero = num <=10 && num >=0;
		boolean restoDivisaoPorDoisIgualZero = num % 2 == 0;
		boolean restoDivisaoPorDoisIgualUm = num % 2 == 1;
				
		
		if ((numeroMenorIgualDezEMaiorIgualZero) && (restoDivisaoPorDoisIgualZero)) {
				System.out.println("O número " + num + " está entre (0 e 10) e é par.");
				return;
			} else if ((numeroMenorIgualDezEMaiorIgualZero) && (restoDivisaoPorDoisIgualUm)) {
				System.out.println("O número " + num + " está entre (0 e 10) mas não é par.");
				return;
				} 
				System.out.println("O número " + num + " não atende os dois requisitos do enunciado.");
				
		
	}

}
