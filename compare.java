import java.util.*;
public class compare{
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
            "hello", "world", "java", "programming",
            "language", "development", "coding", "software",
            "engineer", "technology"
        );

        Collections.sort(stringList, (a, b) -> {
            char lastA = a.charAt(a.length() - 1);
            char lastB = b.charAt(b.length() - 1);
            return Character.compare(lastA, lastB);
        });

        System.out.println("Sorted List (Alphabetical by Last Character): " + stringList);
    }
}

