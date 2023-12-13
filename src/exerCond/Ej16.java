package exerCond;
import java.util.Scanner;
/* Un tendero tiene cinco tipos de zanahoria, el tipo A = 1.5 €/Kg.,
 *  el tipo B = 1.8 €/Kg. El tipo C = 2.1 €/Kg. , el tipo D = 2.5 €/Kg.
 *   y el tipo F = 3.2 €/Kg. Hacer un programa que pida el tipo de zanahoria y la cantidad y luego calcule el total.*/
public class Ej16 {

	public static void main(String[] args) {
		
		int tipo;
		int cantidad;
		
		Scanner read = new Scanner(System.in);
		System.out.println("Introduce el tipo de zanahoria comprado");
		tipo = read.nextInt();
		System.out.println("Introduce la cantidad comprada");
		cantidad = read.nextInt();
		
		switch (tipo) {
		case 1:
			System.out.println("Tipo A de zanahoria cuesta " + (cantidad*1.5) + ".");
			break;
		case 2:
			System.out.println("Tipo B de zanahoria cuesta " + (cantidad*1.8) + ".");
			break;
		case 3:
			System.out.println("Tipo C de zanahoria cuesta " + (cantidad*2.1) + ".");
			break;
		case 4:
			System.out.println("Tipo D de zanahoria cuesta " + (cantidad*2.5) + ".");
			break;	
		case 5:
			System.out.println("Tipo F de zanahoria cuesta " + (cantidad*3.2) + ".");
			break;
		default:
			System.out.println("Introduce un yipo de zanahoria valido");
		}
		read.close();
	}
}
	
