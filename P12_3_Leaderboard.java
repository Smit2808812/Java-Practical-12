 import java.util.*;

public class Leaderboard {

    public static void main(String[] args) {

        Map<String, Integer> scores = Map.of(
                "Asha", 95,
                "Ravi", 88,
                "Neel", 95,
                "Mira", 76,
                "Kiran", 91
        );

        int topN = 3;

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(scores.entrySet());

        list.sort(
                Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey())
        );

        System.out.println("Top " + topN + ":");

        for (int i = 0; i < Math.min(topN, list.size()); i++) {

            System.out.println(
                    list.get(i).getKey() + " - "
                    + list.get(i).getValue()
            );
        }
    }
}
