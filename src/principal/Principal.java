/**
 * 
 */
package principal;
import clases.Complejo;
import java.util.Scanner;
/**
 * @author ALICIA FIERRO
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Complejo i = new Complejo();
		i.crearBinomica();
		
		System.out.println("Que accion desea realizar: ");
		System.out.println("1.Cambiar a polar");
		System.out.println("2.Sumar");
		System.out.println("3.Restar");
		System.out.println("4.Multiplicar");
		System.out.println("5.Dividir");
		int a=in.nextInt();
		switch(a) {
		case 1:
			i.transformarPolar();
			break;
		case 2:
			i.
		}
		/*System.out.println("Definir numeros complejos de forma polar: ");

		System.out.println("Modulo: ");
		double x=in.nextDouble();
		System.out.println("Angulo: ");
		double y=in.nextDouble();
		i.transformarRectangular(x,y);*/
	}

}
