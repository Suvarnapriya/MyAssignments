package week3Day2Assignements;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] companies = {"HCL","Wipro","Aspire Systems","CTS"};
		System.out.println(companies.length);
		Arrays.sort(companies);
		System.out.println("After Sorting:");
	for (String s:companies)
		System.out.println(s);
	System.out.println("Reverse order of sorted Array:");
	for(int i=companies.length-1;i>=0;i--)
	{
		System.out.println(companies[i]);
	}
	}

}
