package GenericsExamples;

import javax.naming.spi.ObjectFactoryBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ranjith S on 14/10/24.
 **/

class Vehicle {}
class Car extends Vehicle {}
class Bus extends Vehicle {}

class Print {
    public <T extends  Number> void setValue(Number val) {
        //
    }
}


public class Main {
    public static void main(String[] args) {
        List<Number> source =  new ArrayList<>();
        List<Object> destination =  new ArrayList<>();

        Print print = new Print();
        //print.computeList(source, destination);
        
       // print.computeListOne(source, destination); // not accepting

    }
}



