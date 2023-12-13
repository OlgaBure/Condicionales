package exerCond;
import java.util.Scanner;
/*Hacer un programa que pida tres números por el teclado, y los imprima en orden ascendente. */
public class Ej11 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner read= new Scanner(System.in);
			System.out.println("Introduce tres numeros");
			int num1=read.nextInt();
			int num2=read.nextInt();
			int num3=read.nextInt();
				if((num1>num2)&&(num1>num3)) {
				System.out.println(num1 + "," + num2 + "," + num3);
					}
					else if ((num2>num1)&&(num2>num3)) {
							System.out.println(num3 + "," + num1 + "," + num2);
						}
						else {
						System.out.println(num2 + "," + num1 + "," + num3);
					}
					read.close();
		}
	}



