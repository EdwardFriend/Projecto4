/**
 * 
 */
package clases;
import java.util.Scanner;
import java.lang.Math;
/**
 * @author MARIO LUZARDO
 *
 */
public class Complejo {
	private double x;
	private double y;
	int a;
	double pares[][]=new double[a][2];
	private final double i=Math.sqrt(-1);
	public Complejo() {}
	public Complejo(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return this.x;
	}
	public void setX(double x) {
		this.x=x;
	}
	public double getY() {
		return this.y;
	}
	public void setY(double y) {
		this.y=y;
	}
	public void crearBinomica() {
		Scanner in =new Scanner(System.in);
		System.out.println("cuantos pares ordenados desea ingresar?: ");
		a=in.nextInt();
		for(int c=0;c<a;c++) {
				System.out.println("Ingrese el valor de x: ");
				x=in.nextInt();
				System.out.println("Ingrese el valor de y: ");
				y=in.nextInt();
				System.out.println("Forma binomica: z="+x+"+i"+y);
				pares[c][0]=x;
				pares[c][1]=y;
		}
		System.out.println("Ingrese el valor de x: ");
		x=in.nextInt();
		System.out.println("Ingrese el valor de y: ");
		y=in.nextInt();
		System.out.println("Forma binomica: z="+x+"+i"+y);
	}
	public void transformarPolar() {
		double r;
		double ang;
		r=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		ang=Math.atan(y/x);
		System.out.println("Forma polar de "+x+"+i"+y+" es: z="+(double)Math.round(r*100)/100+"(cos"+(double)Math.round(ang*100)/100+"+isen"+(double)Math.round(ang*100)/100+")");
	}
	public void transformarRectangular(double r, double ang) {
		System.out.println("Forma polar: z="+r+"(cos"+ang+"+isen"+ang+")");
		double n;
		double z;
		n=1.0;
		z=Math.pow(r, n);
		x=z*(Math.cos(ang*n));
		y=z*(Math.sin(ang*n));
		System.out.println("Forma rectangular de z="+(double)Math.round(r*100)/100+"(cos"+(double)Math.round(ang*100)/100+"isen"+(double)Math.round(ang*100)/100+") es: z="+(double)Math.round(x*100)/100+"+i"+(double)Math.round(y*100)/100);
	}
}
