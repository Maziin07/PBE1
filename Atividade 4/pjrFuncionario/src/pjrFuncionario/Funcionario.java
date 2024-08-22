package pjrFuncionario;

public class Funcionario {

		//Atributos
	    String nome;
	    Double salarioBruto;
	    Double imposto;
	    String salarioliquido;
	    
	    //Construtores
	    Funcionario(){
	    	
	    }
	    Funcionario(String nome, Double salarioBruto, Double imposto){
	    	
	    }
	    
	    //Getters e Setters
	    public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Double getSalarioBruto() {
			return salarioBruto;
		}
		public void setsalarioBruto(Double salarioBruto) {
			this.salarioBruto = salarioBruto;
		}
		public double getImposto() {
			return imposto;
		}
		public void setImposto(double imposto) {
			this.imposto = imposto;
			}
		
		//Métodos
		void calcularsalarioliquido() {
			salarioBruto -= imposto;
		}
		void aumentarsalario(double percentual) {
			salarioBruto += percentual;
		}
		void status() {
			  System.out.println("Nome: " + this.nome);
			  System.out.println("Salário Bruto: " + this.salarioBruto);
			  System.out.println("Imposto: " + this.imposto);
			  System.out.println("Salário Líquido: " + salarioliquido);
		}
	}
	
