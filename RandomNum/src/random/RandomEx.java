package random;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[]args){
		
		double val=Math.random();
		System.out.println(val);
		
		int val1=(int) Math.random();
		System.out.println(val1);
		
		Random random=new Random();
		int random1=random.nextInt();
		int random2=random.nextInt(10);
		
		//int random1=(int) Math.random();
		
		System.out.println(random1);
		
	//	int random2=(int) Math.random();
		System.out.println(random2);
		
		
	}

}
