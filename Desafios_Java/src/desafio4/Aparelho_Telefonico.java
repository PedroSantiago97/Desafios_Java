package desafio4;

import java.util.Scanner;



public class Aparelho_Telefonico {
	
	/*ligar, atender, iniciarCorrerioVoz*/
	public void ligar() throws InterruptedException {		
		try (Scanner ler = new Scanner(System.in)) {
			int delayMillis = 1000;
			System.out.printf("Digite o número do telefone: ");
			int numLig = ler.nextInt();
			System.out.printf("Chamando.");
			Thread.sleep(delayMillis);
			System.out.printf(".");
			Thread.sleep(delayMillis);
			System.out.println(".");
			Thread.sleep(delayMillis);
			System.out.println("O número "+ numLig+ " Atendeu! ");
		}	
	}
	public void atender() throws InterruptedException {
		try (Scanner ler = new Scanner(System.in)){
			int delayMillis = 3000;
			System.out.println("O numero (XX) XXXXX-XXXX está ligando para você!");
			System.out.println("Deseja atender? ");
			System.out.println("Se sim digite 1, se quer desligar a chamada digite qualquer outra tecla: ");
			int numLig = ler.nextInt();
			if (numLig == 1) {
				System.out.println("Ligação atendida diga Alô!");
				Thread.sleep(delayMillis);
				System.out.println("Ligaação Muda");
				System.out.println("Chamada encerrada!");
			}else {
				System.out.println("Chamada encerrada!");
			}
		}
		
	}
	public void correioVoz() throws InterruptedException{
		try (Scanner ler = new Scanner(System.in)){
			System.out.println("Correio de voz iniciado!");
			int numCorAux = 0;
			while (numCorAux != 3) {
				int delayMillis = 5000;
				int qtMsg = 5;
				System.out.println("Para ouvir suas mensagens digite 1");
				System.out.println("Para sair do correio de voz digite 2");
				int numCor = ler.nextInt();
				if (numCor == 1) {			
					for(int Msgs = 1;Msgs!=qtMsg+1;Msgs++) {
						System.out.println("Transmitindo a sua "+Msgs+"º mensagem!");
						Thread.sleep(delayMillis);	
						System.out.println("Gostaria de ouvir a proxima? [1 = Sim / 2 = Não]");
						int tomadaDecisão1 = ler.nextInt();
						if (tomadaDecisão1 == 2) {
							break;
						}
						if (Msgs == qtMsg) {
							System.out.println("Você ouviu todas as suas mensagens");
						}							
					}					
				}else {
					System.out.println("Até breve!");
					break;
				}
				
			}
			
		}
	}
	


}
