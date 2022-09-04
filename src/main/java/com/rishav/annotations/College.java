package com.rishav.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

    @Value("${college.Name}")
    private String collegeName;

    @Autowired
    private Principal principal;

    @Autowired
    @Qualifier("scienceTeacher")
    private Teacher teacher;

    /*public College(Principal principal) {
        this.principal = principal;
    }*/

    public void setPrincipal(Principal principal) {
        this.principal = principal;
        System.out.println("Using setter method");
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void test() {
        System.out.println("College name: "+collegeName);
        principal.principalInfo();
        teacher.teach();
        System.out.println("Test method");
    }
}
