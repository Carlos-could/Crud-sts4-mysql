package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class EstudiateApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EstudiateApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		//Student student1 = new Student("Carlos", "Moran", "jjbbpe@gmail.com");
		//studentRepository.save(student1);
		
	}

}
