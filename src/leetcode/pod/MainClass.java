package leetcode.pod;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        //int[][] grid={{1,3,},{2,2}};
        int[][] grid={{9,1,7},{8,9,2},{3,4,6}};
       Arrays.stream(March062025.findMissingAndRepeatedValues(grid)).boxed().forEach(System.out::println);
    }
}
