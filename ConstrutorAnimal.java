package curso11_09_construtores;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal ("preto", 30);

		Animal animal2 = new Animal ("preto");
		Animal animal3 = new Animal (30);

		System.out.println(animal.getCor());

		System.out.println(animal.getTamanho());

		System.out.println(animal2.getCor());

		System.out.println(animal3.getTamanho());

		}

	}


