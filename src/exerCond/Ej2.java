package exerCond;
import java.io.IOException;
import java.util.Scanner;
/*Hacer un programa que pida el nombre, el precio y la cantidad de un producto. 
 * El programa ha de pedir el % de descuento, siempre 
 * y que el total sea mayor que 10.000 o el nombre del producto sea ‘A’. Calcular el total.*/
public class Ej2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		char nombre;
		double total;
		float porcentaje;
		
		System.out.println("Escibe el nombre del producto");
		nombre = (char) System.in.read();
		System.out.println("Introduce el precio del producto");
		int precio = read.nextInt();
		System.out.println("Introduce la cantidad de un producto");
		int cantidad = read.nextInt();
		total=precio*cantidad;
		
		if ((total > 10.000) || (nombre=='A'||nombre=='a')) {
			porcentaje= read.nextFloat();
			System.out.println("El total seria " + ((total-total*porcentaje)/100) + " y que descuento le deseas aplicar? ");
		}
		else {
			System.out.println("El precio final es de " + total);
		}
		read.close();
	}
	
}
