package com.wyk.sh4.dao;

import java.util.List;

import com.wyk.sh4.base.dao.IBaseDAO;
import com.wyk.sh4.domain.Student;
/**
 * Student接口
 * @author yk-Woo
 *
 */
public interface IStudentDAO extends IBaseDAO<Student>{

	/**
	 * 通过用户名查找用户
	 * @param userName
	 * @return Student
	 */
	public List<Student> findByUsername(String userName);
	/**
	 * 判断对象是否存在
	 * @param stu
	 * @return
	 */
	public List<Student> findByUsernameAndPwd(Student stu);
}
