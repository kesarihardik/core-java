//Transfer objects over network, channel.        --serialize them
//serialize objects -> transfer -> deserialize . this will create exactly same obj on the other end with same state.

//Serialization : obj -> stream of bytes
//Deserialization : stream of bytes -> objects

//serializable interface ->
//FileOutputStream -  stream -> file.
//ObjectOutputStream - primitive data types and objects -> stream
//writeObject and readObject -> close


package com.hkesari.serialization;

import java.io.*;

class User implements Serializable {
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
