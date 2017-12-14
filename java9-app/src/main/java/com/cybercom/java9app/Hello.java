package com.cybercom.java9app;

public class Hello {

    public String greet() {

        return "Hello from "
                + new com.cybercom.java9module.Hello().greet()
                + "!";
    }

    public static void main(String[] args) {

        System.out.println(new Hello().greet());
    }
}
