package exerCond;
import java.util.Scanner;
/*Un comercio en rebajas realiza los descuentos dependiendo del importe de la compra siguiendo las siguientes reglas:
    • Si es inferior a 10€ no se hace.
    • Entre 10€ y 30€ se hará un 10%.
    • Otros 20%
Calcular el precio a cobrar a los clientes.*/
public class Ej20 {

	public static void main(String[] args) {
		int precio;
		
		Scanner read = new Scanner(System.in);
		System.out.println("Introduce el precio del articulo");
		precio = read.nextInt();
		
		if (precio <= 10) {
			System.out.println("Lo sentimos pero no le corresponde un descuento.");
		}
		else if(precio>10 && precio<30) {
				System.out.println("Le corresponde 10% de descuento del precio " + (precio*0.90)/100);
			}
			 else if (precio>30) {
				 System.out.println("Le toca 20% de descuento y total a por pagar " + (precio*0.20)/100);
			 }
		read.close();
		}
		
	}


