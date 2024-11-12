import java.util.HashSet;

public class Has {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("hi");
        stringSet.add("hello");
        stringSet.add("Name");
        stringSet.add("Is");
        stringSet.add("Shreshti");
        stringSet.add("life");
        stringSet.add("coding");
        stringSet.add("create");
        stringSet.add("tell");
        stringSet.add("test");

        modifyAndPrint(stringSet);
    }

    public static void modifyAndPrint(HashSet<String> strings) {
        for (String s : strings) {
            String modifiedS = modifyString(s);
            System.out.println(modifiedS);
        }
    }

    public static String modifyString(String s) {
        if (s.length() == 1) {
            return s.toUpperCase();
        } else if (s.length() == 2) {
            return s.toUpperCase();
        } else {
            return s.substring(0, 1).toUpperCase() +
                   s.substring(1, s.length() - 2).toLowerCase() +
                   s.substring(s.length() - 2, s.length() - 1).toUpperCase() +
                   s.substring(s.length() - 1).toLowerCase();
        }
    }
}