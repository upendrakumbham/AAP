package uk.ac.ebi.tsi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AapDataModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(AapDataModelApplication.class, args);
//		UserRepository userRepo = new UserRepositoryImpl();
//		System.out.print("user information:"+userRepo.getUser());
	}
}
