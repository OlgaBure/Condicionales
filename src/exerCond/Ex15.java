package exerCond;
import java.util.Scanner;
/*Hacer un programa que pida el valor de un año y diga si es bisiesto o no lo es.
 *  Un año es bisiesto, cuando es divisible por 4, siempre y cuando no lo sea también por 100, 
 *  pero en este caso si es divisible por 400, también es bisiesto.
 *  (Resumiendo, ha de ser divisible por 4, y si lo es por 100, también lo ha de ser por 400 ) */
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Introduce el dia, mes y año");
		int anyo = read.nextInt();
		
		if (((anyo%4==0)&&(anyo%4!=0))||((anyo%100==0)&&(anyo%400==0))) {
			System.out.println(anyo + "es bisiesto");
		}
		else {
			System.out.println("Año no es bisiesto");
		}
		read.close();
	}
}
