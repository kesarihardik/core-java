package com.hkesari.exceptionhandling;
    /*
Exception :  unexpected/unwarranted error or event while runtime that disrupts the normal flow of program

error vs exception -  errors can't be recovered from. they are beyond program control.
         - exceptions are anomalies/ unexpected events in execution which need to be handled gracefully.
         - Error class, Exception class extends Throwable class.

exception types :  built in, user defined
                  built in has 2 types
                         - checked/ compile time(interrupted exception, class not found, file not found, sql)
                         - unchecked / runtime (null pointer, arithmetic,array out of bound)

                         -user defined is always runtime exception.
*/


public class ExceptionHandling {

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
