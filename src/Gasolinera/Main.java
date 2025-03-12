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

			System.out.println("BIENVENIDO A REPSOL\n1. Añadir coche electrico\n2. Añadir coche gasolina\n3. Añadir movil\n4. Mostrar gasolinera\n5. Quitar dispositivos cargados\n6. Cargar/Llenar coche\n7. Cargar movil\n8. Salir del programa");
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

			/* */ case '5':

				quitarDispositivosCargados(g);
				break;
				
			/* */ case '6':

//				Muestra los coches
				for (Coche c1 : g.getCoches()) {
					
					c1.mostrarCoche();
					
				}
				
				Coche aux = new Electrico();
				System.out.println("Dime la matricula del vehiculo ->");
				String matriculaUsu = sc.nextLine();
				
//				Checkeo de errores
				if (matriculaUsu.length() != 7) {
					
					System.out.println("Introduce una matricula válida\n");
					break;
					
				}
				
				System.out.println("El vehiculo es gasolina o electrico ->");
				String tipoVehiculo = sc.nextLine();
				
//				Checkeo de errores
				if (!tipoVehiculo.equalsIgnoreCase("Electrico") || !tipoVehiculo.equalsIgnoreCase("Gasolina")) {
					
					System.out.println("Introduce un tipo válido porfavor.\n");
					
				}
				
				if (tipoVehiculo.equalsIgnoreCase("Electrico")) {
					
					for (Coche c2 : g.getCoches()) {

						if (c2.getMatricula().equalsIgnoreCase(matriculaUsu)) {
							
							aux = c2;
							
						}
						
						if (aux.getClass().getSimpleName().equals("Electrico")) {
							
							
							
						}
						
					}
					
				} else if (tipoVehiculo.equalsIgnoreCase("Gasolina")) {
					
					
					
				} else {
					
				}
				
				break;

			case '7':
				
//				Muestra los moviles
				for (Movil m1 : g.getMoviles()) {
					
					if (m1.isCargado() == false) {
					
						m1.mostrarMovil();
					
					}
					
				}
				
				Movil aux = new Movil(); 
				System.out.println("Dime el codigo del movil que quieres cargar ->");		
				String codeUsu = sc.nextLine();
				
//				Checkeo de errores
				if (codeUsu.length() != 4) {
					
					System.out.println("Introduce un codigo válido\n");
					break;
					
				}

//				Asignamos el objeto que sea de codigo identico.
				for (Movil m2 : g.getMoviles()) {
					
					if (m2.getCodigo().equalsIgnoreCase(codeUsu)) {
						
						m2.cargar();
						aux = m2;
						
					}
					
				}
				
//				Checkeo de errores
				if (!aux.getCodigo().equalsIgnoreCase(codeUsu)) {
					
					System.out.println("Introduce un codigo valido");
					break;
					
				}
				
				break;

			case '8':

				System.out.println("Saliendo del programa...");
				break;

			default:
				
				System.out.println("Introduce un carácter válido.\n");

			}

		} while (opc != '8');
		
		return opc;
	}
	
	public static boolean quitarDispositivosCargados (Gasolinera g) {
		
		boolean dispositivosQuitados = false;
		
		System.out.println("\nEliminando...");
		
		g.getMoviles().removeIf(Movil -> Movil.isCargado() == true);
		
		System.out.println("Dispositivos eliminados correctamente!\n");
		
		return dispositivosQuitados;
	}

}
