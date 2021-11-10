// Casablanca’s hippodrome is organizing a new type of horse racing: duals. 
// During a dual, only two horses will participate in the race. In order for the race to be interesting, 
// it is necessary to try to select two horses with similar strength.
// Write a program which, using a given number of strengths, 
// identifies the two closest strengths and shows their difference with an integer (≥ 0).

import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        int smallest = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] < smallest) {
                smallest = nums[i] - nums[i - 1];
            }
        }
        System.out.println(smallest);
    }
}