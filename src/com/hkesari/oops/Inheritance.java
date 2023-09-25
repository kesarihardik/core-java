package com.hkesari.oops;

//Inheritance                -- is a relationship // extends
//What is not inherited?                     --constructors, static variables, instance variables
class Shape {
    String color;

    //only subclasses can access this method.
     protected void area() {
        System.out.println("Displays area");
    }
}

//derived class, children class
//single level inheritance
class Triangle extends Shape{
    public void area(double b, double h) {
       System.out.println(0.5 * b+h );
    }
}

// multilevel inheritance
class EquilateralTriangle extends Triangle{
    public void area(double a){
        System.out.println(Math.sqrt(3)/4 * a*a);
    }

}

//hierarchical inheritance - same class inherited by more than one class
class Circle extends Shape {
    @Override                                              //predefined annotation.
    public void area(){
        System.out.println("Displays circle area");
    }

  public void area(double r){
      System.out.println(3.14 * r*r);
  }
}


public class Inheritance{
    public static void main(String[] args){
        Shape s0 = new Shape();
        s0.area();

        Triangle s1 = new Triangle();
        s1.area(12., 3);
        s1.area();

        EquilateralTriangle s2 = new EquilateralTriangle();
        s2.area(12);

        Shape c = new Circle();  //upcasting
        c.area();
    }
}

