public class Tabulasi{
    public static void main(String[] args) {
        double x=0, y=0, z=0;
        System.out.println("=======================================");
        while(mTabul(x) > 0){
            
            System.out.println("nilai X : "+x);
            System.out.println("nilai Fx : "+mTabul(x));
            y = x;
            x+=0.1;
        }
        
        System.out.println("=======================================");
        while(mTabul(y) > 0){
           
            System.out.println("nilai X : "+y);
            System.out.println("nilai Fx : "+mTabul(y));
            z=y;
            y+=0.01;
        }
        System.out.println("=======================================");
        while(mTabul(z) > 0){
           
            System.out.println("nilai X : "+z);
            System.out.println("nilai Fx : "+mTabul(z));
            z+=0.001;
        }

    }




    public static double mTabul(double x){
        double hasil;
        hasil = (Math.exp(-x))-x;
        return hasil;
    }
    
}