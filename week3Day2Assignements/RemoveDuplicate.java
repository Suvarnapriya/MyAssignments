package week3Day2Assignements;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String text ="PayPal India";
		String lowerText = text.toLowerCase();
		char[] charArray = lowerText.toCharArray();
		Set<Character>charSet=new LinkedHashSet<Character>();
		Set<Character>dupCharSet= new LinkedHashSet<Character>();
		
		for(char c:charArray)
		{
			if(!charSet.add(c))
			{
				dupCharSet.add(c);
			}
		
		}
		System.out.println("without dupplicates"+charSet);
		System.out.println("Duplicate values"+dupCharSet);
		for(char c2:dupCharSet)
		{
		
			charSet.remove(c2);
		
		}
		System.out.println("Removal of all duplcates"+charSet);
		System.out.println("removal of duplciates including Space ");
		for(char c3:charSet)
		{
			if(c3!=' ')
			
			System.out.print(c3);
			
		}
		

		
		}
	}


