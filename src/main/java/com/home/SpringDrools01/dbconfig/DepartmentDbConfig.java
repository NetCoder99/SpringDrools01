package com.home.SpringDrools01.dbconfig;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ConfigurationProperties("spring.orcl1.datasource")
//@ConditionalOnProperty(name = "spring.orcl1.datasource")

public class DepartmentDbConfig {
    
    @Bean
    public DataSourceProperties DepartmentDataSourceProperties() {
        return new DataSourceProperties();
    }
    
    @Bean
    public DataSource DepartmentDataSource() {
        return DepartmentDataSourceProperties().initializeDataSourceBuilder().build();
    }
}
