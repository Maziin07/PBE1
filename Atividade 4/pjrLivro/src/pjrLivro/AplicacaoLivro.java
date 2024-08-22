package pjrLivro;

import java.util.Scanner;

public class AplicacaoLivro {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			//Definição dos Livros
			Livro livro01 = new Livro("Game of Thrones", "George R. Martin", 496, true);
			
			Livro livro02 = new Livro();
			
			//Definindo Características do Livro
			System.out.println("Qual o título do livro? ");
			livro02.setTitulo(sc.next());
			System.out.println("Qual o autor do livro? ");
			livro02.setAutor(sc.next());
			System.out.println("Quantas páginas tem o livro? ");
			livro02.setNumeroPaginas(sc.nextInt());
			
			//Escolha do livro
			
			System.out.println("Qual livro deseja adquirir?\n 1) Game of Thrones - George R. Martin - 496 páginas \n 2) " + livro02.getTitulo() + " - " + livro02.getAutor() + " - " + livro02.getNumeroPaginas());
			int opcao = sc.nextInt();
			
			if(opcao == 1) {
				System.out.println("Contamos com sua responsabilidade com o livro.");
			}
			else if(opcao == 2) {
				System.out.println("Contamos com sua responsabilidade com o livro");
			}
			else {
				System.out.println("Não tem este possível livro no catálogo.");
			}
			

		}

	}
	

