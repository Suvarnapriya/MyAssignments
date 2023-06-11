package org.student;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("student id is "+id);
	}
	public void getStudentInfo(int id,String Name)
	{
		System.out.println("Student Id is "+id);
		System.out.println("Student Name is "+Name);
	}
	
	public void getStudentInfo(String email, long phoneNum)
	{
		System.out.println("Student email is "+email);
		System.out.println("Student Phone number is "+phoneNum);
	}
	
	public static void main(String[] args) 
	{
	Students s= new Students();
	s.getStudentInfo(998234);
	s.getStudentInfo(998234, "Rajesh");
    s.getStudentInfo("test@gmail.com", 9848012345l);
	}

}
