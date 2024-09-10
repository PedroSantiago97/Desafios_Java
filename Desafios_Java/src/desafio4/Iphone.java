package desafio4;

import java.util.Scanner;

public class Iphone {
	// Instanciar valores mais de uma vez na classe em métodos diferentes pode ocasionar Erro
	public static void main(String[] args)  throws InterruptedException{
		Scanner ler = new Scanner(System.in);
		Aparelho_Telefonico appAT = new Aparelho_Telefonico();
		Repodutor_Musicial appRM = new Repodutor_Musicial();
		Navegador_na_Internet appNV = new Navegador_na_Internet();
		System.out.println("Bem vindo ao iPhone");
		System.out.println("Marque a Opção que des"
				+ "eja e aperte Enter para ultilizar");
		
		int cont9 = 0;
		while (cont9 == 0) {
			System.out.println("1 - Aparelho telefônico");
			System.out.println("2 - Reprodutor musical");
			System.out.println("3 - Navegador na internet");
			System.out.println("4 - Desligar o aparelho");
			int opPhone = ler.nextInt();
			if (opPhone == 1) {
				appAT.ligar();
				appAT.correioVoz();
			} else if (opPhone == 2) {
				appRM.layoutPlayer();
			}else if (opPhone == 3) {
				appNV.exibirPagina();
			}else if(opPhone == 4){
				appAT.atender();
				System.out.println("Reinicie o aparelho(Alt+Shift+X) para selecionar o iphone");
				break;
			}
			
		}
		//appAT.atender();
		//appNV.exibirPagina();
		//appRM.layoutPlayer();
		//appAT.atender();
		
		ler.close();
		
	
	}
	

}
