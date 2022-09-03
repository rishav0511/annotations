package com.rishav.annotations;

public class College {

    private Principal principal;

    /*public College(Principal principal) {
        this.principal = principal;
    }*/

    public void setPrincipal(Principal principal) {
        this.principal = principal;
        System.out.println("Using setter method");
    }

    public void test() {
        principal.principalInfo();
        System.out.println("Test method");
    }
}
