package org.example.NestedClass;

/**
 * Created by Ranjith S on 20/07/25.
 **/
public class MethodLocalInnerClass {
}


// Example-1: instance method inner class

class Outer3 {
    void m1(){
        class Inner1{
            void m2(){ System.out.println("Inner class abstract method");}
        }
        new Inner1().m2();
    }
    public static void main(String[] args) {
        new Outer3().m1();
    }
}


// Example-2: static method inner class
class Outer2 {
    static void m1() {
        class Inner1{
            void m2(){ System.out.println("Inner class abstract method");}
        }
        new Inner1().m2();
    }
    public static void main(String[] args) {
        Outer2.m1();
    }
}

