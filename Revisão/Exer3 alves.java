package programacao_backend;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira o número do funcionário: ");
		int numid = input.nextInt();
		
		System.out.print("Horas semanais que o funcionário trabalhou: ");
		int horas = input.nextInt();
		
		System.out.print("O valor da hora do funcionário: ");
		double valor = input.nextInt();
		
		double salario = horas * valor * 4;
		
		System.out.printf("O salário do funcionário %d é de R$%.2f por mês.", numid, salario);
		
		input.close();

	}

}
