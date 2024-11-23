package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ranjith S on 23/11/24.
 **/
public class ExampleOne {
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(3000);
        salaryList.add(4100);
        salaryList.add(9000);
        salaryList.add(1000);
        salaryList.add(3500);

        // Normal Approach:
        int count=0;
        for(int salary: salaryList) {
            if(salary > 3000)
                count++;
        }
        System.out.println(" Normal Approcah Total Employees with salary > 3000: " + count);

        // Using Streams:
        long count2 = salaryList.stream().filter((Integer sal) -> sal > 3000).count();

        /**
         Step-1:  initiate the stream. It is done by stream(), which is available in Collection class.
                                                                    List is child of Collection
         Step-2:  intermediate operation: we have filter(),
         Step-3: terminal operation: we have count terminal operation.
         */

        System.out.println(" Stream Approcah Total Employees with salary > 3000: " + count2);
    }
}
