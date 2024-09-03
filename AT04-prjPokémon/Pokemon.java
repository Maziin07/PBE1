package prjPokemonV2;

public class Pokemon {
	
	//Atributos
	
		private String nome;
		private String tipo;
		private double nivel;
		private int hp;
		private int defesa;
		
		//Construtores
		
		public Pokemon() {
		}
		
		public Pokemon(String parametroNome, String parametroTipo, double parametroNivel, int parametroHP, int parametroDefesa){
			this.nome= parametroNome;
			this.tipo = parametroTipo;
			this.nivel = parametroNivel;
			this.hp = parametroHP;
			this.defesa = parametroDefesa;
			
		}
		
		//Metodos Setters
		public void getNome () {
			return nome;
		}
		
		public void setNome (String nome) {
			this.nome = nome;
		}
		
		public void getTipo () {
			return tipo;
		}
		
		public void setTipo (String tipo {
			this.tipo = tipo;
		}
		
		public void getNivel () {
			return nivel;
		}
		
		public void setNivel (double nivel) {
			this.nivel = nivel;
		}
		
		public void getHP () {
			return hp;
		}
		
		public void setHP (int hp) {
			this.hp = hp;
		}
		
		public void getDefesa () {
			return defesa;
		}
		
		public void setDefesa (int defesa) {
			this.defesa = defesa;
		}
		
		
		
		//Metodos
		
		public void atacar() {
			System.out.println(this.nome + "usou um ataque!");
		}
		
		public void evoluir() {
			System.out.println(this.nome + "evoluiu!");
		}
		
		public void exibirinfo() {
			System.out.println("Nome: " + this.nome);
			System.out.println("Tipo: " + this.tipo);
			System.out.println("Nivel: " + this.nivel);
			System.out.println("HP: " + this.hp);
			System.out.println("Defesa: " + this.defesa);
		}
		
		
}