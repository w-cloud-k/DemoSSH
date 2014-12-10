package com.wyk.sh4.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wyk.sh4.dao.IStudentDAO;
import com.wyk.sh4.domain.Student;
import com.wyk.sh4.service.IStudentService;
/**
 * 业务层，处理业务逻辑
 * @author yk-Woo
 *
 */
@Service
@Transactional
public class StudentService implements IStudentService {

	@Resource
	private IStudentDAO StudentDAO;
	@Override
	public void add(Student entity) {
		this.StudentDAO.add(entity);
	}

	@Override
	public void update(Student entity) {
		this.StudentDAO.update(entity);
	}

	@Override
	public void delete(Long[] ids) {
		this.StudentDAO.delete(ids);
	}

	@Override
	public Student getById(Long id) {
		return this.StudentDAO.getById(id);
	}

	@Override
	public List<Student> getByIds(List ids) {
		return this.StudentDAO.getByIds(ids);
	}

	@Override
	public Boolean studentExsit(String userName) {
		List<Student> stu = this.StudentDAO.findByUsername(userName);
		if(stu.size()>0){
			return true;
		}else return false;
	}

	@Override
	public Boolean checkStudent(Student stu) {
		List<Student> list = this.StudentDAO.findByUsernameAndPwd(stu);
		if(list.size()>0){
			return true;
		}else return false;
	}

}
