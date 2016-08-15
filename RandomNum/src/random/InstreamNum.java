package random;

import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.stream.IntStream;

public class InstreamNum {
	
	public static void main(String[]args){
		
		Random random=new Random();
		//use ints to print random stream num
		
		IntStream stream=random.ints();
		PrimitiveIterator.OfInt iterator=stream.iterator();
		//call nextInt on the iterator to get random number
		
		for(int i=0;i<5;i++){
			
			int n=iterator.nextInt();
			
			System.out.println(n);
		}
	}

}
