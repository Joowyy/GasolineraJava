package Gasolinera;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
//		Gasolinera principal (Usamos la clase con un metodo 'static')
		Gasolinera g = Gasolinera.crearGasolinera();
		char opc1;

		do {
		
//			Almacenamos la opcion en 'opcUsuario'
			opc1 = mostrarMenu();

			switch (opc1) {
			case '1':

				crearCocheElectrico(g);
				break;

			case '2':

				crearCocheGasolina(g);
				break;

			case '3':

				crearMovil(g);
				break;

			case '4':

				mostrarGasolinera(g);
				break;

			case '5':

				cargarLlenarCoches(g);
				break;

			case '6':

				cargarMovil(g);
				break;

			case '7':

				System.out.println("Saliendo del programa...");
				break;

			default:

				System.out.println("Introduce un carácter válido.\n");

			}
		
		} while (opc1 != 7);
		
	}
	
//	MENU DEL PROGRAMA
	public static char mostrarMenu () {
		
		Scanner sc = new Scanner (System.in);
		char opc;

		System.out.println("BIENVENIDO A REPSOL\n1. Añadir coche electrico\n2. Añadir coche gasolina\n3. Añadir movil\n4. Mostrar gasolinera\n5. Cargar/Llenar coche\n6. Cargar movil\n7. Salir del programa");
		opc = sc.nextLine().charAt(0);
		
		return opc;
	}
	
//	AGREGAR COCHE ELECTRICO
	public static Gasolinera crearCocheElectrico (Gasolinera g) {
		
		g.añadirCocheElectrico();
		
		return g;
	}
	
//	AGREGAR COCHE GASOLINA
	public static Gasolinera crearCocheGasolina (Gasolinera g) {
		
		g.añadirCocheGasolina();
		
		return g;
	}
	
//	AGREGAR COCHE MOVIL
	public static Gasolinera crearMovil (Gasolinera g) {
		
		g.añadirMovil();
		
		return g;
	}
	
//	MOSTRAR GASOLINERA
	public static void mostrarGasolinera (Gasolinera g) {
		
		g.mostrarGasolinera();

	}
	
//	CARGAR/LLENAR VEHICULOS
	public static void cargarLlenarCoches (Gasolinera g) {
		Scanner sc = new Scanner (System.in);
		boolean cocheCargado = false;

		do {

//			Muestra los coches
			for (Coche c1 : g.getCoches()) {

				c1.mostrarCoche();

			}

//			Declaramos variables de apoyo
			Electrico auxE = new Electrico();
			Gasolina auxG = new Gasolina();

			System.out.println("Dime la matricula del vehiculo ->");
			String matriculaUsu = sc.nextLine();

//			Checkeo de errores
			if (matriculaUsu.length() != 7) {

				System.out.println("Introduce una matricula válida\n");
				break;

			}

//			Con esta pregunta diferenciamos entre ambos
			System.out.println("Tu vehiculo es electrico o gasolina e/g");
			char tipoVehiculo = sc.nextLine().charAt(0);

//			Para electricos
			if (tipoVehiculo == 'e') {

				for (Coche c2 : g.getCoches()) {

//					Guardamos el objeto de la condicion casteandolo en un Electrico
					if (c2.getMatricula().equalsIgnoreCase(matriculaUsu)) {

						auxE = (Electrico) c2;
						cocheCargado = false;

//						Si ese objeto pertenece a cierta clase, haz lo siguiente
						if (auxE.getClass().getSimpleName().equals("Electrico")) {

							auxE.cargar();
							cocheCargado = true;

						}

					}

				}

				if (cocheCargado == true) {

//					Factura del coche
					int totalFactura = 0;
					System.out.println("\n---------- FACTURA ---------");
					System.out.println("Precio kWh -> " + g.getPreciokWh() + " kWh");
					System.out.println("Capacidad bateria -> " + auxE.getCapacidadBateria() + " Kw");
					System.out.println("------------------------");
					System.out.println("Total de factura -> " + g.getPreciokWh()*auxE.getCapacidadBateria() + " €");
					System.out.println("------------------------\n");

				}

//			Para gasolinas
			} else if (tipoVehiculo == 'g') {

				for (Coche c3 : g.getCoches()) {

//					Guardamos el objeto de la condicion casteandolo en un Gasolina
					if (c3.getMatricula().equalsIgnoreCase(matriculaUsu)) {

						auxG = (Gasolina) c3;
						cocheCargado = false;

//						Si ese objeto pertenece a cierta clase, haz lo siguiente
						if (auxG.getClass().getSimpleName().equals("Gasolina")) {

							auxG.llenarDeposito();
							cocheCargado = true;

						}

					}

				}

			} else {

				System.out.println("Introduce un carácter valido.");

			}

			if (cocheCargado == true) {

//				Factura del coche
				int totalFactura = 0;
				System.out.println("\n---------- FACTURA ---------");
				System.out.println("Precio gasofa -> " + g.getPrecioGasolina() + " €");
				System.out.println("Deposito -> " + auxG.getDeposito() + " L");
				System.out.println("------------------------");
				System.out.println("Total de factura -> " + g.getPrecioGasolina()*auxG.getDeposito() + " €");
				System.out.println("------------------------\n");

			}

		} while (!cocheCargado);

	}
	
	public static void cargarMovil (Gasolinera g) {
		Scanner sc = new Scanner (System.in);
		boolean movilCreado = false;
		
		do {

//			Muestra los moviles
			for (Movil m1 : g.getMoviles()) {

				if (m1.isCargado() == false) {

					m1.mostrarMovil();

				}

			}

//			Declaramos variables de apoyo
			Movil aux1 = new Movil(); 

			System.out.println("Dime el codigo del movil que quieres cargar ->");		
			String codeUsu = sc.nextLine();

//			Checkeo de errores
			if (codeUsu.length() != 4) {

				System.out.println("Introduce un codigo válido\n");
				break;

			}

//			Asignamos el objeto que sea de codigo identico.
			for (Movil m2 : g.getMoviles()) {

//				Compara el codigo del 'for each' con el del Usuario
				if (m2.getCodigo().equalsIgnoreCase(codeUsu)) {

					m2.cargar();
					aux1 = m2;
					movilCreado = true;

				}

			}

			g.getMoviles().remove(aux1);

//			Checkeo de errores
			if (!aux1.getCodigo().equalsIgnoreCase(codeUsu)) {

				System.out.println("Introduce un codigo valido");
				break;

			}

//			Factura del movil
			int totalFactura = 0;
			System.out.println("\n---------- FACTURA ---------");
			System.out.println("Tiempo p/minuto -> " + g.getPrecioMinuto() + " €");
			System.out.println("Tiempo de carga -> " + aux1.getTiempoCarga() + " min");
			System.out.println("------------------------");
			System.out.println("Total de factura -> " + g.getPrecioMinuto()*aux1.getTiempoCarga() + " €");
			System.out.println("------------------------\n");

		} while (!movilCreado);
		
	}

}
