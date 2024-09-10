package desafio3;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite o nome do Cliente 1: ");
			String clientecad1 = scan.nextLine();
			Cliente cliente1 = new Cliente();
			cliente1.setNome(clientecad1);
			Conta poupanca1 = new Conta_Poupanca(cliente1);
			Conta cc1 = new Conta_Corrente(cliente1);
			
			
			
			System.out.println("Digite o nome do cliente 2");		
			String clientecad2 = scan.nextLine();
			Cliente cliente2 = new Cliente();
			cliente2.setNome(clientecad2);
			Conta poupanca2 = new Conta_Poupanca(cliente2);
			//Conta cc2 = new Conta_Corrente(cliente2);
			
			System.out.println("Digite o nome do cliente 3");		
			String clientecad3 = scan.nextLine();
			Cliente cliente3 = new Cliente();
			cliente3.setNome(clientecad3);
			Conta poupanca3 = new Conta_Poupanca(cliente3);
			//Conta cc3 = new Conta_Corrente(cliente3);
			
			//Ao imprimir um Objeto, ele será referenciado entre os outros pela sua posição
			//Em que foi instanciado
			
			poupanca1.imprimirExtrato();
			cc1.imprimirExtrato();
			
			System.out.println("                 *** Bem vindo ao Banco PAN-E ***");
			System.out.println("Para realizar alguma Operação digite o Código respectivo e clique ENTER ");
			
			int cont = 0;
			while (cont == 0) {
			
				System.out.println("");
				System.out.println("                          Menu Interativo");
				System.out.println("       1 - Depósito");
				System.out.println("       2 - Saque");
				System.out.println("       3 - Transferencia");
				System.out.println("       4 - Encerrar Operações");
				System.out.println("");
				int op = scan.nextInt();
				if(op == 3) {
					System.out.println("");
					System.out.println("                 Escolha para quem irá Redirecionar a Operação");
					System.out.println("   1 - "+cliente2.getNome());
					System.out.println("   2 - "+cliente3.getNome());
					System.out.println("");
					int opCl = scan.nextInt();
					if (opCl == 1) {
						System.out.println("Digite o valor: ");
						double valDep = scan.nextDouble();
						if (valDep>poupanca1.saldo) {
							System.out.println("");
							System.out.println("Saldo Insuficiente");
							System.out.println("");
						}
						
						poupanca1.transferencia(valDep, poupanca2);
						poupanca1.imprimirExtrato();
						cc1.imprimirExtrato();
					}else {
						System.out.println("Digite o valor: ");
						double valDep = scan.nextDouble();
						poupanca1.transferencia(valDep, poupanca3);
						poupanca1.imprimirExtrato();
						cc1.imprimirExtrato();
						
					}
					}else if(op == 1) {
						System.out.println("Digite o valor a ser Depositado: ");
						double valDep = scan.nextDouble();
						poupanca1.deposito(valDep);
						poupanca1.imprimirExtrato();
						cc1.imprimirExtrato();
					}else if (op == 2) {
						System.out.println("Digite o valor de Saque: ");
						double valDep = scan.nextDouble();
						poupanca1.saque(valDep);
						poupanca1.imprimirExtrato();
						cc1.imprimirExtrato();
					}else if (op == 4) {
						System.out.println("O banco PAN-E agradece o seu acesso !");
					}
			} 
			
			
		}
					}

}
