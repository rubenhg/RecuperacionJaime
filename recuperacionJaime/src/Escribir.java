import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Escribir {
	

	public static void EscriboActores() {
		
	}

	public static void EscriboPelis() {

	}

	public static void EscriboReparto() {

	}
	
	public static void  GuardarJSON(){
		//para guardarlo en un archivo
		try {
		      //leer de consola
		      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		      String lineadeentrada = in.readLine();

		      //para escribir
		      PrintStream out = new PrintStream(new FileOutputStream("JSON.txt"));
		      System.setOut(out);

		     //mete lineas
		      out.println(lineadeentrada);

		      //cierra archivo
		      out.close();
		      System.out.println("Guardado correctamente");
		   }
		      catch(IOException e1) {
		        System.out.println("Error al escribir o leer");
		   }
	}

}
