package example;

import java.util.Scanner;

public class LogicalAmstrome {
	
	public static void main(String[] args) {
		System.out.println("Logical amstrome ");
		
		
		
		//int no=153;
		
		int rem =0;
		int sum =0;
		
	Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter a no");
		int no=sc.nextInt();
		int tempx=no;
		while(no>0){
			
			rem =no%10;
			
			sum =sum +rem*rem*rem;
			no =no/10;
		}
	
		if(tempx==sum){
		System.out.println("it is amstrome:"+ sum);

		}
		else{
			System.out.println("it is not amstrome no:"+sum);
		}
	}
}
