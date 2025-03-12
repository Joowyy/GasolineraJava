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

			case '5':

				quitarDispositivosCargados(g);
				break;
				
			case '6':

				break;

			case '7':

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
