
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
        for (E e : list) {
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {

        // Add list String
        ArrayList<Object> listString = new ArrayList<Object>();
        listString.add("Hit");
        listString.add("Thuy");
        listString.add("pink");
        listString.add("black");
        listString.add("Lisa");

        // Add list Integer
        ArrayList<Object> listInteger = new ArrayList<Object>();
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(10);
        listInteger.add(11);
        listInteger.add(12);
        listInteger.add(5);

        // Add list double
        ArrayList<Object> listDouble = new ArrayList<Object>();
        listDouble.add(1.90);
        listDouble.add(4.76);
        listDouble.add(100.09);
        listDouble.add(200.89);
        listDouble.add(10.80);
        listDouble.add(11.67);
        listDouble.add(45.8976);
        listDouble.add(78.975);

        // Print
        System.out.println("Count elements in list String: " + count(listString));
        System.out.println("Count elements in list Integer: " + count(listInteger));
        System.out.println("Count elements in list Double: " + count(listDouble));

    }
}