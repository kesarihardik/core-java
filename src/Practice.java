import java.util.ArrayList;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Practice {
    public static void main(String[] args){

     Predicate<Integer> isEven = x->x%2==0;

     Consumer<Object> p = System.out::print;
     Supplier<Double> s =  Math::random;


    }
}
