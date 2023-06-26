package week3Day2Assignements;

public class Palindrome {

	public static void main(String[] args) {
		
		String word= "madam";
		String rev ="";
		//char[] charArray = word.toCharArray();
		for(int i=word.length()-1;i>=0;i--)
		{
		     rev+=word.charAt(i);//  "+=" operator is used to append each character into the string
	
	}
System.out.println("Reverse String is: " +rev);
		if (word.equals(rev))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}
}
