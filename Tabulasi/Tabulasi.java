/*
 * Created by pujianto131
 */

import java.text.DecimalFormat;
import java.util.*;

public class Tabulasi{
    public static void main(String[] args) {
        DecimalFormat dFormat = new DecimalFormat(" #0.00000");

        double x=0, y=0, z=0;
        System.out.println("\n  X\t\t  FX");
        System.out.println("=============================");
        while(mTabul(x) > 0){

            System.out.println(dFormat.format(x)+"\t"+ dFormat.format(mTabul(x)));
            y = x;
            x+=0.1;
        }
        
        System.out.println("_____________________________");
        while(mTabul(y) > 0){
            System.out.println(dFormat.format(y) +"\t"+  dFormat.format(mTabul(y)));
            z=y;
            y+=0.01;
        }
        System.out.println("_____________________________");
        while(mTabul(z) > 0){
            System.out.println(dFormat.format(z)+"\t"+  dFormat.format(mTabul(z)));
            z+=0.001;
        }
    }
    public static double mTabul(double x){
        double hasil;
        hasil = (Math.exp(-x))-x;
        return hasil;
    }
    
}