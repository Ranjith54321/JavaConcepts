package GenericsExamples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ranjith S on 14/10/24.
 **/

class Vehicle {}
class Car extends Vehicle {}
class Bus extends Vehicle {}

class Print {

    public void computeList(List<? extends Number> n, List<? extends CharSequence> s) {
        //
    }

    public <T extends Number> void computeListOne(T t, T t1) {
        System.out.println("compute");
    }
}


public class Main {
    public static void main(String[] args) {
        List<Number> source =  new ArrayList<>();
        List<String> destination =  new ArrayList<>();

        Print print = new Print();
        print.computeList(source, destination);

        Integer n = 3;
        String s = "jj";
//       print.computeListOne(n, s); // now we can not pass different types.

    }
}



