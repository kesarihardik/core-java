package com.hkesari.basics;
//varArgs - variable number of arguments.

public class VarArgs {
    public static int add( int ...a){
        int sum = 0;
        for(int i: a){
            sum+=i;
        }
        return sum;
    }

    //Vararg parameter must be the last parameter. there cant be two varargs in a method.

    public static void main(String[] args) {
        //VarArgs concept
        System.out.println();
        System.out.println(VarArgs.add(1,2));
        System.out.println(VarArgs.add(23,23,23));
    }

}
