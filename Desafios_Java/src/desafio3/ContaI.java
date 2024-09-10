package desafio3;

public interface ContaI {
	 void saque(double valor);
	 void deposito(double valor);
	 void transferencia(double valor, Conta contadestino);
	 void imprimirExtrato();
	
	

}
// uma Cautela referente a Interface, pois se o parametro de algum desses métodos acima for alterado,
//tera que alterar em todas as classes em que a minha interface for acionada