//import Java.Math;

public class RegulaFalzi {

    public static void main(String[] args) {
    
        int i = 0;
        double x1=1, x2=2, x3=0;
        double fx1, fx2, fx3, abs=0;

    
        while (i != 10) {
            fx1 = Math.pow(x1, 3) + Math.pow(x1, 2) - (3 * x1) - 3;
            fx2 = Math.pow(x2, 3) + Math.pow(x2, 2) - 3 * x2 - 3;
            x3 = x2 - (fx2 * (x1 - x2)) / (fx1 - fx2);
            fx3 = Math.pow(x3, 3) + Math.pow(x3, 2) - 3 * x3 - 3;
            float x3f = (float)x3;
            abs = 0 - fx3;

            if (fx3 == 0.0) {
                System.out.println("--------------------------------------------");
                System.out.println("x3\t : " + x3f);
                System.out.println("F(x1)\t : " + fx1);
                System.out.println("F(x2)\t : " + fx2);
                System.out.println("F(x3)\t : " + fx3);
                System.out.println("Abs\t : " + abs);
                System.out.println("--------------------------------------------");
            }

            else {
                if (Math.pow(fx1, 2) > Math.pow(fx2, 2)) {
                    x1 = x3;
                }
                
                else {
                    x2 = x3;
                }
            }

            System.out.println("--------------------------------------------");
            System.out.println("x3\t : " + x3f);
            System.out.println("F(x1)\t : " + fx1);
            System.out.println("F(x2)\t : " + fx2);
            System.out.println("F(x3)\t : " + fx3);
            System.out.println("Abs\t : " + abs);
            System.out.println("--------------------------------------------");

            i++;

        }


    }

    // public double rumus () {
    //     fx1 = Math.pow(x1, 3) + Math.pow(x1, 2) - 3 * x1 - 3;
    //     fx2 = Math.pow(x2, 3) + Math.pow(x2, 2) - 3 * x2 - 3;
    //     x3 = x2 - ((fx2 * (x1 - x2)) / (fx1 - fx2));
    //     return fx1, fx2, x3;
    // }


}