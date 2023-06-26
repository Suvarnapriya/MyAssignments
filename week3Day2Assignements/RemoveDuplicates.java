package week3Day2Assignements;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates {

	public static <Char> void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		String[] sp = text.split(" ");
		 System.out.println("before removing duplicates");
		for(String s:sp)
		 {
			 System.out.print(s+" ");
		 }
      System.out.println();
		Set<String> setText=new LinkedHashSet<String>();
         for(String s1:sp)
         {
        	 setText.add(s1);
         }
         System.out.println("After removing Duplciates");
        
  for(String uniq:setText)
	  System.out.print(uniq+" ");
        
	}

	}
	
		  


