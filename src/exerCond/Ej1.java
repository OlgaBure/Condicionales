package exerCond;

import java.util.Scanner;

/*Hacer un programa que pida el precio y el descuento de un producto y calcule el total.
 *  Si el total supera los 100 euros, el programa ha de descontar 15€*/
public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int total;
		System.out.println("Introduce el precio del producto");
		int precio = read.nextInt();
		System.out.println("Introduce el descuento aplicado");
		int descuento = read.nextInt();
		total=precio+descuento;
		if(total>100) {
			System.out.println("Le van a descontar 15€ del precio final");
		}else {
			System.out.println("Lo sentimos pero el descuento de los 15€ no se aplica a su caso.");
		}
		read.close();
	}

}
