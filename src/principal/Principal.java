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
		Complejo i = new Complejo();
		i.transformarPolar();
		System.out.println("Definir numeros complejos de forma polar: ");
		Scanner in = new Scanner(System.in);
		System.out.println("Modulo: ");
		double x=in.nextDouble();
		System.out.println("Angulo: ");
		double y=in.nextDouble();
		i.transformarRectangular(x,y);
	}

}
