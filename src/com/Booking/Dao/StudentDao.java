package com.Booking.Dao;
import java.util.List;

import com.Booking.Model.Student; 

public interface StudentDao {
	
	  
       public Student selectStudent(Student student);
       
       public void registerStudent(Student student);
       
       public List<Student> showStudent();
}
