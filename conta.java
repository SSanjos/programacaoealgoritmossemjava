package cursoLetsCode;
//Exemplo simples, mas poderoso, aborda algumas operações financeiras elementares de um correntista em um Banco qualquer. 

import java.util.Scanner;

public class conta {
	
	public static void main(String[] args) {
		
		int opcao;
		double saldo = 0.0;
		double valor = 0.0;
		double investimento = 0.0;
		boolean encerrarPrograma = false;
		
		Scanner teclado = new Scanner(System.in);
		
		while(encerrarPrograma == false) {			
			
			opcao = mostrarMenu(teclado);
				
		switch (opcao) {		
		
		case 1:
			System.out.printf("Saldo da Conta %.2f: \n", saldo );
			if(investimento > 0.0) {
			System.out.printf("Saldo do Investimento %.2f: \n", investimento);
			}
			break;
		
		case 2:
			System.out.print("Informe o valor do depósito: ");
			valor = teclado.nextDouble();
			
			saldo += valor;
			System.out.println("Depósito efetuado!");
			break;
			
		case 3:
			if(saldo <=0.0) {
			System.out.println("Você não possui valor disponível para saque!");
			break;
			} else {
			System.out.println("Informe o valor do saque: ");
			valor = teclado.nextDouble();
			if(valor > saldo) {
				System.out.println("Saque não permitido, saldo insuficiente!");
			} else {
				System.out.println("Saque efetuado!");
				saldo -= valor;
			}
			}
			break;
			
		case 4:
			if(saldo > 0.0) {
			System.out.print("Informe o valor a ser investido: ");
			valor = teclado.nextDouble();			
			if(valor > saldo) {
				System.out.println("Saldo insuficiente!");
			} else			
			saldo -= valor;
			investimento += valor;
			System.out.println("Investimento efetuado!");
			break;
			} else
				System.out.println("Você não possui valor disponível para investimento!");
			break;
			
		case 5:
			if(investimento <=0.0) {
			System.out.println("Você não possui valor investido!");	
			break;
			} else {			
			System.out.println("Informe o valor do resgate: ");
			valor = teclado.nextDouble();
			}
			if(valor > investimento) {
				System.out.println("Resgate não permitido, saldo insuficiente!");				
			} else {
				System.out.println("Resgate efetuado!");
				investimento -= valor;
				saldo += valor;
			}
			break;
		case 6:
			encerrarPrograma = true;
			break;
		
		default:
			System.out.println("Opção inválida, tente novamente!");			
		}				
			
		}	
		teclado.close();
		System.out.println("Programa Encerrado");	
		
	}

	private static int mostrarMenu(Scanner teclado) {
		
		int opcao;
		System.out.println();
		System.out.println("MENU DE OPÇÕES");
		System.out.println("[1] Mostrar Saldo");
		System.out.println("[2] Efetuar Depósito");
		System.out.println("[3] Efetuar Saque");
		System.out.println("[4] Efetuar Investimento");
		System.out.println("[5] Efetuar Resgate do Investimento");
		System.out.println("[6] Finalizar");
		System.out.print("Digite a opção: ");
		opcao = teclado.nextInt();		
		return opcao;
		
	}
	
}
