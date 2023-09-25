package com.hkesari.oops;
/*
constructor chaining                 calling one constructor through another w.r.t current object.
                                       helps code being more readable while having multiple constructor (constructor overloading)

this() -                         current object constructor,
super() -                          base class constructor.

this()(constructor call) / super should be the first statement in the  block.
 */

class Aa{
    public Aa(){
        this("Hardik");
        System.out.println("Inside no parameterized constructor of class A");
    }

    public Aa(String fName){
        this("Hardik","Kesari");
        System.out.println("Inside parameterized constructor of class A");
        System.out.println("My name is " + fName );
    }

    public Aa(String fName, String lName){
        System.out.println("Inside parameterized constructor  of class A(2 parameters)");
        System.out.println("My name is " + fName +" "+ lName);
    }
}

class B extends Aa{
    B(){
        super();
        System.out.println("Inside no parameterized constructor B");
    }
    B(String fName){
        super("Hardik");
        System.out.println("Inside parameterized constructor of B");
    }
}

public class ConstructorChaining {
    public static void main(String[] args ){
        Aa obj = new Aa();

        B o2 = new B();

    }

}
