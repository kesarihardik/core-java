package com.hkesari.serialization;

import java.io.*;

/*Serialization = turn objects to byte array/ byte stream. Deserialization is opposite
 * Why?     --- state of object can be shared, saved or transmitted over another network(when memory isn't shared).
 *             save time of recreating deep copy of object often.
 *
 *serialVersionUID =  unique identifier used for version control/ compatibility in the serialization & deserialization process of Java objects.
 */

//serializable interface ->
//FileOutputStream -  stream -> file.
//ObjectOutputStream - primitive data types and objects -> stream
//writeObject and readObject -> close

//transient - makes a field non-serializable.

class User implements Serializable {       //Serializable is marker interface
    String name;
    int age;

    User(String name, int age){
        this.age=age;
        this.name=name;
    }
}
public class Serialization  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User U = new User("John",23);

        FileOutputStream fileOut = new FileOutputStream("user.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(U);
        out.close();
        fileOut.close();


        FileInputStream fileIn = new FileInputStream("user.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        User u2 = (User)in.readObject();
        in.close();
        fileIn.close();

        System.out.println("Serialized obj: " + U);
        System.out.println("Deserialized obj: " + u2);
    }
}
