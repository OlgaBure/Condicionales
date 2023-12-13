package exerCond;
import java.io.IOException;
import java.util.Scanner;
/*Hacer un programa que pida un carácter, diga si es una letra mayúscula (ASCII del 65 al 90),
 *  una letra minúscula (ASCII del 97 al 122),o bien otro carácter.*/
public class Ex13 {

	public static void main(String[] args) throws IOException {
	
		Scanner read = new Scanner(System.in);
		System.out.println("Introduce un caracter");
		char caracter = (char) System.in.read();
		
		if(((int)caracter>=65)&&((int)caracter<=90)){
			System.out.println("Es una letra mayuscula, su codigo ASCII seria " + (int)caracter + ".");
		}
		else if (((int)caracter>=97)&&((int)caracter<=122)){
			System.out.println("Es una letra mayuscula,  su codigo ASCII seria " + (int)caracter + ".");
			}
		read.close();
		}
	}

