/*
 * Polymorphism for technical interview
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet() {{
            add(1);
            add(-3);
            add(10);
            add(0);
        }};

        ArrayList<Integer> arrayList = new ArrayList<>() {{
            add(-17);
            add(11);
            add(48);
            add(-8);
            add(-5);
        }};

        List<Integer> hashNonNegativeList = new NonNegativeArrayList(
                hashSet);
        List<Integer> arrayNonNegativeList = new NonNegativeArrayList(
                arrayList);
        List<Integer> nonNegativeArrayList = new NonNegativeArrayList(
                -10, 2, 3, -2, 0);

        System.out.println(hashNonNegativeList);
        System.out.println(arrayNonNegativeList);
        System.out.println(nonNegativeArrayList);
    }

}