package org.student;

import org.department.Department;
public class Student  extends Department {
	public void studentName() {
		System.out.println("Pandiselvi");
	}
	public void studentDep() {
		System.out.println("IT");
	}
	public void studentId() {
		System.out.println("45678");
	}
	public static void main(String args[]) {
		Student stu =new Student();
		stu.collegeName();
		stu. collegeCode() ;
		stu.collegeRank();
		stu.depName();
		stu.studentName();
		stu.studentDep();
		stu.studentId();
		
	}
}

	

	

	



