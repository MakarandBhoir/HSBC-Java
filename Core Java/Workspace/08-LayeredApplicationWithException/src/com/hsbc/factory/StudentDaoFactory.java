package com.hsbc.factory;

import com.hsbc.dao.StudentDao;
import com.hsbc.dao.StudentDaoImpl;
import com.hsbc.dao.StudentDaoImpl2;

public class StudentDaoFactory {
	public static StudentDao createStudentDao(int ch) {
		StudentDao dao=null;
		if(ch == 1)
			dao = new StudentDaoImpl(); // store data into array
		else if(ch == 2)
			dao = new StudentDaoImpl2(); // consider, store data into database 
		
		return dao;
	}
}
