package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum=a+b;
		System.out.println(a);
	
		for(int i=1;i<=11;i++)
		
		{
			System.out.println(sum);
			sum=a+b;
			a=b;
			b=sum;
			
			
		}

	}

}
