package exercicios;
// A proprietária da doceteria "Doces & Gostosuras" convidou vinte clientes para
//votar em uma escala de 1 a 5 a qualidade geral do produto, sendo  1 para “ruim”, 
//2 para "regular", 3 para "bom", 4 para "muito bom" e 5 para “excelente”.

public class PesquisaQualidadeProduto {
	
	public static void main(String[] args) {

		// array das respostas dos clientes
		int[] voto = { 5, 3, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 4, 5, 5, 5, 4 };
		int[] escala = new int[6]; // array de 6 posições para desconsiderar posição 0
		String[] qualidade = {" ", "  ruim", "  regular", "  bom", "  muito bom", "  excelente" };
				
		for (int contarVoto = 0; contarVoto < voto.length; contarVoto++) 
			++escala[voto[contarVoto]]; // ++incrementa para ignorar escala 0
		
		System.out.println("Qualidade geral do produto: Escala 1 a 5: ");
		System.out.println("1 para \"ruim\" e 5 para \"excelente\".");
		System.out.println();
		System.out.printf("%12s%10s%13s%n", "Escala", "Votos", "Percentual");
		
		for (int classificar = 1; classificar < escala.length; classificar++) 
			System.out.printf("%12d%10d%12.2f%s%s%n", classificar, escala[classificar],
					((escala[classificar] / (double) voto.length) * 100), "%", qualidade[classificar]);				
		
		System.out.println("-----------------------------------");
		System.out.printf("%12s%10d%13s%n", "Total Votos", voto.length, "100,00%");	
		
	}
}
