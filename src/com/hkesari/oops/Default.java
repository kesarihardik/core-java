package com.hkesari.oops;

//default - allows to define implementation in interfaces in java.

interface Intf1{
    default void foo(){
        System.out.println("HI");
    }
}

interface Intf2{
    default void foo(){
        System.out.println("Hello");
    }
}

class DemoClass implements Intf1, Intf2{
   @Override
    public void foo(){
       Intf2.super.foo();
   }
}



public class Default {
    public static void main(String[] args) {
        Intf2 A  = new DemoClass();
        A.foo();

        DemoClass D = new DemoClass();
        D.foo();
    }

}
