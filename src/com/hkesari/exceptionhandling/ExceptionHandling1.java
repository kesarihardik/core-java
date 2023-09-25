package com.hkesari.exceptionhandling;
/*
Exception -            unexpected/unwarranted error or event while runtime that disrupts the normal flow of program

error vs exception
                     --both belong to throwable object in java.
                     --errors belong to Error class, exception belong to Exception class.
                     -- errors are beyond the scope of program. They can't be recovered from.
                      --we handle exception. errors are beyond application scope.
                      ---errors are always of unchecked types. exceptions are of checked and unchecked types.

exception types -                        -- built in , user defined
                                         -- built in has 2 types
                                         checked/ compile time(interrupted exception, class not found, file not found, sql)
                                         unchecked / runtime (null pointer, arithmetic,array out of bound)
*/


public class ExceptionHandling1 {

    public static void main(String[] args) {

        int a = 5;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }

        String s = null;
        try{
            System.out.println(s.length());
        }
        catch(Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            throw e;
        }
        finally {
            System.out.println("This was the example.");
        }

    }
}
