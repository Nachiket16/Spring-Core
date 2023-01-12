package com.nkspring.core.SpringCoreConcepts.config;

import com.nkspring.core.SpringCoreConcepts.couple.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfig {

    //declaring bean using @Bean

    @Bean(name = "samosa1")
    @Primary
    public Samosa getSamosa1(){
        return new Samosa("Tandoori samosa");
    }

    @Bean(name = "samosa2")
    public Samosa getSamosa(){
        return new Samosa("Meetha Samosa");
    }

}
