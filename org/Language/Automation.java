package org.Language;

public class Automation extends MultipleLanguage implements TestTool 
{
	public void Java() {
		System.out.println("This is Java Language");
		
	}

	public void Selenium() {
		System.out.println("This is Selenium");
		
	}

	
	public void ruby() {
		System.out.println("This is ruby");
		
	} 

	public static void main(String[] args) 
	{

		Automation a=new Automation();
		a.Java();
		a.python();
		a.Selenium();
		a.ruby();
	}
}
