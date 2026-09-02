package com.selenium.A2_javaInterviewEx.collectionsDataStructure;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class ConvertListToMapExample {

    static class Item {
        private int id;
        private String name;

        public Item(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public int getId() { return id; }
        public String getName() { return name; }
    }

    public class ListToMapExample {
        public static void main(String[] args) {
            List<Item> list = Arrays.asList(
                    new Item(1, "Apple"),
                    new Item(2, "Banana"),
                    new Item(3, "Orange")
            );

            // 1. Key: ID (Integer), Value: Name (String)
            Map<Integer, String> map1 = list.stream()
                    .collect(Collectors.toMap(Item::getId, Item::getName));

            // 2. Key: ID (Integer), Value: The Object itself (Item)
            Map<Integer, Item> map2 = list.stream()
                    .collect(Collectors.toMap(Item::getId, Function.identity()));
        }
    }

}
