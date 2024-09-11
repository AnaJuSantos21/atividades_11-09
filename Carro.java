package curso11_09_construtores;

public class Carro {
	private String placa;
	private int numChassi;
	public Carro() {
	}
	//********** Construtor 1 ***************//
	public Carro(String placa) {
	this.placa= placa;
	}
	//***********Construtor 2***************//
	public Carro(String placa, int numChassi) {
	this.placa= placa;
	this.numChassi=numChassi;
	}
	///**************Construtor 3********//
	public Carro(int numChassi) {
	this.numChassi= numChassi;
	}
	public String getPlaca() {
	return placa;
	}
	public void setPlaca(String placa) {
	this.placa = placa;
	}
	public int getnumChassi() {
	return numChassi;
	}
	public void setnumChassi(int numChassi) {
	this.numChassi = numChassi;
	}

}
