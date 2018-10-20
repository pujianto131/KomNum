import java.util.*;

public class Regresi2 {

    public static void main(String[] args) {
    int i = 0,x[] = {10,11,12,14,16,18,19,20}, y[] = {10000,11000,9900,11000,12000,12500,14000,13900};
    float n , totalX=0, totalY=0, totalX2=0, totalXY=0, pembilang, penyebut, rataX, rataY; 
    float M, C, er, ymc;
    
    Scanner Keyboard = new Scanner(System.in);

    System.out.print("Masukkan Nilai N : ");
    n = Keyboard.nextInt();

    while (i != n) {

        totalX = totalX + x[i];
        totalY = totalY + y[i];
        totalX2 = totalX2 + (x[i] * x[i]);
        totalXY = totalXY + (x[i]*y[i]);

        System.out.println(i + "\t" + x[i] + "\t" + y[i] + "\t" + totalX + "\t" + totalY + "\t" + totalX2 + "\t" + totalXY);

        i++;
    }
    System.out.println("\n");

    pembilang = (n * totalXY) - (totalX * totalY);
    penyebut = (n *totalX2) - (totalX *totalX);
    M = pembilang/penyebut;
    rataY = totalY/n;
    rataX = totalX/n;
    C = rataY - (M *rataX);
    
    System.out.println(pembilang + "\t" + penyebut + "\t" + M + "\t" + rataX + "\t" + rataY + "\t" + C);
    System.out.println("\n");

    System.out.println("I" + "\t" + "X" + "\t" + "Y" + "\t" + "Y = mx+c");
        for (int j = 0; j < n; j++) {
            ymc = M * x[j] + C;

            System.out.println(j + "\t" + x[j] + "\t" + y[j] + "\t" + ymc);

        }
    }



}