package com.rishav.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.rishav.annotations")
@PropertySource("file:src/main/java/com/rishav/annotations/college-info.properties")
public class CollegeConfig {

    /*
    @Bean
    public Teacher mathTecherBean()
    {
        return new MathTeacher();
    }

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
        college.setTeacher(mathTecherBean());
        return college;
    }
    */
}
