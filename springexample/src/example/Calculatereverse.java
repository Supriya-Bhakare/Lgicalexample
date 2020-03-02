package example;

public class Calculatereverse {
	
	public static void main(String[] args) {
		System.out.println("The given number is reverse using logic");
		
		
		int i=0;
		int no=121;
		int rem=0;
		int sum=0;
		while(no>0){
			
			rem=no%10;
			
			sum =sum*10 + rem;
			
			
			
			no=no/10;
			 
			
		}
		System.out.println(sum);
	}

}
