
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
        listString.add("This");
        listString.add("is");
        listString.add("my");
        listString.add("best");
        listString.add("World");

        // Add list Integer
        ArrayList<Object> listInteger = new ArrayList<Object>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);

        // Add list double
        ArrayList<Object> listDouble = new ArrayList<Object>();
        listDouble.add(1.11);
        listDouble.add(2.22);
        listDouble.add(7.87);
        listDouble.add(9.203);
        listDouble.add(100.23);
        listDouble.add(789.987);
        listDouble.add(1231.322);
        listDouble.add(0.1234);

        // Print
        System.out.println("Count elements in list String: " + count(listString));
        System.out.println("Count elements in list Integer: " + count(listInteger));
        System.out.println("Count elements in list Double: " + count(listDouble));

    }
}