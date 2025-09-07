package org.example;

/**
 * Created by Ranjith S on 19/07/25.
 **/

// Example - 1: Final Method overriding not possible:
//public class OverridingExample {
//    final void m1() {
//        System.out.println(" Parent m1");
//    }
//}
//
//class Child extends OverridingExample {
//    void m1() { // this will show error
//        System.out.println(" Parent m2");
//    }
//
//    public static void main(String[] args) {
//
//    }
//}

// Example - 2: static Method overriding not possible:
//public class OverridingExample {
//    static void m1() {
//        System.out.println(" Parent m1");
//    }
//}
//
//class Child extends OverridingExample {
//    /**
//     * this will show error when you declare:
//     *  void m1()
//     *
//     *  But, when you declare:
//     *      static void m1()
//     *
//     *      this method belongs to purely Child class. this is not overriding.
//     */
//    static void m1() {
//        System.out.println(" Parent m2");
//    }
//
//    public static void main(String[] args) {
//
//    }
//}


// Example - 3: private Method overriding not possible:

//public class OverridingExample {
//    private void m1() {
//        System.out.println(" Parent m1");
//    }
//}
//
//class Child extends OverridingExample {
//    private void m1() { // this will show error
//        System.out.println(" Parent m2");
//    }
//
//    public static void main(String[] args) {
//        OverridingExample oe = new Child();
//        oe.m1(); // this will restrict here.
//    }
//}

/** Example - 4: Compiler rule: Increasing the access permission means overriding is possible. But If parent is private then not possible for override at all
        -> In the access modifiers table come from top to bottom

    Possibilities:
        default -> protected or default -> public
        protected -> public

*/
public class OverridingExample {
     void m1() {
        System.out.println(" Parent m1");
    }


}

class Child extends OverridingExample {
    protected void m1() {
        System.out.println(" Parent m2");
    }

    public static void main(String[] args) {
        OverridingExample oe = new Child();
        oe.m1(); // this will restrict here.
    }
}