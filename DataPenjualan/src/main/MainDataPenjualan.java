package main;

public class MainDataPenjualan {

	public static void main(String[] args) {
		 int[][] dataArr= {{5,7,2,1},{3,4,4,2},{8,7,1,3},{5,1,2,6}};
	        int fak=1;
	        
//	        List<Integer> list = Ints. 
	        
	        for (int i = 0; i < dataArr.length; i++) {
	            for(int j=0; j<dataArr.length; j++){
	                System.out.print(dataArr[i][j]+" ");
	            }
	            System.out.println("");
	            
	        }
	        
	        for (int i = 1; i <=dataArr.length; i++) {
	            fak = fak*i;
	        }
	        System.out.println("jumlah Kombinasi: "+fak);
	        int angka=4;
	        

	}

}
