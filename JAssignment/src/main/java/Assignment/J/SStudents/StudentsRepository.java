/*
 # 	this interface used to extend CrudRepository in order to use its built in methods 
  	to interact with database. such as findOne(), save(), delete(), ...etc.
 
*/

package Assignment.J.SStudents;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Assignment.J.SStudents.students;

@Repository
public interface StudentsRepository extends CrudRepository<students, String>{

}
