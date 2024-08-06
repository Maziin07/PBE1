package prjCaneta;

import java.util.Scanner;

public class Livro {
     
	String nomeLivro;
	String nomeAutor;
	boolean alugado;
	
	
	public Livro (String nomeLivro, String nomeAutor) {
		this.nomeLivro = nomeLivro;
		this.nomeAutor = nomeAutor;
		this.alugado = false;
	}
	
	void status() {
		System.out.println("Nome do Livro: " + this.nomeLivro + ": " + (this.alugado ? "Alugado":"Disponivel"));
	}
	
	void alugar() {
		this.alugado = true;
	}
	
	void devolver() {
		this.alugado = false;
	}
		 
	}

