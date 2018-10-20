public class Bolzano{
	public static double x1=1,x2=2,x3=0,i=0;
    public static double Fx1, Fx2, Fx3, abso=0.0;
    public static void main(String[] args) {
        
        while(i !=10){
            Fx1 = Math.pow(x1, 3)+ Math.pow(x1, 2)-3*x1 -3;
            Fx2 = Math.pow(x2, 3)+ Math.pow(x2, 2)-3*x2 -3;
            x3  = (x1+x2)/2;
            Fx3 = Math.pow(x3, 3)+ Math.pow(x3, 2)-3*x3 -3;
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
    }
    public static void mPrint() {
    	 System.out.println("=======================================");
         System.out.println("Fx1\t: "+Fx1);
         System.out.println("Fx2\t: "+Fx2);
         System.out.println("Fx3\t: "+Fx3);
         System.out.println("ABSO\t: "+abso);
         System.out.println("=======================================");

	}
}