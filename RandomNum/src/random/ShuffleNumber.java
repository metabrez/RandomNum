package random;

public class ShuffleNumber {
	
	static void shuffle(int[]array){
		
	int n=array.length;
	
	for(int i=0;i<n;i++){
		
		//Get a random index in aray
		
		int random=(int) (i+Math.random()*(n-i));
		
		//swap the random element with the pesetn element
		
		int randomElement=array[random];
		array[random]=array[i];
		array[i]=randomElement;
		
		
	}
	}
	
	public static void main(String[]args){
		
		int[] values = { 100, 200, 10, 20, 30, 1, 2, 3 };
		shuffle(values);
		
		for(int val:values){
			
			System.out.println(val);
		}
		
	}

}
