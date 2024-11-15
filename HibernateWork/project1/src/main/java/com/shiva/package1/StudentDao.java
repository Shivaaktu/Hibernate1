package com.shiva.package1;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate1");
	
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public Student insertStudent(Student s1) {
		et.begin();
		em.persist(s1);
		et.commit();
		return s1;
	}
	
	public Student getStudentByid(int id) {
		Student s1=em.find(Student.class,id);
		return s1;
	}
	
	public boolean deleteStudent(int id) {
		Student s1=getStudentByid(id);
		if(s1!=null) {
			et.begin();
			em.remove(s1);
			et.commit();
			return true;
		}
		return false;	
	}
	
	
	public Student updateStudent(int id,String name) {
		Student s1=getStudentByid(id);
		if(s1!=null) {
			s1.setName(name);
			et.begin();
			em.merge(s1);
			et.commit();
			return s1;
		}
		return null;
	}
		
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudent(){
		return em.createQuery("From Student").getResultList();
	}
	
	
	

	
	
}
