import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Menu {
LeerDatos leerdatos;
Scanner teclado;	
	
	public Menu(){
		this.teclado = new Scanner(System.in); 
	}
	
	public void run(){
		int op = 0; 
		boolean salir = false;
		boolean ok = false;		
		
		while (!salir) {
		    System.out.println();
			System.out.println("--MENU--\n" 
							+  "  1 Realizar Copia De Seguridad \n"		
							+  "  2 Salir \n");
			try{
				op = teclado.nextInt(); 
				System.out.println("OPCION SELECCIONADA:" + op);
				switch (op) {
					
					case 1:
						System.out.println("Pasamos datos de teclado a pantalla");
						System.out.println("\nDatos: \n" + leerdatos.callURL("http://10.4.110.11/jaime/ADAT_Cartelera/leer_cartelera_todos.php"));
						ok = true;
						break;
					case 2:
						System.out.println("Cerrando Aplicación");
						salir = true;
						break;
					
					default:
						System.out.println("Opcion invalida: marque un numero de 1 a 2");
						break;
				}
				
						}catch (Exception e) {
				
				e.printStackTrace();
				System.out.println("Fin ejecución");
				System.exit(-1);
			}
		}
		
		//teclado.close();

	}
	
}
