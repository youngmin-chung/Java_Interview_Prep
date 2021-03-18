import java.util.Locale;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String s1 = "Madam";
        String s2 = "raceCar";
        String s3 = "aBba";
        String s4 = "swims";
        String s5 = "wifI";

        System.out.println(palindromeCheckerTraditional(s1));
        System.out.println(palindromeCheckerTraditional(s2));
        System.out.println(palindromeCheckerTraditional(s3));
        System.out.println(palindromeCheckerTraditional(s4));
        System.out.println(palindromeCheckerTraditional(s5));

        System.out.println();

        System.out.println(palindromeCheckerStreams(s1));
        System.out.println(palindromeCheckerStreams(s2));
        System.out.println(palindromeCheckerStreams(s3));
        System.out.println(palindromeCheckerStreams(s4));
        System.out.println(palindromeCheckerStreams(s5));

    }

    private static boolean palindromeCheckerStreams(String input) {
        String normalized = input.toLowerCase(Locale.ROOT);

        return IntStream.range(0, normalized.length() / 2)
                .allMatch(i -> normalized.charAt(i) == normalized.charAt(normalized.length()- i -1));
    }

    private static boolean palindromeCheckerTraditional(String input) {

        String normalized = input.toLowerCase();
        StringBuilder reversed = new StringBuilder();

        for (int i = normalized.length() - 1; i >= 0; i--){
            reversed.append(normalized.charAt(i));
        }
        return normalized.equals(reversed.toString());
    }
}
