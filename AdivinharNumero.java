package exercicios;

import java.util.Random;
import java.util.Scanner;

public class AdivinharNumero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Adivinhar número entre 0 e 100 com 10 chances");

		String menu = "S";
		while (menu.equalsIgnoreCase("S")) {

			Random random = new Random();
			int numR = random.nextInt(100); // Gerando números inteiros aleatórios de 0 à 100

			int i = 1;
			for (; i <= 10; i++) {
				System.out.print(i + "ª tentativa. Informe o seu palpite: ");
				int palpite = teclado.nextInt();
				if (palpite > numR) {
					System.out.println("Chutou alto!");
				} else if (palpite < numR) {
					System.out.println("Chutou baixo!");
				} else {
					System.out.println("Acertou!");
					break;
				}
			}
			if (i == 11) {
				System.out.println("Você não conseguiu, tente novamente!");
				System.out.println("O número era: " + numR);
			}
			System.out.println("Realizar uma nova partida?");
			System.out.print("Digite S para continuar ou qualquer tecla para encerrar. ");
			menu = teclado.next();
		}
		System.out.println("Aplicação Encerrada");
		System.out.println("Olá Sandro, brother aceita aí pull Request...");

		teclado.close();
	}

}
