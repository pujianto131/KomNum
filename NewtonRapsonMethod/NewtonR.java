/*
 * Created by pujianto131
 */


import java.text.DecimalFormat;
import java.util.*;

public class NewtonR{
    public static void main(String[] args) {
        double x=0,xN,eR,nilaiX=0.56714329;
        int i=0;

        DecimalFormat dec = new DecimalFormat("#0.000000000");
        DecimalFormat dec1 = new DecimalFormat("#0.00000");

        System.out.println("\ni\tX\t\tFx\t\tEr");
        System.out.println("----------------------------------------------------");
        while (i != 10) {
            xN = HasilXn(x);
            eR = HasilEr(xN, nilaiX);
            System.out.println(
                i+"\t"+
                dec.format(x)+"\t"+
                dec.format(xN)+"\t"+
                dec1.format(eR)
            );
            x=xN;
            i++;
            
        }  
        System.out.println("----------------------------------------------------\n");      
    }

    public static double HasilXn(double x) {
        double hasil;
        hasil = x - (Math.exp(-x)-x) / (-Math.exp(-x)-1);
        return hasil;   
    }

    public static double HasilEr(double xN, double nilaiX) {
        double hasil;
        hasil = ((nilaiX-xN)/nilaiX) * 100;
        return hasil;
    }
}