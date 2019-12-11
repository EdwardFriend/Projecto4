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
		
		do {
		i.crearPolar();
		System.out.println("Que accion desea realizar: ");
		System.out.println("1.Cambiar a binomica");
		System.out.println("2.Sumar");
		System.out.println("3.Restar");
		System.out.println("4.Multiplicar");
		System.out.println("5.Dividir");
		int b=in.nextInt();
		do {
			switch(b) {
			case 1:
				i.transformarBinomica();
				break;
			case 2:
				i.sumarPolar();
				break;
			case 3:
				i.restarPolar();
				break;
			case 4:
				i.multiplicarPolar();
				break;
			case 5:
				i.dividirPolar();
				break;
			}
			System.out.println("Desea realizar otra operacion?:   1.SI    2.NO");
			m=in.nextInt();
		}while(m==1);
		System.out.println("Desea ingresar nuevos valores?:   1.SI    2.NO");
	    n=in.nextInt();
	}while(n==1);
}
}
