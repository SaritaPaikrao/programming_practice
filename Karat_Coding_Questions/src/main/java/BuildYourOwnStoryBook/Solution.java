package BuildYourOwnStoryBook;

import static BuildYourOwnStoryBook.Main.stories;

public class Solution {
    public static void main(String[] argv) {

        int[] endings1 = {6, 15, 21, 30};
        int[][] choices1_1 = {
                {3, 7, 8},
                {9, 4, 2},
        };
        int[][] choices1_2 = {
                {3, 14, 2},
        };
        int[][] choices1_3 = {
                {5, 11, 28},
                {9, 19, 29},
                {14, 16, 20},
                {18, 7, 22},
                {25, 6, 30},
        };
        int[][] choices1_4 = {
                {2, 10, 15},
                {3, 4, 10},
                {4, 3, 15},
                {10, 3, 15},
        };

        int[] endings2 = {11};
        int[][] choices2_1 = {
                {2, 3, 4},
                {5, 10, 2},
        };
        int[][] choices2_2 = {};

        int[] endings3 = {4, 11};
        int[][] choices3_1 = {
                {10, 6, 8},
        };

        int[] endings4 = {20};
        int[][] choices4_1 = {
                {2, 6, 3},
                {3, 1, 4},
                {4, 10, 5},
                {6, 3, 7}
        };
        stories(endings4, choices4_1, 1);

    }
}
