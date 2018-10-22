/*
 * Created by pujianto131
 */


import java.util.*;
import java.text.DecimalFormat;

public class SecantM {
	public static void main(String[] args) {
		int n=0;
		double x_1 =0, x0=1,fx_1,fx0,nilaiX;
		DecimalFormat dcForm = new DecimalFormat("#0.00000"); 
		while (n!=3) {
			
			fx_1 = fungsiFX(x_1);
			fx0 = fungsiFX(x0);
			nilaiX = nilaiX(x_1, x0, fx_1, fx0);
			
			System.out.println("-------------------------------");
			System.out.println("Fxn"+(n-1)+"\t:" +dcForm.format(fx_1));
			System.out.println("Fxn"+n+"\t:" + dcForm.format(fx0));
			System.out.println("X"+(n+1)+"\t:" + dcForm.format(nilaiX));
		
			x_1=x0;
			
			x0=nilaiX;
	
			System.out.println("-------------------------------");
			n++;
			
		}

	}
	
	public static double fungsiFX(double x) {
		double fx = (Math.exp(-x))-x;
		return fx;
		
	}
	public static double nilaiX(double x_1, double x0, double fx_1, double fx0) {
		double Fx = fx_1- ( (fx0*(x_1-x0)) / (fx_1-fx0) );
		return Fx;
		
	}
}
