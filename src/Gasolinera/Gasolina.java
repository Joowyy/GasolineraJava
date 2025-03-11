package Gasolinera;

public class Gasolina extends Coche {

//	----- ATRIBUTOS -----
	private int deposito;
	private boolean lleno = false;
	
//	----- CONSTRUCTORES -----
	public Gasolina () {
		
	}
	public Gasolina(String matricula, String modelo, int deposito, boolean lleno) {
		super(matricula, modelo);
		this.deposito = deposito;
		this.lleno = lleno;
	}
	
//	----- GETTERS SETTERS -----
	public int getDeposito() {
		return deposito;
	}
	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}
	
	public boolean isLleno() {
		return lleno;
	}
	public void setLleno(boolean lleno) {
		this.lleno = lleno;
	}
	
//	----- METODOS -----
	@Override
	public void mostrarCoche() {

	}
}
