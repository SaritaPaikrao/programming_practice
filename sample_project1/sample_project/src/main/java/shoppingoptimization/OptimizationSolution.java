package shoppingoptimization;

import java.util.*;

public class OptimizationSolution {
        public static void main(String[] arg) {
            String[][] products = {
                    {"Cheese", "Dairy"},
                    {"Carrots", "Produce"},
                    {"Potatoes", "Produce"},
                    {"Canned Tuna", "Pantry"},
                    {"Romaine Lettuce", "Produce"},
                    {"Chocolate Milk", "Dairy"},
                    {"Flour", "Pantry"},
                    {"Iceberg Lettuce", "Produce"},
                    {"Coffee", "Pantry"},
                    {"Pasta", "Pantry"},
                    {"Milk", "Dairy"},
                    {"Blueberries", "Produce"},
                    {"Pasta Sauce", "Pantry"}
            };

            String[] list1 = {"Blueberries", "Milk", "Coffee", "Flour", "Cheese", "Carrots"};
            String[] list2 = {"Blueberries", "Carrots", "Coffee", "Milk", "Flour", "Cheese"};
            String[] list3 = {"Blueberries", "Carrots", "Romaine Lettuce", "Iceberg Lettuce"};
            String[] list4 = {"Milk", "Flour", "Chocolate Milk", "Pasta Sauce"};
            String[] list5 = {"Cheese", "Potatoes", "Blueberries", "Canned Tuna"};
            int difference = getDifference(products,list1);
            System.out.println("Optimized Visit === "+difference);
        }

    private static int getDifference(String[][] products, String[] list1) {
        HashMap<String, String> productAndDepartment = new HashMap<>();
        for(String[] item: products){
            productAndDepartment.put(item[0], item[1]);
        }
        productAndDepartment.entrySet().stream().forEach(System.out::println);

        List<String> departmentSequence = new ArrayList<>();
        for(String str:Arrays.asList(list1)){
            departmentSequence.add(productAndDepartment.get(str));
        }
        departmentSequence.stream().forEach(System.out::println);

        int originalVisits=1;
        for(int i=1; i<departmentSequence.size(); i++){
            if(!departmentSequence.get(i).equals(departmentSequence.get(i-1))){
                originalVisits++;
            }
        }

        HashSet<String> uniqueDepartment = new HashSet<String>(departmentSequence);
        int optimizedVisit=uniqueDepartment.size();


        return originalVisits - optimizedVisit;
    }
}
