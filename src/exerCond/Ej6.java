package exerCond;
import java.util.Scanner;
/*Hacer un programa que pida dos números por el teclado, si el primer número
 *  es divisible por el segundo, los ha de sumar, sino, los ha de multiplicar. */
public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		System.out.println("Introduce dos numeros");
		int num1=read.nextInt();
		int num2=read.nextInt();
		
		if(num1%num2==0) {
			System.out.println("Hay que sumar " + (num1+num2));
		}
		else{
			System.out.println("Hay que multiplicarlos" + (num1*num2));
		}
		read.close();
	}
}
