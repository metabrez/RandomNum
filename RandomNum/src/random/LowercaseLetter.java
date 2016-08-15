package random;

import java.util.Random;

public class LowercaseLetter {
	
	public static void main(String[]args){
		
		Random random=new Random();
		
		//generate 10 lowercase letter
		
		for(int i=0;i<10;i++){
			
			int n=random.nextInt(26);
			
			//Add 97 from integer to range A-z
			
			char value=(char) (n+97);
			//Displaying result 
			
			System.out.println(value+ ": "+Integer.toString(n)) ;
		}
	}
	
}
