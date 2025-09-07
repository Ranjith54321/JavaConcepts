package org.example.Constructor;

/**
 * Created by Ranjith S on 19/07/25.
 **/

/**
 *  Constructors in Inheritance
 */


// Example - 1: Parent 0-arg Constructor Child: 0-arg Constructor

//public class ConstructorExampleTwo {
//    ConstructorExampleTwo() {
//        System.out.println(" Parent 0-arg Constructor");
//    }
//}
//
//class Child extends ConstructorExampleTwo {
//    Child() {
//        System.out.println(" child 0-arg Constructor");
//    }
//
//    public static void main(String[] args) {
//        System.out.println(" child main method ");
//        new Child();
//    }
//}

// Example - 2: Parent 1-arg Constructor Child: 0-arg Constructor

//public class ConstructorExampleTwo {
//    ConstructorExampleTwo(int a) {
//        System.out.println(" Parent 1-arg Constructor");
//    }
//}
//
//class Child extends ConstructorExampleTwo {
//    Child() {
//        super(1); // by default super get's called first by compiler. if parent  Constructor is 0 arg, then compiler will handle otherwise we have to call it manually.
//        System.out.println(" child 0-arg Constructor");
//    }
//
//    public static void main(String[] args) {
//        System.out.println(" child main method ");
//        new Child();
//    }
//}


// Example - 3: Parent 0-arg Constructor and Parent 1-arg Constructor Child: 0-arg Constructor

//public class ConstructorExampleTwo {
//
//    ConstructorExampleTwo() {
//        System.out.println(" Parent 0-arg Constructor");
//    }
//    ConstructorExampleTwo(int a) {
//        System.out.println(" Parent 1-arg Constructor");
//    }
//}
//
//class Child extends ConstructorExampleTwo {
//    Child() {
//        // here, super() get's called by java internally, since we have 0-arg
//        System.out.println(" child 0-arg Constructor");
//    }
//
//    public static void main(String[] args) {
//        System.out.println(" child main method ");
//        new Child();
//    }
//}



// Example - 4: Parent default 0-arg Constructor, Child: 0-arg Constructor

//public class ConstructorExampleTwo {
//}
//
//class Child extends ConstructorExampleTwo {
//    Child() {
//        // here, super() get's called by compiler internally, since we have 0-arg
//        System.out.println(" child 0-arg Constructor");
//    }
//
//    public static void main(String[] args) {
//        System.out.println(" child main method ");
//        new Child();
//    }
//}


// Example - 5: Parent 0-arg Constructor, Child: default 0-arg Constructor

public class ConstructorExampleTwo {

    ConstructorExampleTwo() {
        System.out.println(" Parent 0-arg Constructor");
    }

}

class Child extends ConstructorExampleTwo {

    public static void main(String[] args) {
        System.out.println(" child main method ");
        new Child();
    }
}