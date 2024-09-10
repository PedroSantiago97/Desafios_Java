package desafio3;
import java.util.Scanner;
public abstract class Conta implements ContaI{
	Scanner scan = new Scanner(System.in);
	
	protected static final int AGENCIA_PADRÃO = 0;
	//PR "final" retirado, pois a constante SEQUENCIAL será alterada mediante a criação de outra conta diferente de AGENCIA_PADRÃO
	//A PR "final" deixa a constante Imutável
	protected static  int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int conta;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	
	//A palavra reservada Implements chama a implementação da Interface: ContaI
	//Agora, a classe Conta precisa ter os métodos declarados na Interface e seus respectivos parÂmetros
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRÃO;
		this.numero = Conta.SEQUENCIAL++;
		this.cliente = cliente;
	}
	//Método construtor criado para criação de uma conta
	
	
	
	public void saque(double valor) {
		saldo -= valor; 
		
	}
	
	public void deposito(double valor) {
		saldo += valor;
		
	}
	public void transferencia(double valor, Conta contadestino) {
		this.saque(valor);
		//THIS: usado para referenciar uma instância da propria classe
		contadestino.deposito(valor);
		//O motivo pelo qual o método transferencia() não utiliza this em contadestino.deposito(valor)
		//é porque contadestino é um parâmetro do método, não um membro da classe.
		
	}
	
	//De forma coordenada, os métodos saque(); e deposito(); são chamados em outro método dentro da mesma classe
	//Um jeito prático de nao repetir código e manter a ordem 
	protected void imprimirDados() {
		System.out.println(String.format("Titular: %s"	, this.cliente.getNome()));
		//Se atentar para o padrão GETSET !!!!
		//No que se refere ao cadastro, preciso Setar o nome do Cliente
		//Para assim entao Getar no lugar selecionado !!!!!
		//Nesse caso o lugar selecionado é a Classe Abstrata que por sua vez vai 
		//Soltar o nome Setado Pelo Cliente na Classe Main
		System.out.println(String.format("Agência: %d"	, this.agencia));
		System.out.println(String.format("Número: %d"	, this.numero));
		System.out.println(String.format("Saldo: %.2f"	, this.saldo));
	}
	
	
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getConta() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	
	}
	
	public void captarCl1(String cliente) {
		System.out.println("Digite o seu nome: ");	
		String clientecad1 = scan.nextLine();
		Cliente cliente1 = new Cliente();
		cliente1.setNome(clientecad1);
		//Conta poupanca1 = new Conta_Poupanca(cliente1);
		//Conta cc1 = new Conta_Corrente(cliente1);
	}
	

}
