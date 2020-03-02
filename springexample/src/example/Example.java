package example;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("main method");
		
		int no=100;
		
		//int i=1;
		for(int i=1;i<=100;i++)
		{
			int count =0;
			for(int j=i;j>=1;j--)
			{
				
				
			if (i%j==0)
			{
				
				count = count+1;
			}
		
			}
		
			
			if(count ==2)
			{
			System.out.println("prime"+i);
			}
			else
			{
				
				System.out.println("non prime"+i);
		    }
		}
			
    }
		
}
		
	
	
	

