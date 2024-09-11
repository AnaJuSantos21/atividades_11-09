package curso11_09_construtores;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		Consulta consulta = new Consulta("Barbara" , 30);
		
		Consulta consulta2 = new Consulta("Miguel");

		Consulta consulta3 = new Consulta(15);

		System.out.println(consulta.getNomePaciente());

		System.out.println(consulta.getData());

		System.out.println(consulta2.getNomeDentista());

		System.out.println(consulta3.getData());


	}

}
