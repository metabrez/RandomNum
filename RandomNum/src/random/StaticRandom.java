package random;

import java.util.Random;

public class StaticRandom {
	
	
	static Random _random=new Random();
	
	static void test(){
		
		int num=_random.nextInt(5);
		
		System.out.println(num);
		
	}
public static void main(String[]args){
	
	test();
	test();
	test();
}
}
