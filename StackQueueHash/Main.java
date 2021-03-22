import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

   public static void main(String[] args) {
       // Stack
       System.out.println("Leveraging stacks as a data structure");
       Stack<String> deckOfCards = new Stack<>();

        String card1 = "Jack : Diamonds";
        String card2 = "8 : Hearts";
        String card3 = "3 : Clubs";

        deckOfCards.push(card1);
        deckOfCards.push(card2);
        deckOfCards.push(card3);

        System.out.println(deckOfCards);

        // See what's on top w/o removal
        String top = deckOfCards.peek();
        System.out.println("Top: " + top);

       // See size
       System.out.println("Size of Stack: " + deckOfCards.size());
       System.out.println();

       // Remove
       while(!deckOfCards.isEmpty()){
           String removedItem = deckOfCards.pop();
           System.out.println("Removed " + removedItem);
       }

       // Queue
       System.out.println("\n\nUsing queues in technical interviews");
       Queue<String> queue = new LinkedList<>();

       queue.add("Sam");
       queue.add("Anna");
       queue.add("Heidi");
       queue.add("Sally");
       queue.add("Charlotte");

       System.out.println(queue);

       System.out.println("Next up! " + queue.peek());

       while(queue.isEmpty()){
           String removed = queue.remove();
           System.out.println(removed);
       }

       // Hash Maps
       System.out.println("\n\nMastering hash-based structures");
       HashMap<String, Integer> wordToNum = new HashMap<>();

       // Insert key-and-value pairs into the hashmap
       wordToNum.put("ONE", 1);
       wordToNum.put("TWO", 2);
       wordToNum.put("THREE", 3);
       wordToNum.put("FOUR", 4);
       wordToNum.put("FIVE", 5);

       // Retrieve elements
       System.out.println("Retrieve element: " + wordToNum.get("THREE"));

       // List values and keys
       System.out.println(wordToNum.values());
       System.out.println(wordToNum.keySet());

       // Remove element
       System.out.println(wordToNum.remove("FOUR"));
    }
}
