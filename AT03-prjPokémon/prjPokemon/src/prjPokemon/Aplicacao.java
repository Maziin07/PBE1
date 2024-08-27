package prjPokemon;

public class Aplicacao {

	public static void main(String[] args) {
			
		Pokemon torchic = new Pokemon();
		torchic.atributoNome = "Torchic";
		torchic.atributoTipo = "Fogo";
		torchic.atributoNivel = "Macho";
		torchic.atributoHP = 100;
		
		Pokemon litten = new Pokemon();
		litten.atributoNome = "Litten";
		litten.atributoTipo = "Fogo";
		litten.atributoNivel = "Femea";
		litten.atributoHP = 100;
		
		Pokemon charmander = new Pokemon();
		charmander.atributoNome = "Torchic";
		charmander.atributoTipo = "Fogo";
		charmander.atributoNivel = "Macho";
		charmander.atributoHP = 100;
		
		Pokemon cyndaquil = new Pokemon();
		cyndaquil.atributoNome = "Cyndaquil";
		cyndaquil.atributoTipo = "Fogo";
		cyndaquil.atributoNivel = "Femea";
		cyndaquil.atributoHP = 100;
		
		Pokemon scorbunny = new Pokemon();
		scorbunny.atributoNome = "Scorbunny";
		scorbunny.atributoTipo = "Fogo";
		scorbunny.atributoNivel = "Macho";
		scorbunny.atributoHP = 100;
		
		torchic.exibirinfo();
		torchic.metodoAtacar();
		torchic.metodoEvoluir();
		
		litten.exibirinfo();
		litten.metodoAtacar();
		litten.metodoEvoluir();
		
		charmander.exibirinfo();
		charmander.metodoAtacar();
		charmander.metodoEvoluir();
		
		cyndaquil.exibirinfo();
		cyndaquil.metodoAtacar();
		cyndaquil.metodoEvoluir();
		
		scorbunny.exibirinfo();
		scorbunny.metodoAtacar();
		scorbunny.metodoEvoluir();
		
	}

}
