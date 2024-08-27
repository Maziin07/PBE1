package prjZoologico;

public class ClasseAnimal {
	
	//Atributos
	
	String atributoNome;
	String atributoRaca;
	String atributoSexo;
	double atributoPeso;
	
	//Construtores
	
	public ClasseAnimal() {
	}
	
	public ClasseAnimal(String parametroNome, String parametroRaca, String parametroSexo, double parametroPeso){
		this.atributoNome = parametroNome;
		this.atributoRaca = parametroRaca;
		this.atributoSexo = parametroSexo;
		this.atributoPeso = parametroPeso;
		
	}
	
	//Metodos
	
	public void metodoComer() {
		
		if (this.atributoPeso >= 170) {
			System.out.println(this.atributoNome + " está obeso, vamos exercitar!!!");
		}
		
		else {
			this.atributoPeso += 10;
		}
	}
	
	public void metodoExercitar() {
		
		if (this.atributoPeso <= 50) {
			System.out.println(this.atributoNome+ " está magro demais, vamos comer!!!");
		}
		
		else {
			this.atributoPeso -= 10;
		}
	}
	
	
	public void exibirinfo() {
	    	
		    System.out.println("Nome: " + this.atributoNome);
	    	System.out.println("Peso: " + this.atributoPeso);
	        
	    }
}
