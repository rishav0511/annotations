package com.rishav.annotations;

import org.springframework.stereotype.Component;

@Component
public class Principal {
    public void principalInfo()
    {
        System.out.println("I am your new principal.");
    }
}
