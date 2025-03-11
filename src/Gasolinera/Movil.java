package Gasolinera;

public class Movil implements Carga {

//	----- ATRIBUTOS -----
	private String codigo;
	private int tiempoCarga;
	private boolean cargado;
	
//	----- CONSTRUCTORES -----
	public Movil () {
		
	}
	public Movil (String codigo, int tiempoCarga, boolean cargado) {
		this.codigo = codigo;
		this.tiempoCarga = tiempoCarga;
		this.cargado = cargado;
	}
	
//	----- GETTERS SETTERS -----
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public int getTiempoCarga() {
		return tiempoCarga;
	}
	public void setTiempoCarga(int tiempoCarga) {
		this.tiempoCarga = tiempoCarga;
	}
	
	public boolean isCargado() {
		return cargado;
	}
	public void setCargado(boolean cargado) {
		this.cargado = cargado;
	}
	
//	----- METODOS -----
	@Override
	public void cargar() {

		
		
	}
	
}
