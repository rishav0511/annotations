package com.rishav.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
    @Bean
    public College collegeBean()    // collegeBean - bean ID
    {
        College college = new College();
        return college;
    }
}
