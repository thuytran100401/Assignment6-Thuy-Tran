
/**
 * MethodTest class:
 *  Implement a generic method called count() to count the number of elements
 *      in a list of generic elements.
 *  Inside the main() method create an ArrayList of 5 String objects, 
 *      6 Integer objects, and 8 Double objects.
 *  Make three different calls to the count() method, once for each
 *       of the three lists, and print the result.
 * 
 * @author Thuy Tran
 * April 24, 2022
 */

import java.util.ArrayList;
import java.util.List;

public class MethodTest {
    public static <E> int count(List<E> list) {
        int count = 0;
        for (E i : list) {
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {

        // Add list String
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Hi");
        stringList.add("Thuy");
        stringList.add("pink");
        stringList.add("black");
        stringList.add("Lisa");

        // Add list Integer
        ArrayList<Integer> intergerList = new ArrayList<Integer>();
        intergerList.add(3);
        intergerList.add(4);
        intergerList.add(10);
        intergerList.add(11);
        intergerList.add(12);
        intergerList.add(5);

        // Add list double
        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(1.90);
        doubleList.add(4.76);
        doubleList.add(100.09);
        doubleList.add(200.89);
        doubleList.add(10.80);
        doubleList.add(11.67);
        doubleList.add(45.8976);
        doubleList.add(78.975);

        // Print
        System.out.println("Total elements in the list of String: " + count(stringList));
        System.out.println("Total elements in the list of Integer: " + count(intergerList));
        System.out.println("Total elements in the list of Double: " + count(doubleList));

    }
}