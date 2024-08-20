package prjContaBancaria;

public class Conta {

	    private int numeroConta;
	    private String nomeTitular;
	    private double saldo;

	    
	    public Conta(int numeroConta, String nomeTitular, double saldo) {
	        this.numeroConta = numeroConta;
	        this.nomeTitular = nomeTitular;
	        this.saldo = saldo;
	    }

	    
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
	        this.saldo = saldo;
	    }

	    
	    public void depositar(double valor) {
	        if (valor > 0) {
	            saldo += valor;
	            System.out.println("Depósito realizado com sucesso!");
	        } else {
	            System.out.println("O valor de depósito deve ser positivo.");
	        }
	    }

	    public void sacar(double valor) {
	        if (valor > 0) {
	            if (valor <= saldo) {
	                saldo -= valor;
	                System.out.println("Saque realizado com sucesso!");
	            } else {
	                System.out.println("Saldo insuficiente para saque.");
	            }
	        } else {
	            System.out.println("O valor de saque deve ser positivo.");
	        }
	    }

	    public void exibirInformacoes() {
	        System.out.println("Número da Conta: " + numeroConta);
	        System.out.println("Nome do Titular: " + nomeTitular);
	        System.out.println("Saldo: R$ " + saldo);
	    }
	}

