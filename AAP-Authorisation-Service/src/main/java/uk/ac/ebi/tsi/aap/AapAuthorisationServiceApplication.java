package uk.ac.ebi.tsi.aap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uk.ac.ebi.tsi.aap.authorisation.service.DomainServiceImpl;

@SpringBootApplication
public class AapAuthorisationServiceApplication {

	public static void main(String[] args) {

		//UserManager userService = new UserManagerImpl();
		DomainServiceImpl domainService = new DomainServiceImpl();
		SpringApplication.run(AapAuthorisationServiceApplication.class, args);
		System.out.print("excuted......"+domainService.addDomain().getDomainName());
	}
}
