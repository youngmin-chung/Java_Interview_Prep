import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String s1 = "HellO";
        String s2 = " there is a quiet Mouse";
        String s3 = "I am happy     ";

        findNumberOfVowelsAndConsonants(s1);
        findNumberOfVowelsAndConsonants(s2);
        findNumberOfVowelsAndConsonants(s3);

        System.out.println();

        findNumberOfVowelsAndConsonantsStreams(s1);
        findNumberOfVowelsAndConsonantsStreams(s2);
        findNumberOfVowelsAndConsonantsStreams(s3);

    }

    private static void findNumberOfVowelsAndConsonants(String input) {
        int vowelCount = 0;
        int consonantCount = 0;

        String vowels = "aeiouy";
        String normalized = input.toLowerCase(Locale.ROOT).trim();
        char[] normalizedArray = normalized.toCharArray();

        for (char c : normalizedArray){
            if(vowels.indexOf(c) != -1){
                vowelCount++;
            }
            else if (c != ' '){
                consonantCount++;
            }
        }

        System.out.println("There are " + vowelCount + " vowels in " + input);
        System.out.println("There are " + consonantCount + " consonants in " + input);
        System.out.println();

    }

    private static void findNumberOfVowelsAndConsonantsStreams(String input) {
        String vowels = "aeiouy";
        String normalized = input.toLowerCase(Locale.ROOT).trim();

        List<Integer> letters = normalized.chars().filter(Character::isAlphabetic).boxed().collect(Collectors.toList());

        long vowelCount = letters.stream().filter(c->vowels.indexOf(c) != -1).count();

        long consonantCount = letters.stream().count() - vowelCount;

        System.out.println("There are " + vowelCount + " vowels in " + input);
        System.out.println("There are " + consonantCount + " consonants in " + input);
        System.out.println();

    }

}
