package exerCond;
import java.util.Scanner;
/*Introducir dos números por el teclado, dividendo y divisor.
 * Si dividendo es divisible por divisor, el programa ha de mostrar el mensaje “DIVISIBLES”.*/
public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int dividiendo=0;
		int divisor=0;
		
		System.out.println("Introduce el dividiendo y el divisor");
		dividiendo = read.nextInt();
		divisor = read.nextInt();
		
		if (dividiendo%divisor==0) {
			System.out.println("DIVISIBLES");
		}
		else {
			System.out.println("NO ES DIVISIBLE");
		}
		read.close();
	}

}
