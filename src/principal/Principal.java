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
		int m;
		int n;
		
		do {
			i.crearBinomica();
			
			System.out.println("Que accion desea realizar: ");
			System.out.println("1.Cambiar a polar");
			System.out.println("2.Sumar");
			System.out.println("3.Restar");
			System.out.println("4.Multiplicar");
			System.out.println("5.Dividir");
			int a=in.nextInt();
			do {
				switch(a) {
				case 1:
					i.transformarPolar();
					break;
				case 2:
					i.sumarBinomica();
					break;
				case 3:
					i.restarBinomica();
					break;
				case 4:
					i.multiplicarBinomica();
					break;
				case 5:
					i.dividirBinomica();
					break;
				}
				System.out.println("Desea realizar otra operacion?:   1.SI    2.NO");
				m=in.nextInt();
			}while(m==1);
			System.out.println("Desea ingresar nuevos valores?:   1.SI    2.NO");
		    n=in.nextInt();
		}while(n==1);
		/*System.out.println("Definir numeros complejos de forma polar: ");

		System.out.println("Modulo: ");
		double x=in.nextDouble();
		System.out.println("Angulo: ");
		double y=in.nextDouble();
		i.transformarRectangular(x,y);*/
	}

}
