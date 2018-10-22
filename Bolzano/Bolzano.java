/*
 * Created by pujianto131
 */

 import java.text.DecimalFormat;
import java.util.*;

public class Bolzano{
    public static double x1=1,x2=2,x3=0;
    public static int i=0;
    public static double Fx1, Fx2, Fx3, abso=0;
    public static void main(String[] args) {

        
        
        System.out.println("\n i  X1\t\tx2\t\tx3\t\tFx1\t\tFx2\t\tFx3\t\tAbso");
        System.out.println("======================================================"+
                            "=====================================================");
        while(i !=10){
            Fx1 = rumusFx(x1);
            Fx2 = rumusFx(x2);
            x3  = (x1+x2)/2;
            Fx3 = rumusFx(x3);
            abso = 0-Fx3;
            if(Fx3 == 0.0){
                mPrint();
            }else{
                if( Math.pow(Fx1, 2) > Math.pow(Fx2, 2) ){
                    x1 = x3;
                }else{
                    x2 = x3;
                }
            }
            mPrint();

            i++;
        }
        System.out.println("______________________________________________________"+
            "_____________________________________________________");
    }
    public static void mPrint() {
        DecimalFormat dFormat = new DecimalFormat(" #0.00000");
         System.out.println(
             i+"|  "+dFormat.format(x1)+"\t"+dFormat.format(x2)+"\t"+dFormat.format(x3)+"\t"+
             dFormat.format(Fx1) +"\t"+dFormat.format(Fx2)+"\t"+
             dFormat.format(Fx3) +"\t"+dFormat.format(abso)
             );
    }
    public static double rumusFx(double x) {
        double hasil;
        hasil = Math.pow(x, 3)+ Math.pow(x, 2)-3*x -3;
        return hasil;
        
    }
}