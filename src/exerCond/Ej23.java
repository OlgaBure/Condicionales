package exerCond;
import java.util.Scanner;
/*En un juego de preguntas a las que se responde “Si” o “No” gana quien responda correctamente las tres preguntas.
 *  Si se responde mal a cualquiera de ellas ya no se pregunta la siguiente y termina el juego. Las preguntas podrían ser:
	1. Colon descubrió América?
	2. La guerra de la independencia fue en el año 1808?
	3. The Doors fue un grupo de rock Americano?*/
public class Ej23 {

	public static void main(String[] args) {
		int opcion;
		char respuesta;
		boolean si;
		int contador;
		
		Scanner read = new Scanner(System.in);
		//System.out.println("Colon descubrió América?");
		//System.out.println("La guerra de la independencia fue en el año 1808?");
		//System.out.println("The Doors fue un grupo de rock Americano?");
		
		do {
			System.out.println("Contesta a las tres preguntas para ser ganador");
			opcion = read.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Colon descubrió América?");
				respuesta = (char)System.in.read();
				if ((int)respuesta==si) {
					contador++;
				}
				else {
					contador--;
				}
				break;
			case 2:
				System.out.println("La guerra de la independencia fue en el año 1808?");
				if (respuesta==si) {
					contador++;
				}
				else { 
					contador--;
				}
				break;
			case 3:
				System.out.println("The Doors fue un grupo de rock Americano?");
				if (respuesta==si) {
					contador++;
				}
				else {
					contador--;
				}
				break;
			default:
				System.out.println("Ha occurido un error, repetir otra vez");
			}
			
		} while (opcion 1 && opcion 2 && opcion 3 == si)|| contador==3;
		read.close();
	}
	
}
