/*
 * Inheritance for technical interview
 */

import java.util.List;
import java.util.ListIterator;

public class Main {

   public static void main(String[] args) {
    NonNegativeArrayList nonNegativeArrayList = new NonNegativeArrayList(-10, 2, 3, -2, 0);
    System.out.println(nonNegativeArrayList);

    nonNegativeArrayList.add(-1);
    nonNegativeArrayList.add(9);
    nonNegativeArrayList.addAll(List.of(-11, 12, 4));

    ListIterator<Integer> iterator = nonNegativeArrayList.listIterator();
    iterator.next();
    iterator.set(-19);

    nonNegativeArrayList.replaceAll(n -> n -1);
    System.out.println(nonNegativeArrayList);

   }

}