package pjrLivro;

public class Livro {

		//Atributos
		private String titulo;
		private String autor;
		private int numeroPaginas;
		private boolean disponivel;
		
		//Construtores
		public Livro(){
			this.disponivel = true;
		}
		
		public Livro(String titulo, String autor, int numeroPaginas, boolean disponivel){
			this.titulo = titulo;
			this.autor = autor;
			this.numeroPaginas = numeroPaginas;
			this.disponivel = true;
		}
		
		//Getters e Setters
		 public String getTitulo() {
				return titulo;
			}
			public void setTitulo(String titulo) {
				this.titulo = titulo;
			}
			public String getAutor() {
				return autor;
			}
			public void setAutor(String autor) {
				this.autor = autor;
			}
			public int getNumeroPaginas() {
				return numeroPaginas;
			}
			public void setNumeroPaginas(int numeroPaginas) {
				this.numeroPaginas = numeroPaginas;
				}
			public boolean getDisponivel() {
				return disponivel;
			}
			public void setDisponivel(boolean Disponivel) {
				this.disponivel = true;
			}
			
		//Métodos
			void emprestar() {
		    	if(disponivel == true) {
		    		disponivel = false;
		    		System.out.println("Livro emprestado com sucesso.");
		    	}
		    	else {
		    		System.out.println("O livro não está disponível no momento.");
		    	}
		    }
		    void devolver() {
		    	if(disponivel = false){
		    		disponivel = true;
		    		System.out.println("O livro está disponível.");
		    	}
		    	
		    }
		    void status() {
		    	  System.out.println("Título: " + this.titulo);
				  System.out.println("Autor: " + this.autor);
				  System.out.println("Número de Páginas: " + this.numeroPaginas);
				  System.out.println("Disponível: " + this.disponivel);
		    }
			
	}
