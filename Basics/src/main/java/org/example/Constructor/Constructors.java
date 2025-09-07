package org.example.Constructor;

/**
 * Created by Ranjith S on 19/07/25.
 **/
public class Constructors {
    int n;

    Constructors(int n) {

    }

    public static void main(String[] args) {
        /**
         If class don't have any Constructor, then we can create obj using 0-arg Constructor.
         else, create obj using available Constructor in that class.

         in our Constructors class, we have only 1-arg Constructor, so, we have to create obj by using that.
         */

        new Constructors(10);

    }
}
