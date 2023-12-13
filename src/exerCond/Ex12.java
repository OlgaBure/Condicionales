package exerCond;
import java.io.IOException;
import java.util.Scanner;
/*Hacer un programa que pida un carácter y diga si es una letra mayúscula.
 *  Dentro del código ASCII los caracteres mayúscula están comprendidos entre el 65(A),
 *  y el 90(Z).*/
public class Ex12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Introduce un caracter");
		char caracter = (char) System.in.read();
		
		if(((int)caracter <= 65) && ((int)caracter >= 90)) {
			System.out.println("El caracter introducido es una letra en mayuscula");
		}
		else {
			System.out.println("Es un numero o un signo");
		}
		read.close();
	}
}
