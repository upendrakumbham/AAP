package uk.ac.ebi.tsi.app.repository;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import uk.ac.ebi.tsi.app.repository.model.Domain;

/**
 * Created by ukumbham on 30/05/2016.
 */
@Configuration
@ComponentScan(basePackages = "uk.ac.ebi.tsi.app")
@Repository
@EnableJpaRepositories
public interface DomainRepository extends JpaRepository<Domain,Long> {


    //Domain domain = new Domain("mydomain","my descp");

    @Override
    public Domain save(Domain domain);


}
