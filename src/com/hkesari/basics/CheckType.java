package com.hkesari.basics;
import java.util.Scanner;

/*
Check if next input is int, double, float                             --  sc.hasNext,, sc.hasNextInt
                                                                       -- sc.hasNext, sc.hasNextInt, sc.hasNextDouble,
 check string input                         - sc.nextLine();
 take first char                    -    sc.next.charAt(0)
 */

public class CheckType {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string.");
        String  s = sc.nextLine();
        System.out.println(s);

        System.out.println("Please enter numbers");
        while(sc.hasNext()){
            if(sc.hasNextInt())
            {
                int n = sc.nextInt();                                       //don't forget to process it.
                System.out.println("You entered an integer.");
            }
            else{
                System.out.println("Please enter integers.");
                break;
            }
        }
    }

}
