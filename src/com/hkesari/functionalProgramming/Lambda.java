package com.hkesari.functionalProgramming;

/*
Lambda function :  anonymous functions that we can reference and pass around as object.
lambda:  give clear and concise way to represent functional interface, enables functional programming.
         It's a syntactic sugar.
         Using lambda we can avoid making classes for implementing functional interface.
 */

@FunctionalInterface                                   //informative annotation
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

