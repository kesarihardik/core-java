package com.hkesari.oops;



interface A1{void foo();}
interface A2{void foo();}
//interface A2{int foo();}              //compile time error          since foo is incompatible with implementation.

interface AA extends A1,A2{};
public class InterfaceCasting {
   public static void main(String[] args){
       AA obj = ()->{
           System.out.println("Hi there.");
       };
       obj.foo();
       ((A1)obj).foo();                //casting as A1

       A1 o2 = (A1)obj;

   }
}
