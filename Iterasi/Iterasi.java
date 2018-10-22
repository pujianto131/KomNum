import java.text.DecimalFormat;
import java.util.Scanner;
public class Iterasi {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		DecimalFormat dFormat = new DecimalFormat("#0.000000");
		double x;
		System.out.print("x:");
		x=key.nextDouble();
		key.close();
		int i=0;
		
		System.out.println("i\tX\t\tXn+1");
		System.out.println("--------------------------------------------");
		while (i !=11) {
			double tmp = hasilFX(x);
			System.out.println(i+"\t"+ dFormat.format(x)+"\t" +dFormat.format(tmp));
			x= tmp;

			i++;
		}
		System.out.println("--------------------------------------------");
	}
	public static double hasilFX(double x) {
		double fx = (Math.exp(-x));
		return fx;

	}
//	public static double present(int i, double x) {
//		double present = (x)
//		return;
//
//	}
}
