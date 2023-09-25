package com.hkesari.oops;

/*
 constructors                            -- special methods to instantiate methods. helpful in assigning values to obj members
                                         using constructor we can tell about dependencies and initialise object with default values.
types of constructors                       default, parameterized, non-parameterized, copy

can constructors be final?                -- Constructors are not inherited. hence they can't be final.

When is default constructor made by compiler?                  -- if we don't make our own constructor

default constructor invokes super class;
*/

class Dog {
    //data members
    String name;
    String breed;
    int age;

    //we have overloaded constructors below e.g. of compile time polymorphism

    //non parameterized constructor
    Dog() {
        System.out.println("No parameter constructor called.");
    }

    //parameterized constructor
    Dog(String name, int age, String breed) {
        System.out.println("Parameterized constructor called");

        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    //Copy constructor
    public Dog(Dog d) {
        System.out.println("Copy constructor called");

        this.name = d.name;
        this.age = d.age;
        this.breed = d.breed;
    }

    //methods
    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getAge() {
        return this.age;
    }

    //function overloading
    public void getInfo() {
        System.out.println("My name is " + this.name + ". My age and breed are " + this.age + " and " + this.breed);
    }

    public void getInfo(String name, int age, String breed) {
        System.out.println("My name is " + name + ". My age and breed are " + age + " and " + breed);
    }

    public void getInfo(String name, String breed) {
        System.out.println("My name is " + name + ". My breed is " + breed);
    }

}
public class Constructors {
    public static void main(String args[]){
        Dog d1 = new Dog();
        d1.name = "Kalu";
        d1.age=5;
        d1.breed="German Shephard";
        d1.getInfo();

        //assigning values using constructors
        Dog d2 = new Dog("lucy",2,"lebra");
        d2.getInfo();

        Dog d3 = new Dog (d2);       //calling copy constructor
        d1.getInfo();

        //function overloading      //compile time polymorphism
        d1.getInfo();
        d2.getInfo(d2.name,d2.breed);
    }

}
