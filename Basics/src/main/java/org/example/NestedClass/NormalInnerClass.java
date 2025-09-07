package org.example.NestedClass;

/**
 * Created by Ranjith S on 20/07/25.
 **/

class Outer{
    int a=10;
    int b=555;

    private int c=30;
    void m1(){
        System.out.println(" outer m1 ");
    }

    class Inner{
        int x=200;
        int y=300;
        void m2(){
            System.out.println(" inner m2 ");

            System.out.println(" accessing outer properties a : " + a);

            System.out.println(" accessing outer properties b : " + b);

            System.out.println(" accessing outer private properti c : " + c);

            m1();
        }
    }
}
public class NormalInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();   // 1.) create obj for outer class
        Outer.Inner i = o.new Inner(); // create Inner class obj with the help of outer class

        System.out.println(" outer a : " + o.a);
        System.out.println(" outer b : " + o.b);

        o.m1();
        // o.m2(); // by using outer obj we only can access Outer class Properties

        System.out.println(" inner x : " + i.x);
        System.out.println(" inner y : " + i.y);
        i.m2();

//        i.m1(); // can not access out properties or methods
//        System.out.println(" inner y : " + i.a);
    }
}