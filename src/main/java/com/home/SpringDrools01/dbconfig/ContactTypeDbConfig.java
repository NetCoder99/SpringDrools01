package com.home.SpringDrools01.dbconfig;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ContactTypeDbConfig {

	@Bean
    @Primary
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties ContactDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    public DataSource ContactDataSource() {
        return ContactDataSourceProperties().initializeDataSourceBuilder().build();
    }
    
}
