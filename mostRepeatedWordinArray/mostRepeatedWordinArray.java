/*
 * Find most repeated word
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

   public static void main(String[] args) {
       String testString = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
       findMostRepeatedWord(testString);

       System.out.println();
       String testString2 = "Penguins are aquatic, flightless birds that are highly adapted to life in the water. Their distinct tuxedo-like appearance is called countershading, a form of camouflage that helps keep them safe in the water. Penguins do have wing-bones, though they are flipper-like and extremely suited to swimming. Penguins are found almost exclusively in the southern hemisphere, where they catch their food underwater and raise their young on land.";
       findMostRepeatedWord(testString2);

       System.out.println();
       String testString3 = "Students seek relief from rising prices through the purchase of used copies of textbooks, which tend to be less expensive. Most college bookstores offer used copies of textbooks at lower prices. Most bookstores will also buy used copies back from students at the end of a term if the book is going to be re-used at the school. Books that are not being re-used at the school are often purchased by an off-campus wholesaler for 0-30% of the new cost, for distribution to other bookstores where the books will be sold. Textbook companies have countered this by encouraging faculty to assign homework that must be done on the publisher's website. If a student has a new textbook, then he or she can use the pass code in the book to register on the site. If the student has purchased a used textbook, then he or she must pay money directly to the publisher in order to access the website and complete assigned homework. ";
       findMostRepeatedWord(testString3);

    }
    // Time complexity : O event, because it's iterated through an input a constant number of times.
    private static String findMostRepeatedWord(String testString) {
        List<String> uncommonWords =  convertToUncommonWords(testString);

        if (uncommonWords.size() == 0) {
            System.out.println("No unique words in input");
            return "";
        }

        HashMap<String, Integer> wordCountMap = new HashMap();
        for (String word : uncommonWords) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        int max = 0;
        String mostRepeatedWord = "";
        for (String key : wordCountMap.keySet()) {
            int currentValue = wordCountMap.get(key);
            if (currentValue > max) {
                mostRepeatedWord = key;
                max = currentValue;
            }
        }

        System.out.println("Most repeated word: " + mostRepeatedWord +
                "\nRepeated: " + max + " times");
        return mostRepeatedWord;
    }

    private static List<String> convertToUncommonWords(String testString) {
        String lowercased = testString.toLowerCase().trim();
        String[] words = lowercased.split("[ \\n\\t\\r.,;:!?(){]");

        List commonWords = List.of("the", "a", "or", "an", "it", "and",
                "but", "is", "are", "of", "on", "to", "was", "were", "in",
                "that", "i", "your", "his", "their", "her", "you", "me",
                "they", "at", "be");

        return Arrays.stream(words)
                .filter(word ->
                        !commonWords.contains(word) && word.length() != 0)
                .collect(Collectors.toList());
    }
}