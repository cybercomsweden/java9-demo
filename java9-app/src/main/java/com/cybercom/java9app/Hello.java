package com.cybercom.java9app;

public class Hello {

    public String greet() {

        return "Hello, "
                + new com.cybercom.java9module.Hello().greet()
                + " with Java 9!";
    }

    public static void main(String[] args) {

        System.out.println(new Hello().greet());
    }
}
