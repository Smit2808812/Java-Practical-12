   import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {

        String text = "Java is easy and Java is powerful. Java supports object oriented programming.";

        Map<String, Integer> count = new HashMap<>();

        for (String word : text.toLowerCase()
                .replaceAll("[^a-z ]", " ")
                .trim()
                .split("\\s+")) {

            count.merge(word, 1, Integer::sum);
        }

        List<Map.Entry<String, Integer>> entries =
                new ArrayList<>(count.entrySet());

        entries.sort(
                Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey())
        );

        for (var e : entries) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
