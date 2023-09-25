package com.hkesari.exceptionhandling;

//Write a user defined exception class

class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){          //constructor
        super(str);                                  //calling parent constructor
    }
}


public class CustomException {
    public static void validate(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("You are not adult.");
        }else {
            System.out.println("You are allowed to vote.");
        }
    }

    public static void main(String[] args){
        int age = 14;
        try{
            validate(age);
        }
        catch(InvalidAgeException ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("Thank You");
        }
    }
}

