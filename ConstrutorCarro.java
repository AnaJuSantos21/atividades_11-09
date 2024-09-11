package curso11_09_construtores;

public class ConstrutorCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		System.out.println("Carro1");
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getnumChassi());
		
		Carro carro2 = new Carro();
		System.out.println("Carro2");
		carro2.setPlaca("hg780");
		carro2.setnumChassi(2745);
		System.out.println(carro2.getPlaca());
		System.out.println(carro2.getnumChassi());
		
		System.out.println("Carro3");
		Carro carro3= new Carro();
		carro3.setPlaca("hg781");
		carro3.setnumChassi(2745);
		System.out.println(carro3.getPlaca());
		System.out.println(carro2.getnumChassi());
		
		Carro carro4= new Carro();
		System.out.println("Carro4");
		carro4.setPlaca("hg782");
		carro4.setnumChassi(2745);
		System.out.println(carro4.getPlaca());
		System.out.println(carro4.getnumChassi());
		}

	}


