package uk.ac.ebi.tsi.aap.authorisation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import uk.ac.ebi.tsi.app.repository.DomainRepository;
import uk.ac.ebi.tsi.app.repository.model.Domain;

/**
 * Created by ukumbham on 31/05/2016.
 */

@Service
@ComponentScan(basePackages = "uk.ac.ebi.tsi.app")
public class DomainServiceImpl implements DomainService {
@Autowired
DomainRepository domainRepository;
    
    public Domain addDomain(){
        Domain domain = new Domain();
        domain.setDomainName("service domain");
        domain.setDomainDesc("service domain description");
        Domain domain1 = domainRepository.save(domain);
        return domain1;
    }

}
