package week3Day2Assignements;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String text="I am a software tester";
		String[] sp = text.split(" ");
		for(int i=0;i<sp.length;i++)
		{
			if(i%2!=0)
			{
				//System.out.println(sp[i]);
				char[] ch = sp[i].toCharArray();
				String rev="";
				for(int j=ch.length-1;j>=0;j--)
				{
					rev=rev+ch[j];
				}
				System.out.println(rev);
			}
			else
			System.out.println(sp[i]);
		}
	
	}
}