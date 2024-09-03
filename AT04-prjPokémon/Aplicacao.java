package prjPokemonV2;

public class Aplicacao {

	public static void main(String[] args) {
			
		Pokemon squirtle = new Pokemon();
		squirtle.nome = "Squirtle";
		squirtle.tipo = "Água";
		squirtle.nivel = "Macho";
		squirtle.hp = 100;
		
		Pokemon gyarados = new Pokemon();
		gyarados.nome = "Gyarados";
		gyarados.tipo = "Água";
		gyarados.nivel = "Macho";
		gyarados.hp = 100;
		
		Pokemon charmander = new Pokemon();
		charmander.nome = "Torchic";
		charmander.tipo = "Fogo";
		charmander.nivel = "Macho";
		charmander.hp = 100;
		
		Pokemon arcanine = new Pokemon();
		arcanine.nome = "Arcanine";
		arcanine.tipo = "Fogo";
		arcanine.nivel = "Femea";
		arcanine.hp = 100;
		
		Pokemon pidgeot = new Pokemon();
		pidgeot.nome = "Pidgeot";
		pidgeot.tipo = "Voador";
		pidgeot.nivel = "Macho";
		pidgeot.hp = 100;
		
		Pokemon talonflame = new Pokemon();
		talonflame.nome = "Talonflame";
		talonflame.tipo = "Voador";
		talonflame.nivel = "Macho";
		talonflame.hp = 100;
		
		squirtle.exibirinfo();
		squirtle.metodoAtacar();
		squirtle.metodoEvoluir();
		squirtle.metodoAquatico();
		
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