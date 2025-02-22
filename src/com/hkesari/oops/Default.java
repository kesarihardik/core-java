package com.hkesari.oops;

// How is default method useful.                --allows backward compatibility
/*
Java 8 allows to implement default implementation of methods. This allows us to add functionality to
interfaces without breaking existing code. (child classes don't have to implement the default method);

default methods can be over-ridden. Hence, can't be private or static, final.
*/

interface Intf1{
     default void foo(){
        System.out.println("Interface 1 method.");
    }
}

interface Intf2 {
    default void foo(){
        System.out.println("Interface 2 method.");
    }
}

class DemoClass implements Intf2, Intf1{
  @Override
    public void foo(){
      Intf1.super.foo();
  }                             //InterfaceName.super.method();
}

public class Default {
    public static void main(String[] args) {
        Intf2 A  = new DemoClass();
        A.foo();

        DemoClass D = new DemoClass();
        D.foo();
    }
}
