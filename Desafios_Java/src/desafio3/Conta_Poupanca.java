package desafio3;

public class Conta_Poupanca extends Conta{

	public Conta_Poupanca(Cliente cliente) {
		super(cliente);
	
	}

	public void imprimirExtrato() {
		System.out.println("**** Extrato da Conta Poupança ****");
		imprimirDados();
		
	}

}
