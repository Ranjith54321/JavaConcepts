package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

/**
 * Created by Ranjith S on 20/07/25.
 **/

interface I1{
    void m1();
}
public class AnonymousInnerClass {
    static I1 a = new I1(){
        public void m1(){System.out.println("interface using anonymous class");} // access modifier is must => public
    };
    public static void main(String[] args) {
//        I1 a = new I1(){
//            public void m1(){System.out.println("interface using anonymous class");} // access modifier is must => public
//        };
        a.m1();
    }
}


class Product{
    int id;
    String name;
    Product(int id,String name){
        this.id = id;
        this.name = name;
    }
}
class Test{
    public static void main(String[] args) {
        HashMap<Integer, Product> lh = new HashMap<Integer, Product>();
        lh.put(1,new Product(111,"ranjith"));
        lh.put(7,new Product(46,"dot"));
        lh.put(555,new Product(746,"doc"));


        System.out.println("Before Delete: ");
        for(Map.Entry<Integer, Product> pro : lh.entrySet()){
            Integer i = pro.getKey();
            Product p = pro.getValue();
            System.out.println("Integer : "+i);
            System.out.println("product :  id : "+p.id+" name: "+p.name);
        }

        // get entry
        Set<Map.Entry<Integer, Product>> en = lh.entrySet();
        Iterator<Map.Entry<Integer, Product>> i = en.iterator();
        // i.add(2,new Product(2,"new_one")); we can not add using iterator
        while(i.hasNext()){
            Map.Entry<Integer, Product> ee = i.next();
            Integer in = ee.getKey();
            Product pp = ee.getValue();
            if(pp.id==746)
                i.remove();
            if(in == 7)
                i.remove();
        }

        // remining
        System.out.println("After Delete: ");
        Set<Map.Entry<Integer, Product>> ent = lh.entrySet();
        Iterator<Map.Entry<Integer, Product>> i2 = ent.iterator();
        while(i2.hasNext()){
            Map.Entry<Integer, Product> ee2 = i2.next();
            Integer in2 = ee2.getKey();
            Product pp2 = ee2.getValue();
            System.out.println("Integer : "+in2);
            System.out.println("product :  id : "+pp2.id+" name: "+pp2.name);
        }
    }
}
