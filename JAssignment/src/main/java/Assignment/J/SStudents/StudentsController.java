/*
 # 	this class "StudentsController" and "studentsService" are used to do REST API methods
 	which are GET,POST,PUT, and DELETE.
 # 	each one of these four common REST API methods is mapped to method in order to update
 	the content of the external database (MySQL)
*/

package Assignment.J.SStudents;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// @RestController annotation used to turn a class into RestFUL controller using spring.
@RestController
public class StudentsController {
	
	@Autowired	// used for automatic dependency injection.
	private studentsService sService;
	
	// this method used to retrieve all data form a table on mysql database 
	@RequestMapping(method=RequestMethod.GET,value= "/Students")
	public List<students> getAllStudents() {
		return sService.getAllStudents();
	}

	// this method used to retrieve one row form a table on mysql database 
	@RequestMapping(method=RequestMethod.GET, value= "/Students/{id}")
	public students getStudent(@PathVariable(value="id") String studentId) {
		return sService.getStudent(studentId);
	}
	
	// this method used to add a new row into a table on mysql database 
	@RequestMapping(method=RequestMethod.POST, value="/Students")
	public void addStudent(@RequestBody students stu) {
		sService.addStudent(stu);
	}
	
	// this method used to update one row from a table on mysql database 
	@RequestMapping(method=RequestMethod.PUT, value="/Students/{id}")
	public void updateStudent(@PathVariable(value="id") String studentId, @RequestBody students stu) {
		sService.updateStudent(studentId, stu);		
	}
	
	// this method used to delete one row from a table on mysql database 
	@RequestMapping(method=RequestMethod.DELETE ,value= "/Students/{studentId}")
	public void deletStudent(@PathVariable String studentId) {
		sService.deletStudent(studentId);
	}
}
