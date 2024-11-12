import java.util.*;

public class sort {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList(
                "hello", "world", "java", "programming",
                "language", "development", "coding", "software",
                "engineer", "technology"
        ));

        Collections.sort(stringList, Collections.reverseOrder());

        System.out.println("Sorted List (Descending): " + stringList);
    }
}

