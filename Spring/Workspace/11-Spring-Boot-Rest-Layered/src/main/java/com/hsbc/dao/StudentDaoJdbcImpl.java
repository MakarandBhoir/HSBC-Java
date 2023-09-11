package com.hsbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.model.Student;
@Repository
@Primary
public class StudentDaoJdbcImpl implements StudentDao {
	@Autowired
	private JdbcTemplate template;

	@Override
	public boolean createStudent(Student student) {
		String query = "Insert into Students(Student_Id, Student_Name, Student_Score) values(?, ?, ?)";
		int result = template.update(query, student.getStudentId(), student.getStudentName(),
				student.getStudentScore());

		return result == 1 ? true : false;
	}

	@Override
	public Student readStudent(int studentId) throws NoSuchStudentException {
		return null;
	}

	@Override
	public boolean deleteStudent(int studentId) {
		return false;
	}

	@Override
	public Student updateStudent(int studentId, Student student) {
		return null;
	}

	@Override
	public List<Student> readAllStudents() {
		String query = "select * from students";
		List<Student> list = template.query(query, new StudentRowMapper());
		return list;
	}
}








