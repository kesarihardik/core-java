package com.hkesari.cloning;

/*
cloning - creating a copy. types - shallow, deep.
   shallow : same object, diff reference. creates new reference and assigns same object to it.
   deep: creates separate object similar to original.
*/

//cloneable interface - marker interface (interface with empty body). It helps jvm understand which object can call clone() method of Object class.
//clone() method created a deep copy.

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

    @Override
    public String toString() {
        return "Value{" +
                "value=" + value +
                '}';
    }
}
public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Value actualObject = new Value(10);
        Value shallowClone = actualObject;                    //shallow copy
        Value deepClone = (Value) actualObject.clone();        //deep copy

        shallowClone.value = 5;     //modifies actual object
        System.out.printf("\nactual - %s, shallow - %s", actualObject, shallowClone);

        System.out.println(actualObject==deepClone);
        System.out.printf("\nactual - %s, deep - %s", actualObject, deepClone);
    }
}


