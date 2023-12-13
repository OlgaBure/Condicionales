package exerCond;
import java.util.Scanner;
/*En un supermercado se hace una promoción, mediante la cual el cliente obtiene un descuento
 *dependiendo de un numero que se escoge al azar. Si el numero escogido es menor que 74 el
 *descuento es del 15% sobre el total de la compra, si es mayor o igual a 74 el descuento es del 20%.
 * Obtener cuanto dinero se le descuenta.*/
public class Ej22 {

	public static void main(String[] args) {
	
		int precioCompra;
		int numero;
	
		Scanner read = new Scanner(System.in);
		System.out.println( "Introduce el precio de la compra");
		precioCompra = read.nextInt();
		System.out.println("Introduce un numero al azar");
		numero = read.nextInt();
		
		if (numero<74) {
			System.out.println("El total a pagar es " + (precioCompra-0.85)/100);
			if (numero>=74) {
				System.out.println("El total a pagar es " + (precioCompra-0.80)/100);
			}
			else {
				System.out.println("No le corresponde un descuento");
			}
		}
			read.close();
	}

}
