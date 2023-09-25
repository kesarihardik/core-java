package com.hkesari.oops;

//Lambda surpass the need to implement functional interface creating a derived class.
//lambdas give clear and concise way to represent functional interface.

//Functional Interface:                interface with exactly one abstract method
//but there can be default and inherited methods.

@FunctionalInterface                                    //informative annotation
interface A{
    void show();                                      //non-overriding abstract method
    //void talk();                                     //err . only 1 abstract method allowed.
    String toString();                               // default methods already has implementation.//every class in java extends from Object class//
}

/*
we can avoid making classes for implementing interface methods.

class B implements A{
    public void show(){
        System.out.println("Hi there");
    }
}
*/

public class Lambda {
  public static void main(String[] args){

      /* anonymous inner class */
     A obj = new A() {
         @Override
         public void show() {
             System.out.println("Hi, This is anonymous inner class.");
         }
     };
     obj.show();


     //lambda expression
     A ob = ()-> System.out.println("Hi, This is lambda expression.");
     ob.show();
  }

}

