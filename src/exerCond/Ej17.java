package exerCond;
import java.util.Scanner;
//Hacer un programa que pida dos números A, B y un signo S. Hacer la operación correspondiente con los números
/*A y B dependiendo de si S = ‘+’, ‘-’, ‘:’ o ‘x’. Si S no es ninguno de estos valores, 
* el programa ha de mostrar un mensaje avisando que no puede operar los valores.
*/
public class Ej17 {

	public static void main(String[] args) throws Exception {
		int numA;
		int numB;
		char signo;
		
		Scanner read = new Scanner(System.in);
		System.out.println("Introduce dos numeros");
		numA = read.nextInt();
		numB = read.nextInt();
		System.out.println("Introduce un signo");
		signo = (char)System.in.read();
		
		do ((numA+numB)||(numA/numB)||(numA-numB)||(numA*numB)) {
			System.out.println("Hacemos la operacion correspondiente al signo que nos cae");
		}
			while ((int)signo=='+')||(int)signo=='/')||(int)signo=='-')||(int)signo=='*'));
				System.out.println();

				else  {
				System.out.println("Es imposible operar con estos valores, elige otro");
			}
			read.close();
	}

}
