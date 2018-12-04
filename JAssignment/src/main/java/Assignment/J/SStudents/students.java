/*
 # this class build to represent a table in the database.
 # so class name is the table name and its variables represent table columns 
 
 # this class should contain private variables, default constructor and getters and setters (POJO format). since it needed by spring boot.
 #
*/

package Assignment.J.SStudents;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity									//@Entity defines that this class is mapped into a table
@Table(name = "students")				//@Table used to define the properties of table in DB where this entity -class- will be mapped to.
public class students {
	@Id									// @Id used to identify the primary key
	@Column(name="studentId")			// @Column used to define the properties of column in DB where this variable will be mapped to.
	private String studentId;
	@Column(name="studentName")
	private String studentName;
	@Column(name="studentAge")
	private String studentAge;
	@Column(name="studentUniversity")
	private String studentUniversity;
	@Column(name="studentMajor")
	private String studentMajor;
	@Column(name="studentGPA")
	private String studentGPA;
	
	// default constructor
	public students() {
		
	}
	
	public students(String studentId, String studentName, String studentAge, String studentUniversity,
			String studentMajor, String studentGPA) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentUniversity = studentUniversity;
		this.studentMajor = studentMajor;
		this.studentGPA = studentGPA;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentUniversity() {
		return studentUniversity;
	}

	public void setStudentUniversity(String studentUniversity) {
		this.studentUniversity = studentUniversity;
	}

	public String getStudentMajor() {
		return studentMajor;
	}

	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}

	public String getStudentGPA() {
		return studentGPA;
	}

	public void setStudentGPA(String studentGPA) {
		this.studentGPA = studentGPA;
	}
	
	
	

}
