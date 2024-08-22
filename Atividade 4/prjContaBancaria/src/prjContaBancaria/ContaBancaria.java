package prjContaBancaria;

public class ContaBancaria {

	//Atributos
    int numeroConta;
    String nomeTitular;
    double saldo;
    
    //Construtores
    ContaBancaria(){
    	
    }
    ContaBancaria(int numeroConta, String nomeTitular, double saldo){
    	this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
		}
        //Getters e Setters
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
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if(saldo <= 0){
			this.saldo = 0;
		}
		else {
		    this.saldo = saldo;
		}
		}
    //Métodos
    void depositar(double valor) {
    	saldo += valor;
    }
    void sacar(double valor) {
    	if(saldo > 0) {
    		saldo -= valor;
    	}
    	else {
    		System.out.println("O saldo é insuficiente");
    	}
    }
    void status() {
    	  System.out.println("Número da Conta: " + this.numeroConta);
		  System.out.println("Nome do Titular: " + this.nomeTitular);
		  System.out.println("Saldo: " + this.saldo);
    }
}
	
