package exerCond;
import java.util.Scanner;
/*Hacer un programa que pida cuatro números A, B, C y D;
 *  el programa ha de sumarlos si A/B > C/D sino,  ha de sumar sólo B y D. 
 *  En caso que B = 0, o D = 0 el programa ha de mostrar un mensaje avisando que no se puede dividir por 0;
 *  en tal caso no ha de hacerse ninguna operación.*/
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Introduce cuatro numeros");
		int A = read.nextInt();
		int B = read.nextInt();
		int C = read.nextInt();
		int D = read.nextInt();
		
		if ((A/B)>(C/D)) {
			System.out.println("Sumamos los cuatro " + (A+B+C+D));
		}
		else {
			System.out.println("Sumamos los a " + (B+D));
			}
			if ((B==0)||(D==0)) {
				System.out.println("No se puede dividir por 0");
			}
			read.close();
		}
	}

