package com.hkesari.generics;

/*
Why use Generics ?
                                parameterized types. They allow class,interface and methods to work with different types rather than one specific type.

Benefits of generics --
                    it helps in code re-usability, type safety, no casting required.
                    compile time check  - before generics collections would accept any type. now we can restrict the type.
                    generics cant be used with primitive types.(int, float etc.

If arrays are generic why they work with primitive type?                             -- generics can work with reference types.
*/

import java.util.ArrayList;

class Printer<T>{                //generic class
    T data;

    Printer(T data){
        this.data=data;
    }
    public T getObj(){
        return this.data;
    }
}
public class Generics2 {
    static<T> void display(T element){                    //generic method
        System.out.println(element);
    }

    public static void main(String[] args){
        Printer P1 = new Printer(1233);              //raw use of parameterized class
        System.out.println(P1.getObj());

        Printer<String> P2 = new Printer<>("Kesari");
        display(P2.getObj());

//        Printer<int> P3 = new Printer<>(232);                 //err
//        display(P3.getObj());

          Printer<Integer> P4 = new Printer<>(12);        //Integer is wrapper class.
          display(P4.getObj());


          //compile time safety

        ArrayList al = new ArrayList();
        al.add(12);
        al.add(234);
        al.add("Hard");     //compiler allows this. -> runtime error

        //using generics we can solve this.
        ArrayList<Integer> al2 = new ArrayList<>();    //now cant add string to this.

    }

}
