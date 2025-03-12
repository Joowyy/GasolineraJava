package Gasolinera;

public class Gasolina extends Coche {

//	----- ATRIBUTOS -----
	private int deposito;
	private boolean lleno = false;
	
//	----- CONSTRUCTORES -----
	public Gasolina () {
		
	}
	public Gasolina(String matricula, String modelo, int deposito, boolean lleno) {
		super(matricula, modelo);
		this.deposito = deposito;
		this.lleno = lleno;
	}
	
//	----- GETTERS SETTERS -----
	public int getDeposito() {
		return deposito;
	}
	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}
	
	public boolean isLleno() {
		return lleno;
	}
	public void setLleno(boolean lleno) {
		this.lleno = lleno;
	}
	
//	----- METODOS -----
	public void llenarDeposito () {
		
		System.out.println("\nIntroduciendo manguera...");
		
		System.out.println("!!!! TIP !!!!");
		System.out.println("¿Has sacudido bien la manguera?");
		System.out.println("¿Sabes que dos gotas pueden ser 100m?\n");
		
//		Simple animacion de carga
		for (int i = 0; i < 10; i++) {
            System.out.print("\rCargando" + ".".repeat(i % 4)); 
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		
		lleno = true;
		System.out.println("\n\nVehiculo modificado con 900cv!\n");
		
	}
	
	@Override
	public void mostrarCoche() {

		System.out.println("\n-------------------------------");		
		System.out.println("Matricula -> " + matricula);
		System.out.println("Modelo -> " + modelo);
		System.out.println("Deposito -> " + deposito + " L");
		System.out.println("Lleno -> " + lleno);
		System.out.println("-------------------------------\n");	
		
	}
}
