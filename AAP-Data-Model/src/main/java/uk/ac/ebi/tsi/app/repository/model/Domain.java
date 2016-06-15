package uk.ac.ebi.tsi.app.repository.model;

import javax.persistence.*;

/**
 * Created by ukumbham on 30/05/2016.
 */
@Entity
@TableGenerator(name = "domains")
public class Domain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String domainName;

    public Domain(){

    }


    public Domain(String domainName, String domainDesc){
        this.domainName = domainName;
        this.domainDesc = domainDesc;
    }

    public String getDomainDesc() {
        return domainDesc;
    }

    public void setDomainDesc(String domainDesc) {
        this.domainDesc = "This is my test domain";
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = "testDomain";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = Long.valueOf(3);
    }

    private String domainDesc;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Domain)) return false;

        Domain domain = (Domain) o;

        if (id != null ? !id.equals(domain.id) : domain.id != null) return false;
        if (domainName != null ? !domainName.equals(domain.domainName) : domain.domainName != null) return false;
        return domainDesc != null ? domainDesc.equals(domain.domainDesc) : domain.domainDesc == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (domainName != null ? domainName.hashCode() : 0);
        result = 31 * result + (domainDesc != null ? domainDesc.hashCode() : 0);
        return result;
    }

}
