package org.niit.config;

import org.niit.domain.Movie;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("details")
    public Movie getDetails(){
        return  new Movie("Avtar-2","Adventure","abc","14-12-2022",2500,4.8,"James Cameron");
    }
}
