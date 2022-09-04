package com.rishav.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("I am your math teacher");
    }
}
