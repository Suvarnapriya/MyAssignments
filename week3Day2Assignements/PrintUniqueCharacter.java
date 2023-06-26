package week3Day2Assignements;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		String name="Suvarna Priya";
          char[] nameArray = name.toCharArray();
          
          Set<Character> setName = new HashSet<Character>();
          for(char c:nameArray)
          {
        	  if(c!=' ')
        	  {
        	  setName.add(c);
        	  
          }
        	  
        	  }
         // System.out.println(setName); // this way we can print values of set with commas and braces
		
          for(char uniq:setName)// Iteration is to print values of set. 
        	  System.out.print(uniq);
        
	}
	
	

}
