package headFirstJava0;

public class TestArrays {

	public static void main(String[] args) {
         
		String [] islands = new String[4];
		int [] index = new int[4];
		
		int y= 0 ;
		
		islands[0] = "Bermuda"; 
		islands[1] = "Kish" ; 
		islands[2] = "Khark" ; 
		islands[3] = " Gheshm" ; 
		
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2; 
		int ref; 
		while (y <4) {
			ref = index[y];
			System.out.print("island = ") ;
			System.out.println(islands[ref]);
		    
		   y = y+1 ; 
		}

	}

}
