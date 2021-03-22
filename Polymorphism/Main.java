/*
 * Polymorphism for technical interview
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void addRandomNumber(ArrayList<Integer> list){
        int size = list.size();
        do {
            int randomNumber = new Random().nextInt() % 100;
            System.out.println("Adding random number " + randomNumber);
            list.add(randomNumber);
        }while(size >= list.size());

    }

    public static void main(String[] args) {
        NonNegativeArrayList nonNegativeArrayList = new NonNegativeArrayList(-10, 2, 3, -2, 0);

        // runtime polymorphism
        // ArrayList<Integer> nonNegativeArrayList = new NonNegativeArrayList(-10, 2, 3, -2, 0);

        nonNegativeArrayList.add(-1);
        nonNegativeArrayList.add(9);
        System.out.println(nonNegativeArrayList);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-17);
        arrayList.add(11);
        arrayList.add(-5);

        System.out.println(arrayList);

        addRandomNumber(nonNegativeArrayList);
        addRandomNumber(arrayList);

        System.out.println(nonNegativeArrayList);
        System.out.println(arrayList);
    }

}