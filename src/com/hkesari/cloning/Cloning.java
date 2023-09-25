package com.hkesari.cloning;

//cloning - creating a copy
//shallow - no new obj created. same object is referenced  / copies the value of references in the class
//deep copy - new object is created and referenced  / copies the actual values
//shallow copy = same object. diff reference.

//cloneable interface
class Value implements Cloneable {
    int value;

    public Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Value v1 = new Value(10);

        Value v2 = v1;                    //shallow copy
        Value v3 = (Value)v1.clone();

        v2.value=14;
        v3.value=15;
        System.out.println(v1.value);

        System.out.println(v1==v2);         //compare references

        System.out.println(v1==v3);
    }
}


