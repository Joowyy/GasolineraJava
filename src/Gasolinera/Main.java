package Gasolinera;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		AÑADIR METODO DE ELIMINAR TODOS
//		LOS OBJETOS DE LA ARRAY EN TRUE
		
//		Gasolinera principal
		Gasolinera g = Gasolinera.crearGasolinera();

//		Almacenamos la opcion en 'opcUsuario'
		char opcUsuario = mostrarMenu(g);
		
	}
	
//	MENU DEL PROGRAMA
	public static char mostrarMenu (Gasolinera g) {
		
		Scanner sc = new Scanner (System.in);
		char opc;
		
		do {

			System.out.println("BIENVENIDO A REPSOL\n1. Añadir coche electrico\n2. Añadir coche gasolina\n3. Añadir movil\n4. Mostrar gasolinera\n5. Quitar dispositivos cargados\n6. Salir del programa");
			switch (opc = sc.nextLine().charAt(0)) {
			case '1':

				break;

			case '2':

				break;

			case '3':

				break;

			case '4':

				g.mostrarGasolinera();
				break;

			case '5':

				break;

			case '6':

				System.out.println("Saliendo del programa...");
				break;

			default:
				
				System.out.println("Introduce un carácter válido.\n");

			}

		} while (opc != '6');
		
		return opc;
	}

}
