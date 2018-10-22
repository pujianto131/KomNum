public class NewtonRhapson{

    public static double hasilX1(double x){
        double hasil;
        hasil = x - ((Math.exp(-x) - x) / (-Math.exp(-x) -1));
        return hasil;
    }

    public static double hasilEr(double xi){
        double hasil;
        hasil = ((0.56714329 - xi) / 0.56714329) * 100;
        return hasil;
    }

    public static void main(String[] args){
        double x=0, xi, er;
        int i = 0;

        while(i != 10){
            xi = hasilX1(x);
            er = hasilEr(xi);
            System.out.println(i + "\t" + x + "\t" + xi + "\t" + er);
 
            x=xi;
            i++;
        }
    }   
}