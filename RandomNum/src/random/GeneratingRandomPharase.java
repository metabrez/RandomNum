package random;

import java.util.Random;

public class GeneratingRandomPharase {
	
	public static void main(String[]args){
		
		String[]words={"hello,", "cat,", "food", "buy", "free", "click","here"};
		
		System.out.println(words.length);
		
		Random random = new Random();
		StringBuilder builder = new StringBuilder();
		
		//Appending five random words to the stringbuilder
		
		for(int i=0;i<5;i++){
			
			//Get Random index
			
		int index=random.nextInt(words.length);
		
		builder.append(words[index]);
		builder.append(" ");
		}
		
		//System.out.println(builder);
		
		//Remove final space and trailaing punctuaiton;
		
		builder.setLength(builder.length()-1);
		
		if(builder.charAt(builder.length()-1)==','){
			
			builder.setLength(builder.length()-1);
		}
			
		builder.append("!");
		//Uppercase the string builder
		
		
		builder.setCharAt(0,Character.toUpperCase(builder.charAt(0)));
		
		System.out.println(builder);

}
}