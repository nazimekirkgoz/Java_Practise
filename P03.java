package day08;

import java.util.Arrays;

public class P03 {
    public static void main(String[] args) {
        /*
        Summing the elements with the same index in a given 2-layer array in java and assigning
        these sums to a new single-layer array.
        input : int[][] arr = {{3,4,5}, {2,3,6,7}}; output: [5, 7, 11]

        Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
        olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        output: [5, 7, 11]

         */

        int[][] arr = {{2, 5, 9, 13, 65, 32, 12}, {18, 25, 41, 57}};


        int[] result = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[j] += arr[i][j];
            }
        }
        System.out.println(Arrays.toString(result));







    }
}



