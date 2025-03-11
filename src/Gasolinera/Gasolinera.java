package Gasolinera;

import java.util.ArrayList;

public class Gasolinera {

//	----- ATRIBUTOS -----
	private String nombre;
	private double preciokWh = 13.57;
	private double precioGasolina = 14.89;
	private double precioMinuto = 0.45;
	private static ArrayList<Coche> coches = new ArrayList<Coche>();
	private static ArrayList<Movil> moviles = new ArrayList<Movil>();
	
//	----- CONSTRUCTORES -----
	public Gasolinera () {
		
	}
	public Gasolinera (String nombre, double preciokWh, double precioGasolina, double precioMinuto, ArrayList<Coche> coches, ArrayList<Movil> moviles) {
		this.nombre = nombre;
		this.preciokWh = preciokWh;
		this.precioGasolina = precioGasolina;
		this.precioMinuto = precioMinuto;
		this.coches = coches;
		this.moviles = moviles;
	}
	
//	----- GETTERS SETTERS -----
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPreciokWh() {
		return preciokWh;
	}
	public void setPreciokWh(double preciokWh) {
		this.preciokWh = preciokWh;
	}
	
	public double getPrecioGasolina() {
		return precioGasolina;
	}
	public void setPrecioGasolina(double precioGasolina) {
		this.precioGasolina = precioGasolina;
	}
	
	public double getPrecioMinuto() {
		return precioMinuto;
	}
	public void setPrecioMinuto(double precioMinuto) {
		this.precioMinuto = precioMinuto;
	}
	
	public ArrayList<Coche> getCoches() {
		return coches;
	}
	public void setCoches(ArrayList<Coche> coches) {
		this.coches = coches;
	}
	
	public ArrayList<Movil> getMoviles() {
		return moviles;
	}
	public void setMoviles(ArrayList<Movil> moviles) {
		this.moviles = moviles;
	}
	
//	----- METODOS -----
	public void mostrarGasolinera () {
		
		System.out.println("\n==========================");		
		System.out.println("Nombre -> " + nombre);
		System.out.println("Precio kWh -> " + preciokWh);
		System.out.println("Precio gasolina -> " + precioGasolina);
		System.out.println("Precio p/minuto -> " + precioMinuto);
		System.out.println("\n > VEHICULOS GASOLINA");
		for (Coche g1 : coches) {
			
			if (g1.getClass().getSimpleName().equals("Gasolina")) {
			
				g1.mostrarCoche();
			
			}
			
		}
		System.out.println("\n > VEHICULOS ELECTRICOS");
		for (Coche g2 : coches) {
			
			if (g2.getClass().getSimpleName().equals("Electrico")) {
			
				g2.mostrarCoche();
			
			}
			
		}
		System.out.println("\n > MOVILES");
		for (Movil m1 : moviles) {

			m1.mostrarMovil();
			
		}
		System.out.println("==========================\n");	
		
	}
	
	public static Gasolinera crearGasolinera () {
		
		Gasolinera gasolineraJowy = new Gasolinera("Jowy's Repost", 13.57, 14.89, 0.45, coches, moviles);
		
		return gasolineraJowy;
	}
	
}
