package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		
		int n=1;
		int count=0;
		if(n<=1)
		{
			System.out.println("Given number  "+n+" is not a prime number");
		return;
		}
		for (int i=2;i<n;i++)
		{
			if(n%i==0)
			{	
             count++;
			}
		}	
			if(count>=1)
				System.out.println("Given number "+n+" is not a prime number");
			else
				System.out.println("Given number "+n+" is a prime number");
		
	
			

		}
}
	

	
