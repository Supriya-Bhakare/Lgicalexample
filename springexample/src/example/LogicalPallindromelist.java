package example;

public class LogicalPallindromelist {
	
	public static void main(String[] args) {
		
	//for(int i=1;i<=10;i++){
		
	//}
		
		
		int no=120;
		
		int rem=0;
		int sum =0;
		int temp =no;
		
		while(no>0){
			rem =no%10;
			sum =(sum *10)+rem;
			
			
			
			no=no/10;
			
		}
		
		if(temp==sum){
			System.out.println("It is pallindrome no"+sum);
		}
		else{
		System.out.println("It is not palindrome no"+sum );
		}
		
		System.out.println("ttl");
	}

}
