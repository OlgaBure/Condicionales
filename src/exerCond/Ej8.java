package exerCond;
import java.util.Scanner;
/*Dados dos números, dar la relación entre ellos.
 *  Señalar el mayor, el menor o especificar si son iguales*/
public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read= new Scanner(System.in);
		System.out.println("Introduce dos numeros");
		int num1=read.nextInt();
		int num2=read.nextInt();
		if(num1>num2) {
			System.out.println("numero mayor es " + num1);
		}
		else if (num1<num2) {
			System.out.println("numero mayor es " + num2);
		}
		else if (num1==num2){
			System.out.println("son iguales");
		}
		read.close();
	}
}
