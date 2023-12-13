package exerCond;
import java.util.Scanner;
/*Hacer un programa que pida tres números, y después diga cual de los tres es el mayor.*/
public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read= new Scanner(System.in);
		System.out.println("Introduce tres numeros");
		int num1=read.nextInt();
		int num2=read.nextInt();
		int num3=read.nextInt();
		
		if((num1>num2)&&(num1>num3)) {
			System.out.println("El numero mayor es " + num1);
		}
		else {
			if((num2>num1)&&(num2>num3)) {
				System.out.println("El numero mayor es " + num2);
			}
			else {
				System.out.println("El numero mayor es " + num3);
			}
		}
		read.close();
	}
}
