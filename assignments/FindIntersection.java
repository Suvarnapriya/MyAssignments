package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		
	int[] arrayA= {3,2,11,4,6,7};
	int[] arrayB= {1,2,8,4,9,7};
	
	int l1= arrayA.length;
	int l2=arrayB.length;
	
	
	for(int i=0;i<l1;i++)
	{
		for(int j=0;j<l2;j++)
		{
			if(arrayA[i]==arrayB[j])
			{
				System.out.println(arrayA[i]);
			}
				
	}
	
	}

}
}