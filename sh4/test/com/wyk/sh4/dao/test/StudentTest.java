package com.wyk.sh4.dao.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.JpaTemplate;

import com.wyk.sh4.dao.IStudentDAO;
import com.wyk.sh4.dao.impl.StudentDAO;
import com.wyk.sh4.domain.Student;


public class StudentTest {

	private static ApplicationContext apc = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	@Test
	public void testSave(){
		IStudentDAO stuDAO = (IStudentDAO) apc.getBean("studentDAO");
		
		Student stu = new Student();
		stu.setUsername("zhangsan");
		stu.setPwd("123456");
		stuDAO.add(stu);
		
//		JpaTemplate jpaTemplate = ((JpaTemplate)apc.getBean("jpaTemplate"));
//		EntityManager em = jpaTemplate.getEntityManagerFactory().createEntityManager();
//		em.getTransaction().begin();
//		em.persist(stu);
//		em.getTransaction().commit();
		System.out.println(stu.getId());
		
	}
	@Test
	public void testUpdate(){
		IStudentDAO stuDAO = (IStudentDAO) apc.getBean("studentDAO");
		
		Student stu = new Student();
		stu = stuDAO.getById(1L);
		stu.setUsername("longdd");
		stuDAO.update(stu);
	}
	@Test
	public void testGetByIds(){
		IStudentDAO stuDAO = (IStudentDAO) apc.getBean("studentDAO");
		List ids = new ArrayList();
		ids.add(1L);
		ids.add(2L);
		List<Student> stuList = stuDAO.getByIds(ids);
		for(Student stu : stuList){
			System.out.println(stu.getUsername());
		}
	}
	@Test
	public void testFindStudent(){
		Student stu = new Student();
		stu.setUsername("longdd");
		stu.setPwd("123456");
		IStudentDAO stuDAO = (IStudentDAO) apc.getBean("studentDAO");

		
	}
	@Test
	public void testFindByStudent(){
		IStudentDAO stuDAO = (IStudentDAO) apc.getBean("studentDAO");

		
	}
}
