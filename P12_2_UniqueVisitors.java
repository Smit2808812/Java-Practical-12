import java.util.*;

public class UniqueVisitors {

    public static void main(String[] args) {

        List<String> logins = List.of(
                "prince",
                "smit",
                "ayush",
                "prince",
                "smit",
                "riya",
                "ayush"
        );

        Set<String> unique = new HashSet<>(logins);

        Set<String> ordered = new LinkedHashSet<>(logins);

        System.out.println("Unique count: " + unique.size());

        System.out.println("First three distinct names:");

        int n = 0;

        for (String name : ordered) {

            if (n++ == 3) {
                break;
            }

            System.out.println(name);
        }
    }
}
