package example;

public class calculate {

	
	
	//addition of given no;
	public static void main(String[] args) {
		
		
		int j=1;
		int rem =0;
		int sum =0;
		int no=115;
		
		while(no>0){
			
			rem=no %10;
			 sum =sum+rem;
			 no=no/10;
			 
			
			
		}
		
	
		
		System.out.println(sum);
		
		
		
		
	}
}
