package exerCond;
import java.util.Scanner;
/*Hacer un programa que introduciendo un número del 1 al 7, diga si corresponde a lunes,
 *  martes, miércoles, ... Si el número no está comprendido
 *  entre 1 y 7, ha de mostrar un mensaje avisando que no puede decir el día. */
public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int num;
		
		do{ 
			System.out.println("Introduce numeros de 1 hasta el 7");
			num=read.nextInt();
		}while (!(num>=1)&&(num<=7));//repetimos si no es un número 1..7
	
	//switch
		switch (num) {
		case 1 : System.out.println("Es lunes");
		break;
		case 2: System.out.println("Es martes");
		break;
		case 3: System.out.println("Es miercoles");
		break;
		case 4: System.out.println("Es jueves");
				break;
		case 5: System.out.println("Es viernes");
		break;
		case 6: System.out.println("Es sabado");
		break;
		case 7: System.out.println("Es domingo");
		break;
		default: System.out.println("Este numero no corresponde al dia de la semana, introduce otro");
		break;
		}
		read.close();
	}
}
