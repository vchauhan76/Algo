package Company;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {

    public static void main(String[] args) {

        Map<String, String> mapSort = new HashMap<>();

        mapSort.put("one","onevalue");
        mapSort.put("two","twovalue");
        mapSort.put("three","threevalue");

        mapSort.entrySet()
                .stream()
                .sorted(Map.Entry.<String, String>comparingByValue())
                .forEach(System.out::println);

        mapSort.entrySet()
                .stream()
                .sorted(Map.Entry.<String, String>comparingByValue())
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));








    }
}
