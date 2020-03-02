package example;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("main method");
		System.out.println("");
		
		int no=100;
		int countt=0;
		int county=0;
		//int i=1;

		String t=" ";
		String y=" ";
		
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
			//System.out.println("prime"+i);
			t=t+i+ " ";
			
			countt++;
			}
			else
			{
				
				//System.out.println("non prime"+i);
				y=y+i+" ";
				county++;
		    }
		}
			
		
		System.out.println("prime in list");
		System.out.println(t);
		System.out.println("total prime: "+countt);
		System.out.println("");
		System.out.println("not prime no in list");
		System.out.println(y);
		System.out.println("Total non prime:"+county);
    }
		
}
		
	
	
	

