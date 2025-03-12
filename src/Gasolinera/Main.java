package Gasolinera;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		AÑADIR METODO DE ELIMINAR TODOS
//		LOS OBJETOS DE LA ARRAY EN TRUE
		
//		Gasolinera principal (Usamos la clase con un metodo 'static')
		Gasolinera g = Gasolinera.crearGasolinera();

//		Almacenamos la opcion en 'opcUsuario'
		char opcUsuario = mostrarMenu(g);
		
	}
	
//	MENU DEL PROGRAMA
	public static char mostrarMenu (Gasolinera g) {
		
		Scanner sc = new Scanner (System.in);
		char opc;
		
		do {

			System.out.println("BIENVENIDO A REPSOL\n1. Añadir coche electrico\n2. Añadir coche gasolina\n3. Añadir movil\n4. Mostrar gasolinera\n5. Cargar/Llenar coche\n6. Cargar movil\n7. Salir del programa");
			switch (opc = sc.nextLine().charAt(0)) {
			case '1':

				g.añadirCocheElectrico();
				break;

			case '2':

				g.añadirCocheGasolina();
				break;

			case '3':

				g.añadirMovil();
				break;

			case '4':

				g.mostrarGasolinera();
				break;

			case '5':

//				Muestra los coches
				for (Coche c1 : g.getCoches()) {
					
					c1.mostrarCoche();
					
				}
				
//				Declaramos variables de apoyo
				boolean cocheCargado = false;
				Electrico auxE = new Electrico();
				Gasolina auxG = new Gasolina();
				
				System.out.println("Dime la matricula del vehiculo ->");
				String matriculaUsu = sc.nextLine();
				
//				Checkeo de errores
				if (matriculaUsu.length() != 7) {
					
					System.out.println("Introduce una matricula válida\n");
					break;
					
				}
				
//				Con esta pregunta diferenciamos entre ambos
				System.out.println("Tu vehiculo es electrico o gasolina e/g");
				char tipoVehiculo = sc.nextLine().charAt(0);

//				Para electricos
				if (tipoVehiculo == 'e') {
				
					for (Coche c2 : g.getCoches()) {

//						Guardamos el objeto de la condicion casteandolo en un Electrico
						if (c2.getMatricula().equalsIgnoreCase(matriculaUsu)) {

							auxE = (Electrico) c2;
							cocheCargado = false;

//							Si ese objeto pertenece a cierta clase, haz lo siguiente
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
				
//				Para gasolinas
				} else if (tipoVehiculo == 'g') {
				
					for (Coche c3 : g.getCoches()) {

//						Guardamos el objeto de la condicion casteandolo en un Gasolina
						if (c3.getMatricula().equalsIgnoreCase(matriculaUsu)) {

							auxG = (Gasolina) c3;
							cocheCargado = false;

//							Si ese objeto pertenece a cierta clase, haz lo siguiente
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
					
//					Factura del coche
					int totalFactura = 0;
					System.out.println("\n---------- FACTURA ---------");
					System.out.println("Precio kWh -> " + g.getPrecioGasolina() + " €");
					System.out.println("Capacidad bateria -> " + auxG.getDeposito() + " L");
					System.out.println("------------------------");
					System.out.println("Total de factura -> " + g.getPrecioGasolina()*auxG.getDeposito() + " €");
					System.out.println("------------------------\n");
					
				}

				break;

			case '6':
				
//				Muestra los moviles
				for (Movil m1 : g.getMoviles()) {
					
					if (m1.isCargado() == false) {
					
						m1.mostrarMovil();
					
					}
					
				}
				
//				Declaramos variables de apoyo
				Movil aux1 = new Movil(); 
				
				System.out.println("Dime el codigo del movil que quieres cargar ->");		
				String codeUsu = sc.nextLine();
				
//				Checkeo de errores
				if (codeUsu.length() != 4) {
					
					System.out.println("Introduce un codigo válido\n");
					break;
					
				}

//				Asignamos el objeto que sea de codigo identico.
				for (Movil m2 : g.getMoviles()) {
					
//					Compara el codigo del 'for each' con el del Usuario
					if (m2.getCodigo().equalsIgnoreCase(codeUsu)) {
						
						m2.cargar();
						aux1 = m2;
						
					}
					
				}
				
				g.getMoviles().remove(aux1);
				
//				Checkeo de errores
				if (!aux1.getCodigo().equalsIgnoreCase(codeUsu)) {
					
					System.out.println("Introduce un codigo valido");
					break;
					
				}
				
//				Factura del movil
				int totalFactura = 0;
				System.out.println("\n---------- FACTURA ---------");
				System.out.println("Tiempo p/minuto -> " + g.getPrecioMinuto() + " €");
				System.out.println("Tiempo de carga -> " + aux1.getTiempoCarga() + " min");
				System.out.println("------------------------");
				System.out.println("Total de factura -> " + g.getPrecioMinuto()*aux1.getTiempoCarga() + " €");
				System.out.println("------------------------\n");
				
				break;

			case '7':

				System.out.println("Saliendo del programa...");
				break;

			default:
				
				System.out.println("Introduce un carácter válido.\n");

			}

		} while (opc != '7');
		
		return opc;
	}

}
