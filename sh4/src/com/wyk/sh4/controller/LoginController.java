package com.wyk.sh4.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wyk.sh4.domain.Student;
import com.wyk.sh4.service.IStudentService;
@Controller
@RequestMapping("/umg")
public class LoginController {

	@Resource
	IStudentService studentService;
	
	
	@RequestMapping("/tologin")
	public String toLogin(){
		return "web/umg/Login";
	}
	
	@ResponseBody
	@RequestMapping(value="/login",produces = {"application/json;charset=UTF-8"})
	public String login(Student stu,HttpSession session){
		JSONObject jsonLogin = new JSONObject();
		Boolean loginInfo = true;
		if(this.studentService.checkStudent(stu)){
			session.setAttribute("student", stu);
		}else{
			loginInfo = false;
			jsonLogin.put("errorInfo", "用户名或密码错误!");
		}
		jsonLogin.put("result",loginInfo);
		
		return jsonLogin.toString();
	}
	@RequestMapping(value="/list",produces = {"application/json;charset=UTF-8"})
	public String list(){
		return "web/umg/Management";
	}
}
