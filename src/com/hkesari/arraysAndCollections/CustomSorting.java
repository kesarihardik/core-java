package com.hkesari.arraysAndCollections;
import java.util.*;

//How many ways to custom sort ?                                                  --using Comparators or Comparable interfaces.
class Employee implements  Comparable<Employee>{
    public String name;
    double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(o.salary,this.salary);         //descending order sort
    }
}

public class CustomSorting {
    public static void main(String[] args){
      List<Employee> list = Arrays.asList(
              new Employee("John",300),
              new Employee("Patrick",234),
              new Employee("Shashi",265),
              new Employee("Kavi",123)
      );


      //using Comparable
//        Collections.sort(list);


        //using Comparator

        Comparator<Employee> EmployeeCompare = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Collections.sort(list,EmployeeCompare);


//      Collections.sort(list,(Employee e1, Employee e2)->{
//          return Double.compare(e1.salary,e2.salary);
//      });

      //lambda
//        Collections.sort(list,(e1,e2)->{
//            return Double.compare(e1.salary, e2.salary);
//        });


      for(Employee e: list){
          System.out.println(e.name +" " + e.salary);
      }

    }
}
