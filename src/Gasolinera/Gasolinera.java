package Gasolinera;

import java.util.ArrayList;
import java.util.Scanner;

public class Gasolinera {

//	----- ATRIBUTOS -----
	private String nombre;
	private double preciokWh = 0.45;
	private double precioGasolina = 1.25;
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
		Gasolinera.coches = coches;
		Gasolinera.moviles = moviles;
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
		Gasolinera.coches = coches;
	}
	
	public ArrayList<Movil> getMoviles() {
		return moviles;
	}
	public void setMoviles(ArrayList<Movil> moviles) {
		Gasolinera.moviles = moviles;
	}
	
//	----- METODOS -----
	public ArrayList<Coche> añadirCocheElectrico () {
		
//		Declaramos variables
		Scanner sc = new Scanner (System.in);
		boolean creado = false;
		String matriculaUsu = null;
		String modeloUsu = null;
		int capacidadUsu = 1;
		
		do {
		
			System.out.println("\nVeamos... digame su matricula ->");
			matriculaUsu = sc.nextLine();
			
//			Checkeo de error
			if (matriculaUsu.length() != 7) {
				
				System.out.println("Introduce una matricula correcta.\n");
				break;
				
			}
			
			System.out.println("Dime el modelo del coches a ser posible ->");
			modeloUsu = sc.nextLine();
			
//			Checkeo de error
			if (modeloUsu.length() <= 0) {
				
				System.out.println("Introduce un modelo correcto.\n");
				break;
				
			}
			
			System.out.println("¿Total de voltaje de la bateria? ->");
			capacidadUsu = sc.nextInt();
			
//			Checkeo de error con salida
			if (capacidadUsu <= 0 || capacidadUsu >= 150) {
				
				System.out.println("Introduce una capacidad con sentido.\n");
				break;
				
			} else {
				
				creado = true;
				
			}

		} while (!creado);
		
		coches.add(new Electrico(matriculaUsu, modeloUsu, capacidadUsu, false));
		
		return coches;
	}
	
	public ArrayList<Coche> añadirCocheGasolina () {
		
//		Declaramos variables
		Scanner sc = new Scanner (System.in);
		boolean creado = false;
		String matriculaUsu = null;
		String modeloUsu = null;
		int capacidadUsu = 1;
		
		do {
		
			System.out.println("\nVeamos... digame su matricula ->");
			matriculaUsu = sc.nextLine();
			
//			Checkeo de error
			if (matriculaUsu.length() != 7) {
				
				System.out.println("Introduce una matricula correcta.\n");
				break;
				
			}
			
			System.out.println("Dime el modelo del coches a ser posible ->");
			modeloUsu = sc.nextLine();
			
//			Checkeo de error
			if (modeloUsu.length() <= 0) {
				
				System.out.println("Introduce un modelo correcto.\n");
				break;
				
			}
			
			System.out.println("¿Total del deposito del vehiculo? ->");
			capacidadUsu = sc.nextInt();
			
//			Checkeo de error con salida
			if (capacidadUsu <= 0 || capacidadUsu >= 350) {
				
				System.out.println("Introduce una capacidad con sentido.\n");
				break;
				
			} else {
				
				creado = true;
				
			}

		} while (!creado);
		
		coches.add(new Gasolina(matriculaUsu, modeloUsu, capacidadUsu, false));
		
		return coches;
	}

	public ArrayList<Movil> añadirMovil () {
	
//		Declaramos variables
		Scanner sc = new Scanner (System.in);
		boolean creado = false;
		String codigoUsu = null;
		int tiempoCargaUsu = 1;
		
		do {
		
			System.out.println("\nDigame su codigo si es tan amable (4 Numeros) ->");
			codigoUsu = sc.nextLine();
			
//			Checkeo de error
			if (codigoUsu.length() != 4) {
				
				System.out.println("Introduce un codigo válido.\n");
				break;
				
			}
			
			System.out.println("Dime el tiempo de carga del teléfono porfavor ->");
			tiempoCargaUsu = sc.nextInt();

//			Checkeo de error con salida
			if (tiempoCargaUsu <= 0 || tiempoCargaUsu >= 350) {
				
				System.out.println("Introduce un tiempo con sentido.\n");
				break;
				
			} else {
				
				creado = true;
				
			}

		} while (!creado);
		
		moviles.add(new Movil(codigoUsu, tiempoCargaUsu, false));
		
		return moviles;
	}
	
	public void mostrarGasolinera () {
		
		System.out.println("\n===============================");	
		
		System.out.println(" \t" + nombre);
		System.out.println("   Precio kWh -> " + preciokWh);
		System.out.println("   Precio gasolina -> " + precioGasolina);
		System.out.println("   Precio p/minuto -> " + precioMinuto);
		System.out.println("\n\t> V. GASOLINA <");
		
//		Usamos 'for eachs' para recorrer el array filtrando el nombre
		for (Coche g1 : coches) {
			
			if (g1.getClass().getSimpleName().equals("Gasolina")) {
			
				g1.mostrarCoche();
			
			}
			
		}
		
		System.out.println("\n\t> V. ELECTRICOS <");
		
		for (Coche g2 : coches) {
			
			if (g2.getClass().getSimpleName().equals("Electrico")) {
			
				g2.mostrarCoche();
			
			}
			
		}
		
		System.out.println("\n\t> MOVILES <");
		
		for (Movil m1 : moviles) {

			m1.mostrarMovil();
			
		}
		
		System.out.println("===============================\n");	
		
	}
	
//	Metodo 'static' al igual que los arrays, para poder ser llamado,
//	Ya que lo llamaremos desde el main.
	public static Gasolinera crearGasolinera () {
		
//		Coches gasolina
		coches.add(new Gasolina("4872KEJ", "Seat", 45, false));
		coches.add(new Gasolina("3395JOE", "Toyota", 61, false));
		
//		Coches electricos
		coches.add(new Electrico("9385IJO", "Tesla", 59, false));
		coches.add(new Electrico("1193HOL", "Peugeot", 55, false));
		
//		Moviles
		moviles.add(new Movil("5834", 33, false));
		moviles.add(new Movil("5573", 51, false));
		
//		Creamos la gasolinera con parametros
		Gasolinera gasolineraJowy = new Gasolinera("Jowy's Repost", 0.45, 1.25, 0.45, coches, moviles);
		
		return gasolineraJowy;
	}
	
}
