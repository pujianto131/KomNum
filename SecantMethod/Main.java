/*
 * 
 * secant method using java
 * create by ucup cupu-cupu
 * blog : yusufeka.info | IG and twitter : @yusuf_eka22
 * 
 */

// package id.ucupcupu.secant;




import java.util.*;
// import java.Function.class;

public class Main {
	public static void main(String[] ucupcupu) {
		Scanner input = new Scanner(System.in);
		//create objek from Function class
		Function function = new Function();
		double tolerance,x0,x1,x2,fx0,fx1,fx2,tol;
		int i=0;
		//use input by user. input x0=1,x1=1,tolerance=0.00001 and you will get final result is 0.56714
		System.out.print("determine x0 value : ");
		x0 = input.nextDouble(); 
		System.out.print("determine x1 value : ");
		x1 = input.nextDouble(); 
		System.out.print("determine of error tolarence : ");
		tolerance = input.nextDouble();
		System.out.println("#\tx0\t\tfx(0)\t\tx1\t\tfx(1)\t\tx2\t\tfx(2)");
		System.out.println("-------------------------------------------------------------------------------------------------");
		do {
			fx0 = fx(x0);
			fx1 = fx(x1);
			x2=x1-((fx1*(x1-x0))/(fx1-fx0));
			fx2=fx(x2);
			System.out.printf(i+" | %.5f\t | %.5f\t| %.5f\t | %.5f\t | %.5f\t | %.5f\n",x0,fx0,x1,fx1,x2,fx2);
			x0=x1;
		    x1=x2;
		    i++;
		    if(fx1<0){
		       tol=Math.abs(fx1);
		    }        
		    else{
		        tol=fx1;
		    }        
		}while(tol>tolerance);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.printf("pproximate root of the equation exp(-x)-x=0 using Secant mehtod is %.5f\n",x2);
	}
	public static double fx(double x){
		return Math.exp(-x)-x;
	}
}
