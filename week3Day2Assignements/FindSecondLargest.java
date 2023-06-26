package week3Day2Assignements;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
    int[] data = {3,2,11,4,6,7,2,3,3,6,7};
    
		Set<Integer> data1=new TreeSet<Integer>();
		
  for(int i=0;i<data.length;i++)
  {


	data1.add(data[i]);

  }
  System.out.println(data1);
   List<Integer> SecondLast= new ArrayList<Integer>(data1);
    
    System.out.println("Second Last number is "+ SecondLast.get(SecondLast.size()-2));
    
	}

}
 