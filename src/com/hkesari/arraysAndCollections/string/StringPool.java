package com.hkesari.arraysAndCollections.string;

/*
  Strings are stored in SCP(string constant pool) or String Intern Pool.
  SCP is part of java heap memory.
  1. literals are reused by jvm. If not present, new literal is created else already existing is referenced. Once no reference to literal is there, it's removed by GC.
  2. new  : forces creation of object outside scp regardless of whether string is in scp or not.
  3. intern() : returns reference of string literal in scp/ creates string in scp if not exist and then returns reference.

  https://www.scaler.com/topics/why-string-is-immutable-in-java/
*/
public class StringPool {
    public static void main(String[] args){

        //  Strings are immutable in Java
        String str = "Hardik";
        System.out.println(str.hashCode());
        str = str +"Kesari";
        System.out.println(str.hashCode());


        String literal1 = "Hello";                               //jvm creates new  literal in scp.
        String literal2 = "Hello";                                //no new literal created.
        System.out.println(literal1 == literal2);

        // new forces creation of strings outside scp.
        String obj1 = new String("Hello");
        String obj2 = new String("Hello");
        System.out.println(obj1 == obj2);
        System.out.println(obj1 == literal2);
        System.out.println(obj2 == literal2);


        //intern return ref of string in scp.
        String obj3 = obj1.intern();
        System.out.println(obj3 == literal1);
    }
}


