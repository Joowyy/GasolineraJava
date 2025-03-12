package Gasolinera;

public class Movil implements Carga {

//	----- ATRIBUTOS -----
	private String codigo;
	private int tiempoCarga;
	private boolean cargado = false;
	
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
	public void mostrarMovil () {
		
		System.out.println("\n-------------------------------");		
		System.out.println("Codigo -> " + codigo);
		System.out.println("Tiempo carga -> " + tiempoCarga + " min");
		System.out.println("Cargado -> " + cargado);
		System.out.println("-------------------------------\n");
		
	}
	
	@Override
	public void cargar() {

		System.out.println("Cargando el telefono...");
		
//		Simple animacion de carga
		for (int i = 0; i < 10; i++) {
            System.out.print("\rCargando" + ".".repeat(i % 4)); 
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		
		cargado = true;
		System.out.println("\n\nMovil cargado al 100%");
		
	}
	
}
