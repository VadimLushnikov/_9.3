package ru.netology.jdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.jdbc.repository.Repository;

@Configuration
public class JavaConfig {
    @Bean
    public Repository repository(){
        Repository repository =  new Repository("script.sql");
        //System.out.println(repository.getSelect());
        return repository;
    }
}
