package prjContaBancaria;

import java.util.Scanner;

public class Conta1 {
    public Conta1(int numeroConta, String nomeTitular, double saldo) {
		
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Qual o número da conta? ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Qual o nome do titular? ");
        String nomeTitular = sc.nextLine();
        System.out.println("Qual o saldo da conta? ");
        double saldo = sc.nextDouble();

        
        Conta1 conta = new Conta1(numeroConta, nomeTitular, saldo);

        
        conta.exibirInformacoes();

  
        System.out.println("Quer depositar ou sacar o saldo? \n 1) Depositar \n 2) Sacar\n 3) Não desejo fazer nada");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Quanto você deseja depositar? ");
            double deposito = sc.nextDouble();
            conta.depositar(deposito);
        } else if (opcao == 2) {
            System.out.println("Quanto você deseja sacar? ");
            double saque = sc.nextDouble();
            conta.sacar(saque);
        } else if (opcao == 3) {
            System.out.println("Então terminamos por aqui.");
        } else {
            System.out.println("Opção Inválida.");
        }

        
        conta.exibirInformacoes();

        sc.close();
    }

	private void sacar(double saque) {
		
		
	}

	private void depositar(double deposito) {
		
		
	}

	private void exibirInformacoes() {
		
		
	}
}
