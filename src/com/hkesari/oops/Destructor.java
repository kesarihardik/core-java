package com.hkesari.oops;

//There is no destructor in java. Memory management is done by garbage collector.
//it is up to garbage collector when to remove objects.
//Closest we have is a finalize method.
public class Destructor {

    public static void main(String[] args){
      Destructor de = new Destructor();
      System.out.println(de.hashCode());
      de = null;
      System.gc();                    //calling garbage collector
         System.out.println("end of garbage collection");
    }

    ///deprecated now
//    @Override
//    protected void finalize(){
//
//    }

}
