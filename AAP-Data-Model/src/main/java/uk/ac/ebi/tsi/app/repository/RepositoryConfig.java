package uk.ac.ebi.tsi.app.repository;

/**
 * Created by ukumbham on 30/05/2016.
 */

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"uk.ac.ebi.tsi.app.repository.model"})
@EnableJpaRepositories(basePackages = {"uk.ac.ebi.tsi.app.repository"})
@EnableTransactionManagement
public class RepositoryConfig {

    }