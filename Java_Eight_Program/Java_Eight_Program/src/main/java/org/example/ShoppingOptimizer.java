package org.example;

import java.util.*;

public class ShoppingOptimizer {

    public static int shopping(List<String[]> products, List<String> shoppingList) {
        // Map each product to its department
        Map<String, String> productToDepartment = new HashMap<>();
        for (String[] product : products) {
            productToDepartment.put(product[0], product[1]);
        }

        // Create a list of departments from the shopping list
        List<String> departmentSequence = new ArrayList<>();
        for (String item : shoppingList) {
            departmentSequence.add(productToDepartment.get(item));
        }

        // Count department switches in original order
        int originalVisits = 1;
        for (int i = 1; i < departmentSequence.size(); i++) {
            if (!departmentSequence.get(i).equals(departmentSequence.get(i - 1))) {
                originalVisits++;
            }
        }

        // Count unique departments
        Set<String> uniqueDepartments = new HashSet<>(departmentSequence);
        int optimizedVisits = uniqueDepartments.size();

        // Return time saved
        return originalVisits - optimizedVisits;
    }

    public static void main(String[] args) {
        List<String[]> products = Arrays.asList(
                new String[]{"Cheese", "Dairy"},
                new String[]{"Carrots", "Produce"},
                new String[]{"Potatoes", "Produce"},
                new String[]{"Canned Tuna", "Pantry"},
                new String[]{"Romaine Lettuce", "Produce"},
                new String[]{"Chocolate Milk", "Dairy"},
                new String[]{"Flour", "Pantry"},
                new String[]{"Iceberg Lettuce", "Produce"},
                new String[]{"Coffee", "Pantry"},
                new String[]{"Pasta", "Pantry"},
                new String[]{"Milk", "Dairy"},
                new String[]{"Blueberries", "Produce"},
                new String[]{"Pasta Sauce", "Pantry"}
        );

        List<String> list1 = Arrays.asList("Blueberries", "Milk", "Coffee", "Flour", "Cheese", "Carrots");
        System.out.println("Time saved: " + shopping(products, list1)); // Output: 2
    }
}

