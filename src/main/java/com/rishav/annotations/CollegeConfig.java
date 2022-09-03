package com.rishav.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
    @Bean
    public Principal principalBean()    // principalBean - bean ID
    {
        return new Principal();
    }

    @Bean
    public College collegeBean()    // collegeBean - bean ID
    {
        College college = new College();
        college.setPrincipal(principalBean());
        return college;
    }
}
