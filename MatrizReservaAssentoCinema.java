package algoritmosII.vetores;
//Exercício de matriz reserva assento no cinema com tratamento de exceção

import java.util.Scanner;

public class MatrizReservaAssentoCinema {

	public static void main(String[] args) {

		String[][] cinema = new String[5][5];
		int escolha;

		Scanner teclado = new Scanner(System.in);

		montarLayoutCinema(cinema);

		do {
			escolha = menuCinema(teclado);

			switch (escolha) {

			case 1:
				reservarAssento(teclado, cinema);	
				break;
				
			case 2:
				verLayoutCinema(cinema);
				break;

			default:
				if (escolha != 3) {
					System.out.println("Opção Inválida");
				}
			}

		} while (escolha != 3);
		System.out.println("Aplicação encerrada!");

		teclado.close();
	}

	private static String[][] montarLayoutCinema(String[][] cinema) {
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				cinema[i][j] = "O";
			}
		}
		return cinema;
	}

	private static int menuCinema(Scanner teclado) {
		System.out.println();
		System.out.println("MENU OPÇÕES");
		System.out.println("1 - Reservar");
		System.out.println("2 - Layout do Cinema");
		System.out.println("3 - Sair");
		System.out.print("Escolha a opção: ");
		int opcao = teclado.nextInt();
		return opcao;
	}

	private static void reservarAssento(Scanner teclado, String[][] cinema) {
		try {
			System.out.print("Informe a linha: ");
			int linha = teclado.nextInt();
			System.out.print("Informe a coluna: ");
			int coluna = teclado.nextInt();

			if (cinema[linha][coluna].equalsIgnoreCase("O")) {
				cinema[linha][coluna] = "X";
				System.out.println("Assento reservado com sucesso!");
				return;
			} System.out.println("Assento ocupado, escolha outro!");
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("PARÂMETRO INVÁLIDO");
		}		
	}
	
	private static String[][] verLayoutCinema(String[][] cinema) {
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				System.out.print(" " + cinema[i][j] + " ");
			}
			System.out.println();
		}
		return cinema;
	}
}
