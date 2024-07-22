package org.college;
//Same package Different class
//Child class
public class College {
	//Method 1
	private void collegeName() {
		System.out.println("Paavai Engineering College");
	}
	//Method 2
	private void collegeCode() {
		System.out.println("6221");
	}
	//Method 3
	private void collegeRank() {
		System.out.println("Rank 1");
	}
	//Main method
public static void main(String[] args) {
	//Object creation
	College c = new College();
	c.collegeName();
	College c1 = new College();
	c1.collegeCode();
	College c2 = new College();
	c2.collegeRank();
	Student s = new Student();
	s.studentName();
	Student s1 = new Student();
	s1.studentDept();
	Student s2 = new Student();
	s2.studentId();
	Hostel h = new Hostel();
	h.hostelName();
	Dept d = new Dept();
	d.deptName();
	
	System.out.println("dept");
    }	
}