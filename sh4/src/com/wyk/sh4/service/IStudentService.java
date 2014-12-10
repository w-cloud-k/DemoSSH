package com.wyk.sh4.service;

import com.wyk.sh4.base.service.IBaseService;
import com.wyk.sh4.domain.Student;
/**
 * Student接口
 * @author yk-Woo
 *
 */
public interface IStudentService extends IBaseService<Student>{

	/**
	 * 判断用户是否已经存在
	 * @param userName
	 * @return Boolean
	 */
	public Boolean studentExsit(String userName);
	/**
	 * 判断用户信息是否正确
	 * @param stu
	 * @return Boolean
	 */
	public Boolean checkStudent(Student stu);
	
}
