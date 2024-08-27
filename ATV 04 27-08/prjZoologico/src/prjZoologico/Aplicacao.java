package prjZoologico;

public class Aplicacao {

	public static void main(String[] args) {
		
		ClasseAnimal elefante = new ClasseAnimal();
		elefante.atributoNome = "Dumbo";
		elefante.atributoRaca = "Africano";
		elefante.atributoSexo = "Macho";
		elefante.atributoPeso = 170;
		
		ClasseAnimal girafa = new ClasseAnimal("GitHub" , "Russa", "Femea", 50);
		
		SubclasseCarnivoros leao = new SubclasseCarnivoros();
		leao.atributoNome = "Leaodro";
		leao.atributoRaca ="Australeandro";
		leao.atributoSexo = "Neutro";
		leao.atributoPeso = 123;
		
		leao.exibirinfo();
		leao.metodoCacar();
		
		elefante.exibirinfo();
		
		elefante.metodoComer();
		
        elefante.metodoExercitar();
		
        girafa.exibirinfo();
		
	}

}
