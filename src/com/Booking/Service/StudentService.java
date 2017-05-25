package com.Booking.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.Booking.Dao.StudentDao;
import com.Booking.Model.Student;
import com.Booking.Tool.DBTool;

public class StudentService{
	public Student selectStudent(Student student) {
		SqlSession session=DBTool.getSession();
		try{
         StudentDao mapper=session.getMapper(StudentDao.class);
		 return mapper.selectStudent(student);	
		 }finally{
			 session.close();
		 }
	}
	
	public void registerStudent(Student student) {
		 SqlSession session=DBTool.getSession();	
		 try{		 
             StudentDao mapper=session.getMapper(StudentDao.class);
		     mapper.registerStudent(student);
		     session.commit();
		 }catch(Exception e){
			 e.printStackTrace();
			 session.rollback();
	     }finally{
		     session.close();
	     }
	}
	
	public List<Student> showStudent(){
		 SqlSession session=DBTool.getSession();
		 try{
         StudentDao mapper=session.getMapper(StudentDao.class);
		 return mapper.showStudent();	
	     }finally{
	    	 session.close();
	     }
	}
}
		      
