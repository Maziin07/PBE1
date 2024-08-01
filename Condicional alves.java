package programacao_backend;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos minutos você usou? ");
		int minutos = input.nextInt();
		
		double conta = 50.00;
		
		if (minutos > 100) {
			conta+=((minutos - 100) * 2);
		}
		
		System.out.print("O valor da conta é R$" + conta);

	}

}
