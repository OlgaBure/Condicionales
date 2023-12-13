package exerCond;
import java.io.IOException;
import java.util.Scanner;
/*Se desea obtener la nómina semanal (salario neto) de los empleados de una empresa cuyo trabajo
 *  se paga por horas de la siguiente manera:
    • Las hora inferiores o iguales a 35 a una tarifa determinada (9€)
    • Las horas extras se pagan un 15% más que las normales.
    • Los impuestos a deducir varían en función del sueldo mensual:
    • Si es menor de 1.262€ libre de impuestos
    • Las siguientes 270€ al 20%
    • El resto al 30%
En la pantalla final debe aparecer el nombre del trabajador, las horas trabajadas el mes,
 lo que cobrará desglosado en sueldo bruto y retenciones.
 * */
public class Ej21 {

	public static void main(String[] args) throws IOException {
		
		int horaPrecio;
		int horasTrab;
		char nombre;
		double salarioNeto;
		int horasExtra;
		int IVA;
		
		Scanner read = new Scanner(System.in);
		System.out.println("Introduce el nombre del empleado");
		nombre = (char) System.in.read();
		System.out.println("Introduce la cantida de horas trabajadas");
		horasTrab = read.nextInt();
		System.out.println("Introduce ");

	}

}
