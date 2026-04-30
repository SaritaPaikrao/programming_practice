package org.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample7 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //LocalDate
        map.put("Sarita", 5);
        map.put("Amit", 2);
        map.put("Priya", 8);

        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println(sortedMap);

    }
}
