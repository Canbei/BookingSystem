package com.Booking.Action;

import java.util.List;

import com.Booking.Model.Student;
import com.Booking.Service.StudentService;

public class ShowAction {
	    private List<Student> student;	
		public String show() throws Exception {
			     StudentService studentservice = new StudentService();			     
			     String ret = "showSuccess";	
			     try{
			     setStudent(studentservice.showStudent());
			     return ret;
			     }catch(Exception e){
			        e.printStackTrace();
			        ret = "showFailure";
				    return ret;		   
			     }

			   }
		public List<Student> getStudent() {
			return student;
		}
		public void setStudent(List<Student> student) {
			this.student = student;
		} 

}
