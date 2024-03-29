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
	//ATRIBUTOS
	private double x;
	private double y;
	private double r;
	private double ang;
	private int a;
	double pares[][];
	double polar[][];
	private final double i=Math.sqrt(-1);
	//CONSTRUCTOR
	public Complejo() {
		this.x=0;
		this.y=0;
		this.r=0;
		this.ang=0;
		this.a=0;
		pares=null;
		polar=null;
	}
	/**
	 * 
	 * @return the x
	 */
	public double getX() {
		return this.x;
	}
	
	/**
	 * 
	 * @param x the x to setX
	 */
	public void setX(double x) {
		this.x=x;
	}
	/**
	 * 
	 * @return the y
	 */
	public double getY() {
		return this.y;
	}
	/**
	 * 
	 * @param y the y to setY
	 */
	public void setY(double y) {
		this.y=y;
	}
	
	//METODOS
	public void crearBinomica() {
		Scanner in =new Scanner(System.in);
		System.out.println("cuantos pares ordenados desea ingresar?: ");
		a=in.nextInt();
		pares=new double[a][2];
		for(int c=0;c<a;c++) {
				System.out.println("Ingrese el valor de x: ");
				x=in.nextDouble();
				System.out.println("Ingrese el valor de y: ");
				y=in.nextDouble();
				pares[c][0]=x;
				pares[c][1]=y;
				System.out.println("Forma binomica "+(c+1)+": z="+x+"+i"+y);
		}
	}
	public void crearPolar() {
		Scanner in =new Scanner(System.in);
		System.out.println("cuantos pares ordenados desea ingresar?: ");
		a=in.nextInt();
		polar=new double[a][2];
		
		for(int c=0;c<a;c++) {
				System.out.println("Ingrese el modulo: ");
				r=in.nextDouble();
				System.out.println("Ingrese el angulo: ");
				ang=in.nextDouble();
				System.out.println("Forma polar "+(c+1)+": z="+r+"(cos"+ang+"+isen"+ang+")");
				polar[c][0]=r;
				polar[c][1]=ang;
		}
	}
	
	public void sumarBinomica() {
		y=0;
		x=0;
		for(int c=0;c<a;c++) {
			x+=pares[c][0];
		}
		for(int c=0;c<a;c++) {
			y+=pares[c][1];
		}
		System.out.println("Suma: z="+x+"+i"+y);
	}
	public void restarBinomica() {
		x=0;
		y=0;
		for(int c=0;c<a;c++) {
			x-=pares[c][0];
		}
		for(int c=0;c<a;c++) {
			y-=pares[c][1];
		}
		System.out.println("Resta: z="+x+"+i"+y);
	}
	public void multiplicarBinomica() {
		x=1;
		y=1;
		for(int c=0;c<a;c++) {
			x=x*(pares[c][0]);
		}
		for(int c=0;c<a;c++) {
			y=y*(pares[c][1]);
		}
		System.out.println("Multiplicacion: z=("+x+")+i("+y+")");
	}
	public void dividirBinomica() {
		x=1;
		y=1;
		for(int c=0;c<a;c++) {
			x=(pares[c][0])/x;
		}
		for(int c=0;c<a;c++) {
			y=y*(pares[c][1])/y;
		}
		System.out.println("Multiplicacion: z=("+x+")+i("+y+")");
	}

	public void sumarPolar() {
		Scanner in =new Scanner(System.in);
		double n;
		double z;
		n=1.0;
		for(int c=0;c<a;c++) {
			z=Math.pow(polar[c][0], n);
			pares[c][0]=z*(Math.cos(polar[c][1]*n));
			x+=pares[c][0];
		}
		for(int c=0;c<a;c++) {
			z=Math.pow(polar[c][0], n);
			pares[c][1]=z*(Math.sin(polar[c][1]*n));
			y+=pares[c][1];
		}
		System.out.println("Desea visualizar el resultado de forma binomica o polar?: 1.Binomica       2.Polar");
		int a=in.nextInt();
		if(a==1) {
			System.out.println("Suma: z="+(double)Math.round(x*100)/100+"+i"+(double)Math.round(y*100)/100);
		}
		if(a==2) {
			r=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
			ang=Math.atan(y/x);
			System.out.println("Suma: z="+(double)Math.round(r*100)/100+"(cos"+(double)Math.round(ang*100)/100+"+isen"+(double)Math.round(ang*100)/100+")");
		}
	}
	public void restarPolar() {
		Scanner in =new Scanner(System.in);
		double n;
		double z;
		n=1.0;
		for(int c=0;c<a;c++) {
			z=Math.pow(polar[c][0], n);
			pares[c][0]=z*(Math.cos(polar[c][1]*n));
			x-=pares[c][0];
		}
		for(int c=0;c<a;c++) {
			z=Math.pow(polar[c][0], n);
			pares[c][1]=z*(Math.sin(polar[c][1]*n));
			y-=pares[c][1];
		}
		System.out.println("Desea visualizar el resultado de forma binomica o polar?: 1.Binomica       2.Polar");
		int a=in.nextInt();
		if(a==1) {
			System.out.println("Suma: z="+(double)Math.round(x*100)/100+"+i"+(double)Math.round(y*100)/100);
		}
		if(a==2) {
			r=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
			ang=Math.atan(y/x);
			System.out.println("Suma: z="+(double)Math.round(r*100)/100+"(cos"+(double)Math.round(ang*100)/100+"+isen"+(double)Math.round(ang*100)/100+")");
		}
	}
	public void multiplicarPolar() {
		Scanner in =new Scanner(System.in);
		double n;
		double z;
		n=1.0;
		for(int c=0;c<a;c++) {
			z=Math.pow(polar[c][0], n);
			pares[c][0]=z*(Math.cos(polar[c][1]*n));
			x=x*(pares[c][0]);
		}
		for(int c=0;c<a;c++) {
			z=Math.pow(polar[c][0], n);
			pares[c][1]=z*(Math.sin(polar[c][1]*n));
			y=y*(pares[c][1]);
		}
		System.out.println("Desea visualizar el resultado de forma binomica o polar?: 1.Binomica       2.Polar");
		int a=in.nextInt();
		if(a==1) {
			System.out.println("Suma: z="+(double)Math.round(x*100)/100+"+i"+(double)Math.round(y*100)/100);
		}
		if(a==2) {
			r=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
			ang=Math.atan(y/x);
			System.out.println("Suma: z="+(double)Math.round(r*100)/100+"(cos"+(double)Math.round(ang*100)/100+"+isen"+(double)Math.round(ang*100)/100+")");
		}
	}
	public void dividirPolar() {
		Scanner in =new Scanner(System.in);
		double n;
		double z;
		n=1.0;
		for(int c=0;c<a;c++) {
			z=Math.pow(polar[c][0], n);
			pares[c][0]=z*(Math.cos(polar[c][1]*n));
			x=(pares[c][0])/y;
		}
		for(int c=0;c<a;c++) {
			z=Math.pow(polar[c][0], n);
			pares[c][1]=z*(Math.sin(polar[c][1]*n));
			y=(pares[c][1])/y;
		}
		System.out.println("Desea visualizar el resultado de forma binomica o polar?: 1.Binomica       2.Polar");
		int a=in.nextInt();
		if(a==1) {
			System.out.println("Suma: z="+(double)Math.round(x*100)/100+"+i"+(double)Math.round(y*100)/100);
		}
		if(a==2) {
			r=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
			ang=Math.atan(y/x);
			System.out.println("Suma: z="+(double)Math.round(r*100)/100+"(cos"+(double)Math.round(ang*100)/100+"+isen"+(double)Math.round(ang*100)/100+")");
		}
	}
	
	public void transformarBinomica() {
		pares=new double[a][2];
		System.out.println("Forma polar: z="+r+"(cos"+ang+"+isen"+ang+")");
		double n;
		double z;
		n=1.0;
		for(int c=0;c<a;c++) {
			z=Math.pow(polar[c][0], n);
			pares[c][0]=z*(Math.cos(polar[c][1]*n));
			pares[c][1]=z*(Math.sin(polar[c][1]*n));
			System.out.println("Forma rectangular de z="+(double)Math.round(polar[c][0]*100)/100+"(cos"+(double)Math.round(polar[c][1]*100)/100+"isen"+(double)Math.round(polar[c][1]*100)/100+") es: z="+(double)Math.round(pares[c][0]*100)/100+"+i"+(double)Math.round(pares[c][1]*100)/100);
		}
	}
	public void transformarApolar() {
		polar= new double[a][2];
		for(int c=0;c<a;c++){
			polar[c][0]=Math.sqrt(Math.pow(pares[c][0],2)+Math.pow(pares[c][1],2));
			polar[c][1]=Math.atan(pares[c][1]/pares[c][0]);
			System.out.println("Forma polar de "+pares[c][0]+"+i"+pares[c][1]+" es: z="+(double)Math.round(polar[c][0]*100)/100+"(cos"+(double)Math.round(polar[c][1]*100)/100+"+isen"+(double)Math.round(polar[c][1]*100)/100+")");
		}
	}
}
