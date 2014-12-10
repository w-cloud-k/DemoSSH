package com.wyk.sh4.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wyk.sh4.base.dao.impl.BaseDAO;
import com.wyk.sh4.dao.IStudentDAO;
import com.wyk.sh4.domain.Student;
/**
 * 实体DAO，完成实体对应的特殊操作
 * @author yk-Woo
 *
 */
@Repository
public class StudentDAO  extends BaseDAO<Student> implements IStudentDAO{

	@Override
	public List<Student> findByUsername(String userName) {
		Map params = new HashMap();
		params.put("username", userName);
		
		List list = new ArrayList();
		list = this.getJpaTemplate().findByNamedParams("select c from Student c where c.username = :username", params);
		return list;
		
	}

	@Override
	public List<Student> findByUsernameAndPwd(Student stu) {
		Map params = new HashMap();
		params.put("username", stu.getUsername());
		params.put("pwd", stu.getPwd());
		
		
		List list = new ArrayList();
		list = this.getJpaTemplate().findByNamedParams("select c from Student c where c.username = :username and c.pwd = :pwd", params);
		return list;
	}

	

}
