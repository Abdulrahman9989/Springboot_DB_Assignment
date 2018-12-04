package Assignment.J.SStudents;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentsService {
	
	@Autowired
	private StudentsRepository studentsRepository;
	
	public students getStudent(String studentId) {
		return studentsRepository.findOne(studentId);
	}
	
	public List<students> getAllStudents(){
		List<students> stu = new ArrayList<>();
		studentsRepository.findAll().forEach(stu::add);
		return stu;
	}
	/*
	#	save() method could be used to add new element into database 
		or update one of the current elements. and that depends on the primary key.
	# if PK exist, update this row. Else, add new row	
	*/
	public void addStudent(students stu) {
		studentsRepository.save(stu);
	}

	public void updateStudent(String id, students stu) {
		studentsRepository.save(stu);
	}

	public void deletStudent(String id) {
		studentsRepository.delete(id);
	}
}
