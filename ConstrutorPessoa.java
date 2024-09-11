package curso11_09_construtores;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		Pessoa jogador1 = new Pessoa();
		
		jogador1.setNome("Ana");
		jogador1.setIdade(17);
		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getIdade());

		
		
		Pessoa jogador2 = new Pessoa("Messi" , 36);
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		
		//construtor com 1 argumento
		
		Pessoa jogador3 = new Pessoa("Lucas");
		System.out.println(jogador3.getNome());
		
		Pessoa jogador4 = new Pessoa(22);
		
		System.out.println(jogador4.getIdade());
		
		

	}
	

}
