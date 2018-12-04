/*
# This the main class for this spring boot project. 
# it will be generated automatically by spring boot framework when the project is created.
*/

package Assignment.J;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(JAssignmentApplication.class, args);
	}
}
