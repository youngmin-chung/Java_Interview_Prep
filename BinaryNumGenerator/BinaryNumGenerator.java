import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

   public static void main(String[] args) {
       printBinary(6);
       printBinary(-9);
       printBinary(0);
       printBinary(2);
       printBinary(10);

       printBinaryUsingQueue(6);
       printBinaryUsingQueue(-9);
       printBinaryUsingQueue(0);
       printBinaryUsingQueue(2);
       printBinaryUsingQueue(10);

    }

    private static void printBinaryUsingQueue(int input) {
       if(input <= 0){
           System.out.println("Nothing to print\n");
           return;
       }

       Queue<Integer> queue = new LinkedList<>();
       queue.add(1);

       for (int i = 1; i<=input; i++){
           Integer current = queue.remove();
           System.out.println(current);

           queue.add(current * 10);
           queue.add(current * 10 + 1);
       }

       System.out.println();
    }

    // Using toBinaryString()
    private static void printBinary(int input) {
       if(input <=0){
           System.out.println("Nothing to print\n");
           return;
       }

       for (int i = 0; i <= input; i++){
           System.out.println(Integer.toBinaryString(i));
       }

       System.out.println();
    }
}
