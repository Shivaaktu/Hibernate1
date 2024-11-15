package com.shiva.package1;

import java.util.Iterator;
import java.util.List;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student s1=new Student(2,20,"shva",234567);
		
		StudentDao sd=new StudentDao();
		
		List<Student> l1=sd.getAllStudent();
		
		System.out.println("Student list is created and stored");
		
		System.out.println("Now displaying data");
		
		Iterator<Student> itr=l1.iterator();
		
		while(itr.hasNext()) {
			Student s1=itr.next();
			if(s1.getAge()!=26)
			System.out.println(s1.toString());
		}
		
		System.out.println("All student displayed");
		System.out.println("The end");

	}

}
