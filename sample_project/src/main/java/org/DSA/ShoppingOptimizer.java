package org.DSA;

import java.util.*;

/*You are going on a camping trip, but before you leave you need to buy groceries.
To optimize your time spent in the store, instead of buying the items from your shopping list in order,
you plan to buy everything you need from one department before moving to the next.
Given an unsorted list of products with their departments and a shopping list,
return the time saved in terms of the number of department visits eliminated.

Example:
products = [
 ["Cheese", "Dairy"],
 ["Carrots", "Produce"],
 ["Potatoes", "Produce"],
 ["Canned Tuna", "Pantry"],
 ["Romaine Lettuce", "Produce"],
 ["Chocolate Milk","Dairy"],
 ["Flour", "Pantry"],
 ["Iceberg Lettuce", "Produce"],
 ["Coffee", "Pantry"],
 ["Pasta", "Pantry"],
 ["Milk", "Dairy"],
 ["Blueberries", "Produce"],
 ["Pasta Sauce", "Pantry"]
]


list1 = ["Blueberries", "Milk", "Coffee", "Flour", "Cheese", "Carrots"]

For example, buying the items from list1 in order would take 5 department visits,
whereas your method would lead to only visiting 3 departments, a difference of 2 departments.

Produce(Blueberries)->Dairy(Milk)->Pantry(Coffee/Flour)->Dairy(Cheese)->Produce(Carrots) = 5 department visits
New: Produce(Blueberries/Carrots)->Pantry(Coffee/Flour)->Dairy(Milk/Cheese) = 3 department visits

list2 = ["Blueberries", "Carrots", "Coffee", "Milk", "Flour", "Cheese"] => 2
list3 = ["Blueberries", "Carrots", "Romaine Lettuce", "Iceberg Lettuce"] => 0
list4 = ["Milk", "Flour", "Chocolate Milk", "Pasta Sauce"] => 2
list5 = ["Cheese", "Potatoes", "Blueberries", "Canned Tuna"] => 0

list5 = ["Cheese", "Potatoes", "Blueberries", "Canned Tuna"] => 0
Dairy -> produce, produce -> Pantry = 3 - 3 = 0

list4 = ["Milk", "Flour", "Chocolate Milk", "Pasta Sauce"] => 2
Dairy -> Pantry -> Dairy -> Pantry = 4
Dairy (milk, chocolate milk) -> Dairy(Flour, pasta sauce) = 2
4-2= 2

All Test Cases:
shopping(products, list1) => 2
shopping(products, list2) => 2
shopping(products, list3) => 0
shopping(products, list4) => 2
shopping(products, list5) => 0 */
public class ShoppingOptimizer {

    private static int shopping(List<String[]> products, List<String> shoppingList) {
        Map<String, String> productMap =  new HashMap<>();
        for (String[] p : products) {
            if (p != null && p.length >= 2 && p[0] != null && p[1] != null) {
                productMap.put(p[0],p[1]);
            }
        }
        System.out.println("Product map "+productMap);
        List<String> deptSeq = new ArrayList<>(shoppingList.size());
        for(String item : shoppingList){
            String d = productMap.get(item);
            if(d == null){
                continue;
            }
            deptSeq.add(d);
        }
        System.out.println(deptSeq);
        int originalVists = 1;
        for(int i = 1 ; i < deptSeq.size() ; i++){
            if(!deptSeq.get(i).equals(deptSeq.get(i - 1))){
                originalVists++;
            }
        }

        int optimizedVisits = new HashSet<>(deptSeq).size();


        return originalVists - optimizedVisits;
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
        List<String> list2 = Arrays.asList("Blueberries", "Carrots", "Coffee", "Milk", "Flour", "Cheese");
        List<String> list3 = Arrays.asList("Blueberries", "Carrots", "Romaine Lettuce", "Iceberg Lettuce");
        List<String> list4 = Arrays.asList("Milk", "Flour", "Chocolate Milk", "Pasta Sauce");
        List<String> list5 = Arrays.asList("Cheese", "Potatoes", "Blueberries", "Canned Tuna");
        shopping(products, list1);
        System.out.println("shopping(products, list1) => " + shopping(products, list1)); // 2
        System.out.println("shopping(products, list2) => " + shopping(products, list2)); // 2
        System.out.println("shopping(products, list3) => " + shopping(products, list3)); // 0
        System.out.println("shopping(products, list4) => " + shopping(products, list4)); // 2
        System.out.println("shopping(products, list5) => " + shopping(products, list5));

    }


}
