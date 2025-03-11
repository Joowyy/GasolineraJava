package Gasolinera;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		AÑADIR METODO DE ELIMINAR TODOS
//		LOS OBJETOS DE LA ARRAY EN TRUE
		
		
//		Movil movil = new Movil();
//		
//		movil.cargar();
		
		Gasolinera g = Gasolinera.crearGasolinera();
		
		g.mostrarGasolinera();
		
//		Almacenamos la opcion en 'opcUsuario'
		char opcUsuario;
		opcUsuario = mostrarMenu();
		
	}
	
//	MENU DEL PROGRAMA
	public static char mostrarMenu () {
		
		Scanner sc = new Scanner (System.in);
		char opc;
		
		System.out.println("BIENVENIDO A REPSOL\n1. Añadir coche electrico\n2. Añadir coche gasolina\n3. Añadir movil\n");
		switch (opc = sc.nextLine().charAt(0)) {
		
		
		
		}
		
		return opc;
	}

}
