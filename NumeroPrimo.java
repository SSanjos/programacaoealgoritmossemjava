package exercicios;

import java.util.Scanner;

public class NumeroPrimo {
	
	public static void main(String[] args) {
		
			/* Números primos são os números naturais, ou seja, números inteiros
			 * não negativos, que são divisíveis somente por dois divisores: 
			 * o número 1 e ele mesmo.  
			 */
					
			System.out.println("Receber um número e informar se é primo"); 
			
			System.out.print("Informe um numero inteiro positivo: ");
			Scanner teclado = new Scanner(System.in);
			int numero = teclado.nextInt();
			teclado.close();
			
			int contDivisores = 0;
						
			for (int i = 2; i < numero; i++ ) { // A formula checa se o numero é divisível por ele mesmo
				if (numero % i == 0 ) {         // e por outros cujo resto da divisão dê zero, se verdadeiro resulta
					contDivisores++;          	// em número que não é primo e acrescenta 1 ao contador
				}
			}	
				if (contDivisores == 0) {
				System.out.println("O número " + numero + " é primo.");
				return;
			 }

			System.out.println("O número " + numero + " não é primo.");			 

	}
}
