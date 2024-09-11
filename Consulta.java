package curso11_09_construtores;

public class Consulta {
	private String nomePaciente;
	private String nomeDentista;
	private int data;
	public Consulta() {
	}
	public Consulta(String nomePaciente) {
	this.nomePaciente = nomePaciente;
	}
	public Consulta(int data) {
	this.data = data;
	}
	public Consulta(String nomePaciente, int data) {
	this.nomePaciente = nomePaciente;
	this.data = data;
	}
	public String getNomePaciente() {
	return nomePaciente;
	}
	public void setNomePacientee(String nomePaciente) {
	this.nomePaciente = nomePaciente;
	}
	public String getNomeDentista() {
	return nomeDentista;
	}
	public void setNomeDentista(String nomeDentista) {
	this.nomeDentista = nomeDentista;
	}
	public int getData() {
	return data;
	}
	public void setData (int data) {
	this.data = data;
	}
	}


