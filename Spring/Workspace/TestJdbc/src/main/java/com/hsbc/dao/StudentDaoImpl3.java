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
public class StudentDaoImpl3 implements StudentDao {
	@Autowired
	private JdbcTemplate template;

	@Override
	public boolean createStudent(Student student) {
		String sql = "Insert into Students(Student_Id, Student_Name, Student_Score) Values(?, ?, ?)";
		int updated = template.update(sql, student.getStudentId(), student.getStudentName(), student.getStudentScore());
		if (updated == 1)
			return true;
		else
			return false;
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
		String sql = "Select * From Students";
		List<Student> list = template.query(sql, (rs, rn) -> {
			Student student = null;
			//if (rs.next()) 
			{
				student = new Student();
				student.setStudentId(rs.getInt("Student_Id"));
				student.setStudentName(rs.getString("Student_Name"));
				student.setStudentScore(rs.getDouble("Student_Score"));
			}
			return student;
		});
		return list;
	}

}
