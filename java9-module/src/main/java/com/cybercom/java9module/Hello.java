package com.cybercom.java9module;

public class Hello {

    public String greet() {

        return "from Java9 module "
                + "calling "
                + new com.cybercom.foo.Hello().greet();
//                + " and " + new com.cybercom.bar.Hello().greet();
    }
}
