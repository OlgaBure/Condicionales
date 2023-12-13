package exerCond;
import java.util.Scanner;
/*Hacer un programa que pida dos números. El programa ha de mirar cual de los dos es el mayor, 
 * y después mirar si este número mayor es divisible por el menor;
 *  en caso que lo sea ha de restar el mayor del menor,  en caso contrario los ha de sumar. */
public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		System.out.println("Introduce dos numeros");
		int num1=read.nextInt();
		int num2=read.nextInt();
		
		if(num1>num2){
			if (num1%num2==0) {
				System.out.println("Estos  dos números son divisibles, por lo  que  su resta es " + (num1-num2) + ".");
			} else 
			System.out.println("Estos  dos números no son divisibles, por lo  que  la suma es " + (num1+num2) + ".");
		}else if (num1%num2==0) {
			System.out.println("Estos  dos números son divisibles, por lo  que  su resta es " + (num1-num2) + ".");
			
		}else {
			System.out.println("Estos dos números no son divisibles, por lo que la suma es " + (num1+num2)+"." );
		}
		read.close();
	}	
}

