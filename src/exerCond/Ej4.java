package exerCond;
import java.util.Scanner;
/*Hacer un programa que determine si con el valor de los tres lados de un triángulo,
 *  se puede formar este triángulo. Para formar un triángulo,
 *  todos los lados deben cumplir que su tamaño sea más pequeño que la suma de los otros dos. */
public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
	
		System.out.println("Introduce tres numeros para construir el triangulo");
		int cat1=read.nextInt();
		int cat2=read.nextInt();
		int cat3=read.nextInt();
		
		if((cat1+cat2>cat3)&&(cat1+cat3>cat2)&&(cat2+cat3>cat1)) {
			System.out.println("Con estos valores se puede formar un triangulo");
		}
		else { System.out.println("No se puede formar un triangulo. Introduce otros numeros");
		}
		read.close();
	}
}
