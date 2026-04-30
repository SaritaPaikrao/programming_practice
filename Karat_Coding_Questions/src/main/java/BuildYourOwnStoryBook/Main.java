package BuildYourOwnStoryBook;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static int stories(int[] endings, int[][]choices, int option){

        Set<Integer> endingPgs = new HashSet<>();
        for(int e : endings){
            endingPgs.add(e);
        }

        Map<Integer, int[]> choiceMap = new HashMap<>();
        for (int[] c : choices){
            choiceMap.put(c[0], new int[]{c[1], c[2]});
        }
        int page = 1;
        Set<Integer> visitedPg = new HashSet<>();

        while(true){
            if(visitedPg.contains(page)){
                return -1;
            }
            visitedPg.add(page);

            if(endingPgs.contains(page)){
                return page;
            }

            if(choiceMap.containsKey(page)){
                int [] opts = choiceMap.get(page);
                page = (option == 1) ? opts[0] : opts[1];
            }else
                page++;
        }


    }

    public static void main(String[] args) {

        int[] endings1 = {6, 15, 21, 30};
        int[][] choices1_1 = {{3, 7, 8}, {9, 4, 2}};
        int[][] choices1_2 = {{3, 14, 2}};
        int[][] choices1_3 = {
                {5, 11, 28}, {9, 19, 29}, {14, 16, 20}, {18, 7, 22}, {25, 6, 30}
        };
        int[][] choices1_4 = {
                {2, 10, 15}, {3, 4, 10}, {4, 3, 15}, {10, 3, 15}
        };

        int[] endings2 = {11};
        int[][] choices2_1 = {{2, 3, 4}, {5, 10, 2}};
        int[][] choices2_2 = {};

        int[] endings3 = {4, 11};
        int[][] choices3_1 = {{10, 6, 8}};

        int[] endings4 = {20};
        int[][] choices4_1 = {{2,6,3}, {3,1,4}, {4,10,5}, {6,3,7}};

        System.out.println(stories(endings1, choices1_1, 1)); // 6
        System.out.println(stories(endings1, choices1_1, 2)); // -1
        System.out.println(stories(endings1, choices1_2, 1)); // 15
        System.out.println(stories(endings1, choices1_2, 2)); // -1
        System.out.println(stories(endings1, choices1_3, 1)); // 21
        System.out.println(stories(endings1, choices1_3, 2)); // 30
        System.out.println(stories(endings1, choices1_4, 1)); // -1
        System.out.println(stories(endings1, choices1_4, 2)); // 15
        System.out.println(stories(endings2, choices2_1, 1)); // 11
        System.out.println(stories(endings2, choices2_1, 2)); // -1
        System.out.println(stories(endings2, choices2_2, 1)); // 11
        System.out.println(stories(endings2, choices2_2, 2)); // 11
        System.out.println(stories(endings3, choices3_1, 1)); // 4
        System.out.println(stories(endings3, choices3_1, 2)); // 4
        System.out.println(stories(endings4, choices4_1, 1)); // -1
    }

}
