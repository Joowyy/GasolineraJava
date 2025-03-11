package Gasolinera;

public class Electrico extends Coche {

//	----- ATRIBUTOS -----
	private int capacidadBateria;
	private boolean cargado = false;
	
//	----- CONSTRUCTORES -----
	public Electrico () {
		
	}
	public Electrico (String matricula, String modelo, int capacidadBateria, boolean cargado) {
		super(matricula, modelo);
		this.capacidadBateria = capacidadBateria;
		this.cargado = cargado;
	}
//	----- GETTERS SETTERS -----
	public int getCapacidadBateria() {
		return capacidadBateria;
	}
	public void setCapacidadBateria(int capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}
	
	public boolean isCargado() {
		return cargado;
	}
	public void setCargado(boolean cargado) {
		this.cargado = cargado;
	}
	
//	----- METODOS -----
	@Override
	public void mostrarCoche() {

		System.out.println("\n==========================");		
		System.out.println("Matricula -> " + matricula);
		System.out.println("Modelo -> " + modelo);
		System.out.println("Capacidad bateria -> " + capacidadBateria + " KW");
		System.out.println("Cargada -> " + cargado);
		System.out.println("==========================\n");	
		
	}
	
}
