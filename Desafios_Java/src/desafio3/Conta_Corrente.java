package desafio3;

public class Conta_Corrente extends Conta{

	

	public Conta_Corrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("**** Extrato da Conta Corrente ****");
		imprimirDados();
		
	}

	
	
	//private static /*final*/ int SEQUENCIAL = 1;
	//Quase uma condicional, que se declarada a classe Conta_Corrente(), vai adicionar uma unidade ou numero da conta
	//Visão ampla das funções de métodos na linguagem a ponto de criar relações de adição mediante outras ações sem usar o if!

	
	
	


}
