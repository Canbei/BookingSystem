package com.Booking.Action;

import java.util.Date;
import java.util.logging.Logger;

import com.Booking.Model.Student;
import com.Booking.Service.StudentService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven; 

public class LoginAction extends ActionSupport implements ModelDriven<Student>{
	/**
	 * 
	 */
	       private static final long serialVersionUID = 1L;
	       private Date currentDate;
           private Student student = new Student();
           static Logger log = Logger.getLogger(LoginAction.class.getName());

           public String Login() throws Exception {
        	 setCurrentDate(new Date());
		     StudentService studentservice = new StudentService();
		     String ret = "loginFailure";		   	         	
		     student = studentservice.selectStudent(student);
		     if(student==null){
			    return ret;		   
		     }
	         log.info("Hello this is an info message");
		    ret = "loginSuccess";
		    return ret;
		   } 


		public Student getModel() {			
			 return this.student;
		}
		
		public void setCurrentDate(Date date){
		     this.currentDate = date;
		}
		
	    public Date getCurrentDate(){
		     return currentDate;
		}

	    public Student getStudent() {
	        return student;
	     }
	     public void setStudent(Student student) {
	        this.student = student;
	     }

 
}