package week3Day2Assignements;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String text ="We learn java basics as part of java sessions in java week1";
		int count;
		String[] sp = text.split(" ");
		System.out.println("after removing duplciates");
		for (int i=0;i<sp.length;i++)
		{
			count=1;
			for(int j=i+1;j<sp.length;j++)
			{
				if(sp[i].equalsIgnoreCase(sp[j]))
				count++;

			}
			   if(count>1)
				   sp[i]="";
			System.out.print(sp[i]+" ");
			
			}
			
		}
	
		}
	
	

