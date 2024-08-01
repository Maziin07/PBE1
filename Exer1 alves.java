package programacao_backend;

import java.util.Scanner;

public class Exer1{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um primeiro número: ");
		int num1 = input.nextInt();
		
		System.out.print("Insira um segundo número: ");
		int num2 = input.nextInt();
		
		System.out.println("A soma do 1º número com o 2º número: " + (num1 + num2));
		
		input.close();
	}

}
