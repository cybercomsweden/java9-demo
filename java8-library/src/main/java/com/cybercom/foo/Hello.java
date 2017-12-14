package com.cybercom.foo;

import sun.misc.Unsafe;

public class Hello {

    public String greet() {
        
        return "version " + Unsafe.ADDRESS_SIZE;
    }
}
