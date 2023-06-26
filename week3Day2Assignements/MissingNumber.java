package week3Day2Assignements;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] numbers = {3,4,6,7,6,5,7,2,9,1,3};
		Set<Integer> order = new TreeSet<Integer>();
		
		for (int i=0;i<numbers.length;i++)
		{
			order.add(numbers[i]);
		}
	
		System.out.println("Numbers in set " +order);
		List<Integer> order1= new ArrayList<Integer>(order);
		System.out.println("Numbers in List " +order1);
		for(int j=0;j<order.size();j++)
		{
			if(order1.get(j)!=j+1)
			
			System.out.println("Missing Number is " + (j+1));
			
		}
		
	}

	}


