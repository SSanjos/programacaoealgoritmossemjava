package arrays;

import java.security.SecureRandom;

public class SorteioLivro {
	
	public static void main(String[] args) {
	
	String sorteado ="";
	int numeroSorteado;
	SecureRandom sorteio = new SecureRandom(); // objeto responsável pelo sorteio
	
	String[] emails = {"sandro@gmail.com", "thiago@gmail.com", "priscilla@gmail.com", "leandro@gmail.com", "andrea@gmail.com"};
	int[] qtdSorteado = new int[emails.length];
	
	// fazendo um sorteio 30 vezes para os 5 emails do array e alimentando o array qtdSorteado
	for (int i = 1; i <=49; i++) {
		numeroSorteado = sorteio.nextInt(emails.length); // sorteia o número (0 a 4) 5 posições		
		sorteado = emails[numeroSorteado];	//	e-mail sorteado
		System.out.println(sorteado); 	//mostra o e-mail sorteado
	 qtdSorteado[numeroSorteado] = qtdSorteado[numeroSorteado]  + 1; // faz a contagem de vezes	e alimenta o array qtdSorteado
	}
	System.out.println();
	System.out.println("******APURAÇÃO******");
		
	int vencedor = 0;
	int indice = 0;
	for (int i = 0; i < qtdSorteado.length; i++) {
		System.out.println(emails[i] + " = " + qtdSorteado[i]); //exibindo a lista de e-mails com a quantidade de sorteios
		
		if(qtdSorteado[i] > vencedor) { // Determinando o ganhador
			 vencedor = qtdSorteado[i];
					 indice = i;
		}		
	}
	System.out.println();
	System.out.println("GANHADOR: " + emails[indice] + " = " + vencedor ); // mostrando o ganhador
		
	}	
}