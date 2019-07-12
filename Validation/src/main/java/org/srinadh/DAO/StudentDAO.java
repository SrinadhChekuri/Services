package org.srinadh.DAO;

import java.util.List;

import org.springframework.stereotype.Service;
import org.srinadh.model.Student;

@Service
public interface StudentDAO {
	
	public void CreateStudent(Student stu);
	public List<Student> getAllStudents();
	public Student getStudent(Long stuid);
	public Student updateStudent(Student stu);
	public void deleteStudent(Long stuid);

}
