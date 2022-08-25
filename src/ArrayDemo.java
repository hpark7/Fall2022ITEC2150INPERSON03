import java.util.Arrays;

/**
 * class: ArrayDemo
 * course: ITEC 2150 - 03 Fall 2022
 * written by ITEC 2150 - 03 student group
 * date: August 25, 2022
 * description: This program will provide info how to print out 2-D array elements
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = { 1,2,3};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        int[][] twoDarr = {{ 1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(twoDarr));
        System.out.println(Arrays.deepToString(twoDarr));


    }
}
