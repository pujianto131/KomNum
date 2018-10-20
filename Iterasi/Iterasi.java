import java.util.Scanner;
public class Iterasi {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double x;
		System.out.print("x:");
		x=key.nextDouble();
		key.close();
		int i=0;
		while (i !=10) {
			double tmp = hasilFX(x);
			System.out.println("iterasi ke-"+i+"x\t: "+x+"\tFx\t: "+tmp);
			x= tmp;

			i++;
		}
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
