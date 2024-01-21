package com.hkesari.oops;
/*
Interface          Methods here have no implementation/ declaration. It contains only method signature/ declaration.
                   Contract : Class inheriting interface must implement those methods.

                   Java 8 allows to define default implementation of methods

Interface can inherit one or more interfaces. --since multiple inheritance works with interfaces.
Interfaces don't have constructor.

Fields inside interface are public,static and final by default.
*/
interface Mammal{
    int eyes = 2;        //static member

    default void sound(){
        System.out.println("Default Sound.");
    }
    void walk();
}


interface Herbivore {
    void travel();
}

 class Lion implements Mammal,Herbivore{                     //Multiple inheritance
    @Override
    public void walk() {
        System.out.println("Lion walks on 4 legs");
    }

     @Override
    public void travel() {
        System.out.println("Lion travels on 4 legs");
    }
}

public class Interface{
    public static void main(String[] args){
        Lion l = new Lion();
        l.walk();
        l.sound();


        System.out.println(l.eyes);            //static member is accessible without object.
    }

}
