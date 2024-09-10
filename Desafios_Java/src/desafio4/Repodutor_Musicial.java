package desafio4;
import java.util.Scanner;

public class Repodutor_Musicial {
	Scanner ler = new Scanner(System.in);
	public void layoutPlayer() {		
			System.out.println("");
			System.out.println("        Bem vindo ao Ithunes !!");
			System.out.println("");
			int opAux = 0;
			System.out.println("          Tocando Xhico Moedaix ");
			while(opAux == 0) {
				    System.out.println("");
				    System.out.println("-----------------------------iThunes---------------------------");
				    System.out.println("---------------------------------------------------------------");
				    System.out.println("-----------3->Sair----1->Play/0->Pause----2->Lista de Musicas--");
				    System.out.println("---------------------------------------------------------------");
				    System.out.println("");
				    						    
					int opMsc = ler.nextInt();
					if (opMsc == 1) {
						tocar();
					}else if(opMsc == 0) {
						pause();
					}else if(opMsc == 2) {
						escolherMusica();								
					}else if (opMsc == 3) {
						System.out.println("Obrigado por usar o Ithunes, até breve!");
						break;
					}else {
						System.out.println("Digite uma Opção válida");
					}
					
			}
		}

		private void pause() {
			System.out.println("Musica Pausada");
		
		
		}

		private void tocar() {
			System.out.println("Tocando música ");
				
			}		
		private void escolherMusica() {
			
			
				System.out.println("Lista de músicas");
				System.out.println("1 - Rebolation");
				System.out.println("2 - Rock");
				System.out.println("3 - Samba");
				System.out.println("4 - Pagode");
				System.out.println("5 - Gospel");
				System.out.println("6 - Xhico Moedaix");
				System.out.println("Escolha uma música: ");
				int mscOp = ler.nextInt();
				if (mscOp == 1) {					
					Lista_de_Musicas lM = Lista_de_Musicas.LISTA_MUSICA;
					System.out.println("Tocando: "+lM.getMusica1());
				}else if (mscOp == 2) {
					Lista_de_Musicas lM = Lista_de_Musicas.LISTA_MUSICA;
					System.out.println("Tocando: "+lM.getMusica2());
				}else if (mscOp == 3) {
					Lista_de_Musicas lM = Lista_de_Musicas.LISTA_MUSICA;
					System.out.println("Tocando: "+lM.getMusica3());
				}else if (mscOp == 4) {
					Lista_de_Musicas lM = Lista_de_Musicas.LISTA_MUSICA;
					System.out.println("Tocando: "+lM.getMusica4());
				}else if (mscOp == 5) {
					Lista_de_Musicas lM = Lista_de_Musicas.LISTA_MUSICA;
					System.out.println("Tocando: "+lM.getMusica5());
				}else if (mscOp == 6) {
					Lista_de_Musicas lM = Lista_de_Musicas.LISTA_MUSICA;
					System.out.println("Tocando: "+lM.getMusica6());
				}

			}
				
		}

							
	
			

	

