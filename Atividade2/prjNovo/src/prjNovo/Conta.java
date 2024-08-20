package prjNovo;

public class Conta {
	
	//Atributos
	
	private int numeroConta;
	private String nomeTitular;
	private double saldoConta;
	
	//Construtores
	
	public Conta() {
	}
	
	public Conta(int numeroConta, String nomeTitular, double saldoConta) {
	} 
	
	public Conta(int numeroConta, String nomeTitular) {
	} 
	
	{
	  this.numeroConta = numeroConta;
	  this.nomeTitular = nomeTitular;
	  this.saldoConta = 0;
	}
	
	// Getters and Setters
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

}
