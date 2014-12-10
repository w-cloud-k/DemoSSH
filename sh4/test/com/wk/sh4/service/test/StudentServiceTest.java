package com.wk.sh4.service.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wyk.sh4.domain.Student;
import com.wyk.sh4.service.IStudentService;

public class StudentServiceTest {

	private static ApplicationContext apc = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	private IStudentService stuService = (IStudentService) apc.getBean("studentService");
	@Test
	public void testAdd(){
		Student stu = new Student();
		stu.setUsername("zsmj001");
		stu.setPwd("123456");
		
		stuService.add(stu);
	}
	@Test
	public void testCheckStudent(){
		Student stu = new Student();
		stu.setUsername("xb");
		stu.setPwd("123456");
		
		System.out.println(stuService.checkStudent(stu));
	}
	@Test
	public void testFindByName(){
		Boolean stu = stuService.studentExsit("longdd");
		System.out.println(stu);
	}
}
