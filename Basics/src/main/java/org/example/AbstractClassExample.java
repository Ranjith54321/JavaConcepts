package org.example;

/**
 * Created by Ranjith S on 19/07/25.
 **/

// Example-1: Can not create obj for abstract class even it has not abstract methods
//public abstract class AbstractClassExample {
//    public void m1() {
//        System.out.println(" Parent m1");
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
////        AbstractClassExample ae = new AbstractClassExample(); // we will face error here.
//    }
//}


// Example-2: If all the  abstract methods are not overredden by the child class then chils class should be declered as abstract class.
public abstract class AbstractClassExample {
    abstract void m1();
    abstract void m2();
}

abstract class ChildOne extends AbstractClassExample {
    public void m1() {
        System.out.println(" child m1");
    }
}