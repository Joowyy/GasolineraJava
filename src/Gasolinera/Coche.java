package Gasolinera;

public abstract class Coche {

//	----- ATRIBUTOS -----
	protected String matricula;
	protected String modelo;
	
//	----- CONSTRUCTORES -----
	public Coche () {
		
	}
	public Coche (String matricula, String modelo) {
		this.matricula = matricula;
		this.modelo = modelo;
	}
	
//	----- GETTERS SETTERS -----
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
//	----- METODOS -----
	public abstract void mostrarCoche();
	
}
