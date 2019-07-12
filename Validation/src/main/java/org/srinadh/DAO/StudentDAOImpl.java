package org.srinadh.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.srinadh.model.Student;
import org.srinadh.repository.StudentRepository;

import com.mysql.cj.xdevapi.SessionFactory;

public class StudentDAOImpl implements StudentDAO {

   
    
    @Autowired
    private StudentRepository studentRepository;
	
	public void CreateStudent(Student stu) {
           studentRepository.save(stu);
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student getStudent(Long id) {
		return studentRepository.getOne(id);
	}

	public Student updateStudent(Student stu) {
		return studentRepository.save(stu);
	}

	public void deleteStudent(Long id) {
		
		studentRepository.deleteById(id);
		

	}

}
