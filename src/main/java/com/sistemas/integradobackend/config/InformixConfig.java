package com.sistemas.integradobackend.config;
import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "socioEntityManagerFactory", transactionManagerRef = "socioTransactionManager", basePackages = {
        "com.sistemas.integradobackend.informix.repositories" })
public class InformixConfig {

    @Autowired
    private Environment env;

    @Bean(name = "socioDataSource")
    public DataSource comercioDatasource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(env.getProperty("informix.datasource.url"));
        dataSource.setUsername(env.getProperty("informix.datasource.username"));
        dataSource.setPassword(env.getProperty("informix.datasource.password"));
        return dataSource;
    }

    @Bean(name = "socioEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(comercioDatasource());
        em.setPackagesToScan("com.sistemas.integradobackend.informix.entities");

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);

        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.show-sql", env.getProperty("informix.jpa.show-sql"));
        //properties.put("hibernate.dialect", env.getProperty("org.hibernate.dialect.InformixDialect"));
        properties.put("hibernate.dialect", env.getProperty("informix.jpa.database-platform"));

        em.setJpaPropertyMap(properties);
        return em;
    }

    @Bean(name = "socioTransactionManager")
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }
}
