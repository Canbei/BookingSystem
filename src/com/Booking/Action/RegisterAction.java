package com.Booking.Action;

import com.Booking.Model.Student;
import com.Booking.Service.StudentService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction	extends ActionSupport implements ModelDriven<Student>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Student student = new Student();
	
	public String Register() throws Exception{
		 StudentService studentservice = new StudentService();
	     String ret = "registerFailure";		   	         	
	    try{
	    	studentservice.registerStudent(student);
	    	ret = "registerSuccess";
	    	return ret;
	    }catch(Exception e){
	    	e.printStackTrace();
	    	return ret;
	    }	
	}
	
	public Student getModel() {
		
		return this.student;
	}
	
}
