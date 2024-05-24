package org.example.java8.map;

import java.util.*;
import java.util.stream.Collectors;

public class MapSorting {
    public static void main(String[] args) {

        Map<String,Integer> priceMap= new HashMap<>();
        priceMap.put("Apple",30);
        priceMap.put("Banana",50);
        priceMap.put("Orange",45);
        priceMap.put("Guava",90);
        priceMap.put("Dragon Fruit",44);

        // Print the HashMap using Streams
        priceMap.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + "- " + entry.getValue()));
        //sorting logic
       // sortMap(priceMap);

        LinkedHashMap<String, Integer> newMap = priceMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldvalue, newValue) -> oldvalue, LinkedHashMap::new));


        System.out.println("After Sorting....");
        newMap.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + "- " + entry.getValue()));

        //Get highest three value
        System.out.println("Highest three value...");
        newMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).forEach(entry -> System.out.println(entry.getKey() + "- " + entry.getValue()));

        System.out.println("Highest three key of value...");
        List<String> listOfFruit = newMap.entrySet().parallelStream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).map(entry -> entry.getKey()).toList();
        System.out.println(listOfFruit);
    }

    public static void sortMap(Map<String,Integer> priceMap)
    {
        priceMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (oldvalue,newValue)->oldvalue,LinkedHashMap::new));
    }
}
