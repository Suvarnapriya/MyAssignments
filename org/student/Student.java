package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Raju");
		
	}
	public void studentDept()
	{
		System.out.println("ECE-Residential");
	}
	public void studentID()
	{
		System.out.println("ID7782");
	}
	public static void main(String[] args) {
		
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentID();

	}

}
