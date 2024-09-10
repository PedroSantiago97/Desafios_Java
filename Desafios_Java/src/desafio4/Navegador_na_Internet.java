package desafio4;

import java.util.Scanner;

public class Navegador_na_Internet {
	Scanner ler = new Scanner(System.in);
	public void exibirPagina() {
		
		int cont = 1;	
		int cont1 = 0;
		while (cont1 == 0) {
			
			System.out.println("Bem vindo ao Golologe");
			System.out.println("1 - Adicionar NovaAba");
			System.out.println("2 - Atualizar a página");
			System.out.println("");
			int opNav = ler.nextInt();
			if (opNav == 1) {
				adicionarNovaAba();
				System.out.println("");
				System.out.println("Você possui "+cont+" paginas abertas");
				System.out.println("");
				cont++;
			}else if(opNav == 2) {
				atualizarPagina();
			}
		}
		
	}
	private void adicionarNovaAba() {
		System.out.println("");
		System.out.println("Aba adicionada");
		System.out.println("");
		
		
		
	}
	private void atualizarPagina() {
		System.out.println("");
		System.out.println("Página Atualizada");
		System.out.println("");
	}
	
	

}
