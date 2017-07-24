package ru.gothmog.bookstore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author d.grushetskiy
 */
@Configuration
@EnableTransactionManagement
@ComponentScan({"ru.gothmog.bookstore.config"})
@PropertySource(value = {"classpath:db.properties"})
@EnableJpaRepositories(basePackages = {"ru.gothmog.bookstore.repository"}, entityManagerFactoryRef = "entityManagerFactoryBean")
public class DataConfig {


}
