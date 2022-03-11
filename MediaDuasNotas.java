package exercicios;

import java.util.Scanner;

public class MediaDuasNotas {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
			System.out.println("Informe duas notas para obter a média do aluno.");
			
			System.out.print("Digite a 1ª nota : ");
			double nota1 = teclado.nextDouble();
			System.out.print("Digite a 2ª nota : ");
			double nota2 = teclado.nextDouble();
			
			teclado.close();
			
			double media = (nota1 + nota2)/2;
			
			if (media >=7) {											
				System.out.println("Média: " + media + " Aprovado"); 
				return;
			} else if (media > 4) { 									
				System.out.println("Média: " + media + " Recuperação");
				return;
			} 														
				System.out.println("Média: " + media + " Reprovado");		
	}
}
