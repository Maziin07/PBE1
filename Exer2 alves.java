package programacao_backend;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Olá! Aqui você poderá saber a área de um círculo.");
		System.out.print("Insira o raio do círculo (em centímetros): ");
		int raio = input.nextInt();

		double pi = 3.14159;
		
		double area = pi * Math.pow(raio, 2);
		
		System.out.printf("A área do seu círculo é: %.4f", area);
		
		input.close();
	}

}
