package exerCond;
import java.util.Scanner;
/*Hacer un programa que pida dos números  y que después los imprima en orden ascendente */
public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read= new Scanner(System.in);
		System.out.println("Introduce dos numeros");
		int num1=read.nextInt();
		int num2=read.nextInt();
		if(num1<num2) {
			System.out.println(num1 + "," + num2);
		}
		else {
			System.out.println(num2 + "," + num1);
		}
		read.close();
	}
}
